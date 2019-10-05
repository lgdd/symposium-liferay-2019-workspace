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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Manufacturer service. Represents a row in the &quot;Inventory_Manufacturer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.training.parts.model.impl.ManufacturerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.training.parts.model.impl.ManufacturerImpl}.
 * </p>
 *
 * @author Joe Bloggs
 * @see Manufacturer
 * @see com.liferay.training.parts.model.impl.ManufacturerImpl
 * @see com.liferay.training.parts.model.impl.ManufacturerModelImpl
 * @generated
 */
public interface ManufacturerModel extends BaseModel<Manufacturer>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a manufacturer model instance should use the {@link Manufacturer} interface instead.
	 */

	/**
	 * Returns the primary key of this manufacturer.
	 *
	 * @return the primary key of this manufacturer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this manufacturer.
	 *
	 * @param primaryKey the primary key of this manufacturer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the manufacturer ID of this manufacturer.
	 *
	 * @return the manufacturer ID of this manufacturer
	 */
	public long getManufacturerId();

	/**
	 * Sets the manufacturer ID of this manufacturer.
	 *
	 * @param manufacturerId the manufacturer ID of this manufacturer
	 */
	public void setManufacturerId(long manufacturerId);

	/**
	 * Returns the company ID of this manufacturer.
	 *
	 * @return the company ID of this manufacturer
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this manufacturer.
	 *
	 * @param companyId the company ID of this manufacturer
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this manufacturer.
	 *
	 * @return the group ID of this manufacturer
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this manufacturer.
	 *
	 * @param groupId the group ID of this manufacturer
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this manufacturer.
	 *
	 * @return the user ID of this manufacturer
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this manufacturer.
	 *
	 * @param userId the user ID of this manufacturer
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this manufacturer.
	 *
	 * @return the user uuid of this manufacturer
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this manufacturer.
	 *
	 * @param userUuid the user uuid of this manufacturer
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the name of this manufacturer.
	 *
	 * @return the name of this manufacturer
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this manufacturer.
	 *
	 * @param name the name of this manufacturer
	 */
	public void setName(String name);

	/**
	 * Returns the email address of this manufacturer.
	 *
	 * @return the email address of this manufacturer
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this manufacturer.
	 *
	 * @param emailAddress the email address of this manufacturer
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the website of this manufacturer.
	 *
	 * @return the website of this manufacturer
	 */
	@AutoEscape
	public String getWebsite();

	/**
	 * Sets the website of this manufacturer.
	 *
	 * @param website the website of this manufacturer
	 */
	public void setWebsite(String website);

	/**
	 * Returns the phone number of this manufacturer.
	 *
	 * @return the phone number of this manufacturer
	 */
	@AutoEscape
	public String getPhoneNumber();

	/**
	 * Sets the phone number of this manufacturer.
	 *
	 * @param phoneNumber the phone number of this manufacturer
	 */
	public void setPhoneNumber(String phoneNumber);

	/**
	 * Returns the create date of this manufacturer.
	 *
	 * @return the create date of this manufacturer
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this manufacturer.
	 *
	 * @param createDate the create date of this manufacturer
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this manufacturer.
	 *
	 * @return the modified date of this manufacturer
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this manufacturer.
	 *
	 * @param modifiedDate the modified date of this manufacturer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user name of this manufacturer.
	 *
	 * @return the user name of this manufacturer
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this manufacturer.
	 *
	 * @param userName the user name of this manufacturer
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

	@Override
	public Object clone();

	@Override
	public int compareTo(Manufacturer manufacturer);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Manufacturer> toCacheModel();

	@Override
	public Manufacturer toEscapedModel();

	@Override
	public Manufacturer toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}