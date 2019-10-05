/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.training.parts.model;

import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import com.liferay.expando.kernel.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the Part service. Represents a row in the &quot;Inventory_Part&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.training.parts.model.impl.PartModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.training.parts.model.impl.PartImpl}.
 * </p>
 *
 * @author Joe Bloggs
 * @see Part
 * @see com.liferay.training.parts.model.impl.PartImpl
 * @see com.liferay.training.parts.model.impl.PartModelImpl
 * @generated
 */
public interface PartModel extends BaseModel<Part>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a part model instance should use the {@link Part} interface instead.
	 */

	/**
	 * Returns the primary key of this part.
	 *
	 * @return the primary key of this part
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this part.
	 *
	 * @param primaryKey the primary key of this part
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the part ID of this part.
	 *
	 * @return the part ID of this part
	 */
	public long getPartId();

	/**
	 * Sets the part ID of this part.
	 *
	 * @param partId the part ID of this part
	 */
	public void setPartId(long partId);

	/**
	 * Returns the company ID of this part.
	 *
	 * @return the company ID of this part
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this part.
	 *
	 * @param companyId the company ID of this part
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this part.
	 *
	 * @return the group ID of this part
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this part.
	 *
	 * @param groupId the group ID of this part
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this part.
	 *
	 * @return the user ID of this part
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this part.
	 *
	 * @param userId the user ID of this part
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this part.
	 *
	 * @return the user uuid of this part
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this part.
	 *
	 * @param userUuid the user uuid of this part
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the manufacturer ID of this part.
	 *
	 * @return the manufacturer ID of this part
	 */
	public long getManufacturerId();

	/**
	 * Sets the manufacturer ID of this part.
	 *
	 * @param manufacturerId the manufacturer ID of this part
	 */
	public void setManufacturerId(long manufacturerId);

	/**
	 * Returns the name of this part.
	 *
	 * @return the name of this part
	 */
	public String getName();

	/**
	 * Returns the localized name of this part in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized name of this part
	 */
	@AutoEscape
	public String getName(Locale locale);

	/**
	 * Returns the localized name of this part in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this part. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized name of this part in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized name of this part
	 */
	@AutoEscape
	public String getName(String languageId);

	/**
	 * Returns the localized name of this part in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this part
	 */
	@AutoEscape
	public String getName(String languageId, boolean useDefault);

	@AutoEscape
	public String getNameCurrentLanguageId();

	@AutoEscape
	public String getNameCurrentValue();

	/**
	 * Returns a map of the locales and localized names of this part.
	 *
	 * @return the locales and localized names of this part
	 */
	public Map<Locale, String> getNameMap();

	/**
	 * Sets the name of this part.
	 *
	 * @param name the name of this part
	 */
	public void setName(String name);

	/**
	 * Sets the localized name of this part in the language.
	 *
	 * @param name the localized name of this part
	 * @param locale the locale of the language
	 */
	public void setName(String name, Locale locale);

	/**
	 * Sets the localized name of this part in the language, and sets the default locale.
	 *
	 * @param name the localized name of this part
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setName(String name, Locale locale, Locale defaultLocale);

	public void setNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized names of this part from the map of locales and localized names.
	 *
	 * @param nameMap the locales and localized names of this part
	 */
	public void setNameMap(Map<Locale, String> nameMap);

	/**
	 * Sets the localized names of this part from the map of locales and localized names, and sets the default locale.
	 *
	 * @param nameMap the locales and localized names of this part
	 * @param defaultLocale the default locale
	 */
	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale);

	/**
	 * Returns the part number of this part.
	 *
	 * @return the part number of this part
	 */
	@AutoEscape
	public String getPartNumber();

	/**
	 * Sets the part number of this part.
	 *
	 * @param partNumber the part number of this part
	 */
	public void setPartNumber(String partNumber);

	/**
	 * Returns the order date of this part.
	 *
	 * @return the order date of this part
	 */
	public Date getOrderDate();

	/**
	 * Sets the order date of this part.
	 *
	 * @param orderDate the order date of this part
	 */
	public void setOrderDate(Date orderDate);

	/**
	 * Returns the quantity of this part.
	 *
	 * @return the quantity of this part
	 */
	public int getQuantity();

	/**
	 * Sets the quantity of this part.
	 *
	 * @param quantity the quantity of this part
	 */
	public void setQuantity(int quantity);

	/**
	 * Returns the create date of this part.
	 *
	 * @return the create date of this part
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this part.
	 *
	 * @param createDate the create date of this part
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this part.
	 *
	 * @return the modified date of this part
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this part.
	 *
	 * @param modifiedDate the modified date of this part
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user name of this part.
	 *
	 * @return the user name of this part
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this part.
	 *
	 * @param userName the user name of this part
	 */
	@Override
	public void setUserName(String userName);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public String[] getAvailableLanguageIds();

	public String getDefaultLanguageId();

	public void prepareLocalizedFieldsForImport() throws LocaleException;

	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

	@Override
	public Object clone();

	@Override
	public int compareTo(Part part);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Part> toCacheModel();

	@Override
	public Part toEscapedModel();

	@Override
	public Part toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
