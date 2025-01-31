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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Manufacturer service. Represents a row in the &quot;Inventory_Manufacturer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.training.parts.model.impl.ManufacturerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.training.parts.model.impl.ManufacturerImpl</code>.
 * </p>
 *
 * @author Joe Bloggs
 * @see Manufacturer
 * @generated
 */
@ProviderType
public interface ManufacturerModel
	extends BaseModel<Manufacturer>, GroupedModel, ShardedModel {

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
	 */
	@Override
	public String getUserUuid();

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

}