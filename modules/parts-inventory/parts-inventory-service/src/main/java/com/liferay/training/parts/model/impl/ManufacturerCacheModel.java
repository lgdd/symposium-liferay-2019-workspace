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

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.parts.model.Manufacturer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Manufacturer in entity cache.
 *
 * @author Joe Bloggs
 * @generated
 */
@ProviderType
public class ManufacturerCacheModel
	implements CacheModel<Manufacturer>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ManufacturerCacheModel)) {
			return false;
		}

		ManufacturerCacheModel manufacturerCacheModel =
			(ManufacturerCacheModel)obj;

		if (manufacturerId == manufacturerCacheModel.manufacturerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manufacturerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{manufacturerId=");
		sb.append(manufacturerId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", website=");
		sb.append(website);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", userName=");
		sb.append(userName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Manufacturer toEntityModel() {
		ManufacturerImpl manufacturerImpl = new ManufacturerImpl();

		manufacturerImpl.setManufacturerId(manufacturerId);
		manufacturerImpl.setCompanyId(companyId);
		manufacturerImpl.setGroupId(groupId);
		manufacturerImpl.setUserId(userId);

		if (name == null) {
			manufacturerImpl.setName("");
		}
		else {
			manufacturerImpl.setName(name);
		}

		if (emailAddress == null) {
			manufacturerImpl.setEmailAddress("");
		}
		else {
			manufacturerImpl.setEmailAddress(emailAddress);
		}

		if (website == null) {
			manufacturerImpl.setWebsite("");
		}
		else {
			manufacturerImpl.setWebsite(website);
		}

		if (phoneNumber == null) {
			manufacturerImpl.setPhoneNumber("");
		}
		else {
			manufacturerImpl.setPhoneNumber(phoneNumber);
		}

		if (createDate == Long.MIN_VALUE) {
			manufacturerImpl.setCreateDate(null);
		}
		else {
			manufacturerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manufacturerImpl.setModifiedDate(null);
		}
		else {
			manufacturerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (userName == null) {
			manufacturerImpl.setUserName("");
		}
		else {
			manufacturerImpl.setUserName(userName);
		}

		manufacturerImpl.resetOriginalValues();

		return manufacturerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manufacturerId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		name = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		website = objectInput.readUTF();
		phoneNumber = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		userName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manufacturerId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (website == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(website);
		}

		if (phoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(phoneNumber);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}
	}

	public long manufacturerId;
	public long companyId;
	public long groupId;
	public long userId;
	public String name;
	public String emailAddress;
	public String website;
	public String phoneNumber;
	public long createDate;
	public long modifiedDate;
	public String userName;

}