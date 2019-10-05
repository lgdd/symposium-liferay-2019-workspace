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
 * This class is a wrapper for {@link Manufacturer}.
 * </p>
 *
 * @author Joe Bloggs
 * @see Manufacturer
 * @generated
 */
@ProviderType
public class ManufacturerWrapper
	extends BaseModelWrapper<Manufacturer>
	implements Manufacturer, ModelWrapper<Manufacturer> {

	public ManufacturerWrapper(Manufacturer manufacturer) {
		super(manufacturer);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("manufacturerId", getManufacturerId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("name", getName());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("website", getWebsite());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userName", getUserName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long manufacturerId = (Long)attributes.get("manufacturerId");

		if (manufacturerId != null) {
			setManufacturerId(manufacturerId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}

		String phoneNumber = (String)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
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

	/**
	 * Returns the company ID of this manufacturer.
	 *
	 * @return the company ID of this manufacturer
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this manufacturer.
	 *
	 * @return the create date of this manufacturer
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this manufacturer.
	 *
	 * @return the email address of this manufacturer
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the group ID of this manufacturer.
	 *
	 * @return the group ID of this manufacturer
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the manufacturer ID of this manufacturer.
	 *
	 * @return the manufacturer ID of this manufacturer
	 */
	@Override
	public long getManufacturerId() {
		return model.getManufacturerId();
	}

	/**
	 * Returns the modified date of this manufacturer.
	 *
	 * @return the modified date of this manufacturer
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this manufacturer.
	 *
	 * @return the name of this manufacturer
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the phone number of this manufacturer.
	 *
	 * @return the phone number of this manufacturer
	 */
	@Override
	public String getPhoneNumber() {
		return model.getPhoneNumber();
	}

	/**
	 * Returns the primary key of this manufacturer.
	 *
	 * @return the primary key of this manufacturer
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this manufacturer.
	 *
	 * @return the user ID of this manufacturer
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this manufacturer.
	 *
	 * @return the user name of this manufacturer
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this manufacturer.
	 *
	 * @return the user uuid of this manufacturer
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the website of this manufacturer.
	 *
	 * @return the website of this manufacturer
	 */
	@Override
	public String getWebsite() {
		return model.getWebsite();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this manufacturer.
	 *
	 * @param companyId the company ID of this manufacturer
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this manufacturer.
	 *
	 * @param createDate the create date of this manufacturer
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this manufacturer.
	 *
	 * @param emailAddress the email address of this manufacturer
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the group ID of this manufacturer.
	 *
	 * @param groupId the group ID of this manufacturer
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the manufacturer ID of this manufacturer.
	 *
	 * @param manufacturerId the manufacturer ID of this manufacturer
	 */
	@Override
	public void setManufacturerId(long manufacturerId) {
		model.setManufacturerId(manufacturerId);
	}

	/**
	 * Sets the modified date of this manufacturer.
	 *
	 * @param modifiedDate the modified date of this manufacturer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this manufacturer.
	 *
	 * @param name the name of this manufacturer
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the phone number of this manufacturer.
	 *
	 * @param phoneNumber the phone number of this manufacturer
	 */
	@Override
	public void setPhoneNumber(String phoneNumber) {
		model.setPhoneNumber(phoneNumber);
	}

	/**
	 * Sets the primary key of this manufacturer.
	 *
	 * @param primaryKey the primary key of this manufacturer
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this manufacturer.
	 *
	 * @param userId the user ID of this manufacturer
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this manufacturer.
	 *
	 * @param userName the user name of this manufacturer
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this manufacturer.
	 *
	 * @param userUuid the user uuid of this manufacturer
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the website of this manufacturer.
	 *
	 * @param website the website of this manufacturer
	 */
	@Override
	public void setWebsite(String website) {
		model.setWebsite(website);
	}

	@Override
	protected ManufacturerWrapper wrap(Manufacturer manufacturer) {
		return new ManufacturerWrapper(manufacturer);
	}

}