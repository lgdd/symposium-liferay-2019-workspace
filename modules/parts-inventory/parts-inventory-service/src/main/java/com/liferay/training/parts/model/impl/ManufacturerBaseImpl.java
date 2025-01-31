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

import com.liferay.training.parts.model.Manufacturer;
import com.liferay.training.parts.service.ManufacturerLocalServiceUtil;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model base implementation for the Manufacturer service. Represents a row in the &quot;Inventory_Manufacturer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ManufacturerImpl}.
 * </p>
 *
 * @author Joe Bloggs
 * @see ManufacturerImpl
 * @see Manufacturer
 * @generated
 */
@ProviderType
public abstract class ManufacturerBaseImpl
	extends ManufacturerModelImpl implements Manufacturer {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a manufacturer model instance should use the <code>Manufacturer</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			ManufacturerLocalServiceUtil.addManufacturer(this);
		}
		else {
			ManufacturerLocalServiceUtil.updateManufacturer(this);
		}
	}

}