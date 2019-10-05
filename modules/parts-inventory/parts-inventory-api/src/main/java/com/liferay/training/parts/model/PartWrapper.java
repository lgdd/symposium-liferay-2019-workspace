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

package com.liferay.training.parts.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Part}.
 * </p>
 *
 * @author Joe Bloggs
 * @see Part
 * @generated
 */
@ProviderType
public class PartWrapper
	extends BaseModelWrapper<Part> implements Part, ModelWrapper<Part> {

	public PartWrapper(Part part) {
		super(part);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("partId", getPartId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("manufacturerId", getManufacturerId());
		attributes.put("name", getName());
		attributes.put("partNumber", getPartNumber());
		attributes.put("orderDate", getOrderDate());
		attributes.put("quantity", getQuantity());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userName", getUserName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long partId = (Long)attributes.get("partId");

		if (partId != null) {
			setPartId(partId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long manufacturerId = (Long)attributes.get("manufacturerId");

		if (manufacturerId != null) {
			setManufacturerId(manufacturerId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String partNumber = (String)attributes.get("partNumber");

		if (partNumber != null) {
			setPartNumber(partNumber);
		}

		Date orderDate = (Date)attributes.get("orderDate");

		if (orderDate != null) {
			setOrderDate(orderDate);
		}

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}
	}

	@Override
	public String[] getAvailableLanguageIds() {
		return model.getAvailableLanguageIds();
	}

	/**
	 * Returns the company ID of this part.
	 *
	 * @return the company ID of this part
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this part.
	 *
	 * @return the create date of this part
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	@Override
	public String getDefaultLanguageId() {
		return model.getDefaultLanguageId();
	}

	/**
	 * Returns the group ID of this part.
	 *
	 * @return the group ID of this part
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the manufacturer ID of this part.
	 *
	 * @return the manufacturer ID of this part
	 */
	@Override
	public long getManufacturerId() {
		return model.getManufacturerId();
	}

	/**
	 * Returns the modified date of this part.
	 *
	 * @return the modified date of this part
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this part.
	 *
	 * @return the name of this part
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the localized name of this part in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized name of this part
	 */
	@Override
	public String getName(java.util.Locale locale) {
		return model.getName(locale);
	}

	/**
	 * Returns the localized name of this part in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this part. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getName(java.util.Locale locale, boolean useDefault) {
		return model.getName(locale, useDefault);
	}

	/**
	 * Returns the localized name of this part in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized name of this part
	 */
	@Override
	public String getName(String languageId) {
		return model.getName(languageId);
	}

	/**
	 * Returns the localized name of this part in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this part
	 */
	@Override
	public String getName(String languageId, boolean useDefault) {
		return model.getName(languageId, useDefault);
	}

	@Override
	public String getNameCurrentLanguageId() {
		return model.getNameCurrentLanguageId();
	}

	@Override
	public String getNameCurrentValue() {
		return model.getNameCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized names of this part.
	 *
	 * @return the locales and localized names of this part
	 */
	@Override
	public Map<java.util.Locale, String> getNameMap() {
		return model.getNameMap();
	}

	/**
	 * Returns the order date of this part.
	 *
	 * @return the order date of this part
	 */
	@Override
	public Date getOrderDate() {
		return model.getOrderDate();
	}

	/**
	 * Returns the part ID of this part.
	 *
	 * @return the part ID of this part
	 */
	@Override
	public long getPartId() {
		return model.getPartId();
	}

	/**
	 * Returns the part number of this part.
	 *
	 * @return the part number of this part
	 */
	@Override
	public String getPartNumber() {
		return model.getPartNumber();
	}

	/**
	 * Returns the primary key of this part.
	 *
	 * @return the primary key of this part
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quantity of this part.
	 *
	 * @return the quantity of this part
	 */
	@Override
	public int getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the user ID of this part.
	 *
	 * @return the user ID of this part
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this part.
	 *
	 * @return the user name of this part
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this part.
	 *
	 * @return the user uuid of this part
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
			java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	/**
	 * Sets the company ID of this part.
	 *
	 * @param companyId the company ID of this part
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this part.
	 *
	 * @param createDate the create date of this part
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this part.
	 *
	 * @param groupId the group ID of this part
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the manufacturer ID of this part.
	 *
	 * @param manufacturerId the manufacturer ID of this part
	 */
	@Override
	public void setManufacturerId(long manufacturerId) {
		model.setManufacturerId(manufacturerId);
	}

	/**
	 * Sets the modified date of this part.
	 *
	 * @param modifiedDate the modified date of this part
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this part.
	 *
	 * @param name the name of this part
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the localized name of this part in the language.
	 *
	 * @param name the localized name of this part
	 * @param locale the locale of the language
	 */
	@Override
	public void setName(String name, java.util.Locale locale) {
		model.setName(name, locale);
	}

	/**
	 * Sets the localized name of this part in the language, and sets the default locale.
	 *
	 * @param name the localized name of this part
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setName(
		String name, java.util.Locale locale, java.util.Locale defaultLocale) {

		model.setName(name, locale, defaultLocale);
	}

	@Override
	public void setNameCurrentLanguageId(String languageId) {
		model.setNameCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized names of this part from the map of locales and localized names.
	 *
	 * @param nameMap the locales and localized names of this part
	 */
	@Override
	public void setNameMap(Map<java.util.Locale, String> nameMap) {
		model.setNameMap(nameMap);
	}

	/**
	 * Sets the localized names of this part from the map of locales and localized names, and sets the default locale.
	 *
	 * @param nameMap the locales and localized names of this part
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setNameMap(
		Map<java.util.Locale, String> nameMap, java.util.Locale defaultLocale) {

		model.setNameMap(nameMap, defaultLocale);
	}

	/**
	 * Sets the order date of this part.
	 *
	 * @param orderDate the order date of this part
	 */
	@Override
	public void setOrderDate(Date orderDate) {
		model.setOrderDate(orderDate);
	}

	/**
	 * Sets the part ID of this part.
	 *
	 * @param partId the part ID of this part
	 */
	@Override
	public void setPartId(long partId) {
		model.setPartId(partId);
	}

	/**
	 * Sets the part number of this part.
	 *
	 * @param partNumber the part number of this part
	 */
	@Override
	public void setPartNumber(String partNumber) {
		model.setPartNumber(partNumber);
	}

	/**
	 * Sets the primary key of this part.
	 *
	 * @param primaryKey the primary key of this part
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quantity of this part.
	 *
	 * @param quantity the quantity of this part
	 */
	@Override
	public void setQuantity(int quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the user ID of this part.
	 *
	 * @param userId the user ID of this part
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this part.
	 *
	 * @param userName the user name of this part
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this part.
	 *
	 * @param userUuid the user uuid of this part
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected PartWrapper wrap(Part part) {
		return new PartWrapper(part);
	}

}