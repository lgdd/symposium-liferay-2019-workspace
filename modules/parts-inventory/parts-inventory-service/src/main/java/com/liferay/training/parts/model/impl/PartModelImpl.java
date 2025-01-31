/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.parts.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.training.parts.model.Part;
import com.liferay.training.parts.model.PartModel;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the Part service. Represents a row in the &quot;Inventory_Part&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>PartModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PartImpl}.
 * </p>
 *
 * @author Joe Bloggs
 * @see PartImpl
 * @generated
 */
@ProviderType
public class PartModelImpl extends BaseModelImpl<Part> implements PartModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a part model instance should use the <code>Part</code> interface instead.
	 */
	public static final String TABLE_NAME = "Inventory_Part";

	public static final Object[][] TABLE_COLUMNS = {
		{"partId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"manufacturerId", Types.BIGINT}, {"name", Types.VARCHAR},
		{"partNumber", Types.VARCHAR}, {"orderDate", Types.TIMESTAMP},
		{"quantity", Types.INTEGER}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"userName", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("partId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("manufacturerId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("partNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("orderDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("quantity", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Inventory_Part (partId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,manufacturerId LONG,name STRING null,partNumber VARCHAR(75) null,orderDate DATE null,quantity INTEGER,createDate DATE null,modifiedDate DATE null,userName VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table Inventory_Part";

	public static final String ORDER_BY_JPQL = " ORDER BY part.name ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Inventory_Part.name ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long GROUPID_COLUMN_BITMASK = 1L;

	public static final long MANUFACTURERID_COLUMN_BITMASK = 2L;

	public static final long NAME_COLUMN_BITMASK = 4L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	public PartModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _partId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPartId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _partId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Part.class;
	}

	@Override
	public String getModelClassName() {
		return Part.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Part, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Part, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Part, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Part)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Part, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Part, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Part)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Part, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Part, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Part>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Part.class.getClassLoader(), Part.class, ModelWrapper.class);

		try {
			Constructor<Part> constructor =
				(Constructor<Part>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<Part, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Part, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Part, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Part, Object>>();
		Map<String, BiConsumer<Part, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Part, ?>>();

		attributeGetterFunctions.put("partId", Part::getPartId);
		attributeSetterBiConsumers.put(
			"partId", (BiConsumer<Part, Long>)Part::setPartId);
		attributeGetterFunctions.put("companyId", Part::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Part, Long>)Part::setCompanyId);
		attributeGetterFunctions.put("groupId", Part::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Part, Long>)Part::setGroupId);
		attributeGetterFunctions.put("userId", Part::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Part, Long>)Part::setUserId);
		attributeGetterFunctions.put("manufacturerId", Part::getManufacturerId);
		attributeSetterBiConsumers.put(
			"manufacturerId", (BiConsumer<Part, Long>)Part::setManufacturerId);
		attributeGetterFunctions.put("name", Part::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<Part, String>)Part::setName);
		attributeGetterFunctions.put("partNumber", Part::getPartNumber);
		attributeSetterBiConsumers.put(
			"partNumber", (BiConsumer<Part, String>)Part::setPartNumber);
		attributeGetterFunctions.put("orderDate", Part::getOrderDate);
		attributeSetterBiConsumers.put(
			"orderDate", (BiConsumer<Part, Date>)Part::setOrderDate);
		attributeGetterFunctions.put("quantity", Part::getQuantity);
		attributeSetterBiConsumers.put(
			"quantity", (BiConsumer<Part, Integer>)Part::setQuantity);
		attributeGetterFunctions.put("createDate", Part::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Part, Date>)Part::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Part::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<Part, Date>)Part::setModifiedDate);
		attributeGetterFunctions.put("userName", Part::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Part, String>)Part::setUserName);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getPartId() {
		return _partId;
	}

	@Override
	public void setPartId(long partId) {
		_partId = partId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public long getManufacturerId() {
		return _manufacturerId;
	}

	@Override
	public void setManufacturerId(long manufacturerId) {
		_columnBitmask |= MANUFACTURERID_COLUMN_BITMASK;

		if (!_setOriginalManufacturerId) {
			_setOriginalManufacturerId = true;

			_originalManufacturerId = _manufacturerId;
		}

		_manufacturerId = manufacturerId;
	}

	public long getOriginalManufacturerId() {
		return _originalManufacturerId;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public String getName(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getName(languageId);
	}

	@Override
	public String getName(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getName(languageId, useDefault);
	}

	@Override
	public String getName(String languageId) {
		return LocalizationUtil.getLocalization(getName(), languageId);
	}

	@Override
	public String getName(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(
			getName(), languageId, useDefault);
	}

	@Override
	public String getNameCurrentLanguageId() {
		return _nameCurrentLanguageId;
	}

	@JSON
	@Override
	public String getNameCurrentValue() {
		Locale locale = getLocale(_nameCurrentLanguageId);

		return getName(locale);
	}

	@Override
	public Map<Locale, String> getNameMap() {
		return LocalizationUtil.getLocalizationMap(getName());
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		_name = name;
	}

	@Override
	public void setName(String name, Locale locale) {
		setName(name, locale, LocaleUtil.getSiteDefault());
	}

	@Override
	public void setName(String name, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(name)) {
			setName(
				LocalizationUtil.updateLocalization(
					getName(), "Name", name, languageId, defaultLanguageId));
		}
		else {
			setName(
				LocalizationUtil.removeLocalization(
					getName(), "Name", languageId));
		}
	}

	@Override
	public void setNameCurrentLanguageId(String languageId) {
		_nameCurrentLanguageId = languageId;
	}

	@Override
	public void setNameMap(Map<Locale, String> nameMap) {
		setNameMap(nameMap, LocaleUtil.getSiteDefault());
	}

	@Override
	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale) {
		if (nameMap == null) {
			return;
		}

		setName(
			LocalizationUtil.updateLocalization(
				nameMap, getName(), "Name",
				LocaleUtil.toLanguageId(defaultLocale)));
	}

	@Override
	public String getPartNumber() {
		if (_partNumber == null) {
			return "";
		}
		else {
			return _partNumber;
		}
	}

	@Override
	public void setPartNumber(String partNumber) {
		_partNumber = partNumber;
	}

	@Override
	public Date getOrderDate() {
		return _orderDate;
	}

	@Override
	public void setOrderDate(Date orderDate) {
		_orderDate = orderDate;
	}

	@Override
	public int getQuantity() {
		return _quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		_quantity = quantity;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Part.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> nameMap = getNameMap();

		for (Map.Entry<Locale, String> entry : nameMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		return availableLanguageIds.toArray(
			new String[availableLanguageIds.size()]);
	}

	@Override
	public String getDefaultLanguageId() {
		String xml = getName();

		if (xml == null) {
			return "";
		}

		Locale defaultLocale = LocaleUtil.getSiteDefault();

		return LocalizationUtil.getDefaultLanguageId(xml, defaultLocale);
	}

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException {
		Locale defaultLocale = LocaleUtil.fromLanguageId(
			getDefaultLanguageId());

		Locale[] availableLocales = LocaleUtil.fromLanguageIds(
			getAvailableLanguageIds());

		Locale defaultImportLocale = LocalizationUtil.getDefaultImportLocale(
			Part.class.getName(), getPrimaryKey(), defaultLocale,
			availableLocales);

		prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {

		Locale defaultLocale = LocaleUtil.getSiteDefault();

		String modelDefaultLanguageId = getDefaultLanguageId();

		String name = getName(defaultLocale);

		if (Validator.isNull(name)) {
			setName(getName(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setName(getName(defaultLocale), defaultLocale, defaultLocale);
		}
	}

	@Override
	public Part toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Part>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PartImpl partImpl = new PartImpl();

		partImpl.setPartId(getPartId());
		partImpl.setCompanyId(getCompanyId());
		partImpl.setGroupId(getGroupId());
		partImpl.setUserId(getUserId());
		partImpl.setManufacturerId(getManufacturerId());
		partImpl.setName(getName());
		partImpl.setPartNumber(getPartNumber());
		partImpl.setOrderDate(getOrderDate());
		partImpl.setQuantity(getQuantity());
		partImpl.setCreateDate(getCreateDate());
		partImpl.setModifiedDate(getModifiedDate());
		partImpl.setUserName(getUserName());

		partImpl.resetOriginalValues();

		return partImpl;
	}

	@Override
	public int compareTo(Part part) {
		int value = 0;

		value = getName().compareTo(part.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Part)) {
			return false;
		}

		Part part = (Part)obj;

		long primaryKey = part.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		PartModelImpl partModelImpl = this;

		partModelImpl._originalGroupId = partModelImpl._groupId;

		partModelImpl._setOriginalGroupId = false;

		partModelImpl._originalManufacturerId = partModelImpl._manufacturerId;

		partModelImpl._setOriginalManufacturerId = false;

		partModelImpl._setModifiedDate = false;

		partModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Part> toCacheModel() {
		PartCacheModel partCacheModel = new PartCacheModel();

		partCacheModel.partId = getPartId();

		partCacheModel.companyId = getCompanyId();

		partCacheModel.groupId = getGroupId();

		partCacheModel.userId = getUserId();

		partCacheModel.manufacturerId = getManufacturerId();

		partCacheModel.name = getName();

		String name = partCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			partCacheModel.name = null;
		}

		partCacheModel.partNumber = getPartNumber();

		String partNumber = partCacheModel.partNumber;

		if ((partNumber != null) && (partNumber.length() == 0)) {
			partCacheModel.partNumber = null;
		}

		Date orderDate = getOrderDate();

		if (orderDate != null) {
			partCacheModel.orderDate = orderDate.getTime();
		}
		else {
			partCacheModel.orderDate = Long.MIN_VALUE;
		}

		partCacheModel.quantity = getQuantity();

		Date createDate = getCreateDate();

		if (createDate != null) {
			partCacheModel.createDate = createDate.getTime();
		}
		else {
			partCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			partCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			partCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		partCacheModel.userName = getUserName();

		String userName = partCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			partCacheModel.userName = null;
		}

		return partCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Part, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Part, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Part, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Part)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Part, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Part, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Part, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Part)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Part>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _partId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private long _manufacturerId;
	private long _originalManufacturerId;
	private boolean _setOriginalManufacturerId;
	private String _name;
	private String _nameCurrentLanguageId;
	private String _partNumber;
	private Date _orderDate;
	private int _quantity;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _userName;
	private long _columnBitmask;
	private Part _escapedModel;

}