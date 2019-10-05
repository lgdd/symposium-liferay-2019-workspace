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

package com.liferay.training.parts.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link ManufacturerLocalService}.
 *
 * @author Joe Bloggs
 * @see ManufacturerLocalService
 * @generated
 */
@ProviderType
public class ManufacturerLocalServiceWrapper
	implements ManufacturerLocalService,
			   ServiceWrapper<ManufacturerLocalService> {

	public ManufacturerLocalServiceWrapper(
		ManufacturerLocalService manufacturerLocalService) {

		_manufacturerLocalService = manufacturerLocalService;
	}

	/**
	 * Adds the manufacturer to the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturer the manufacturer
	 * @return the manufacturer that was added
	 */
	@Override
	public com.liferay.training.parts.model.Manufacturer addManufacturer(
		com.liferay.training.parts.model.Manufacturer manufacturer) {

		return _manufacturerLocalService.addManufacturer(manufacturer);
	}

	/**
	 * Adds the Manufacturer to the database incrementing the primary key
	 *
	 * @throws PortalException
	 */
	@Override
	public com.liferay.training.parts.model.Manufacturer addManufacturer(
			com.liferay.training.parts.model.Manufacturer newManufacturer,
			long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _manufacturerLocalService.addManufacturer(
			newManufacturer, userId);
	}

	/**
	 * Creates a new manufacturer with the primary key. Does not add the manufacturer to the database.
	 *
	 * @param manufacturerId the primary key for the new manufacturer
	 * @return the new manufacturer
	 */
	@Override
	public com.liferay.training.parts.model.Manufacturer createManufacturer(
		long manufacturerId) {

		return _manufacturerLocalService.createManufacturer(manufacturerId);
	}

	/**
	 * Deletes the manufacturer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturerId the primary key of the manufacturer
	 * @return the manufacturer that was removed
	 * @throws PortalException if a manufacturer with the primary key could not be found
	 * @throws SystemException
	 */
	@Override
	public com.liferay.training.parts.model.Manufacturer deleteManufacturer(
			long manufacturerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _manufacturerLocalService.deleteManufacturer(manufacturerId);
	}

	/**
	 * Deletes the manufacturer from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturer the manufacturer
	 * @return the manufacturer that was removed
	 * @throws PortalException
	 * @throws SystemException
	 */
	@Override
	public com.liferay.training.parts.model.Manufacturer deleteManufacturer(
			com.liferay.training.parts.model.Manufacturer manufacturer)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _manufacturerLocalService.deleteManufacturer(manufacturer);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manufacturerLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _manufacturerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.training.parts.model.impl.ManufacturerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _manufacturerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.training.parts.model.impl.ManufacturerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _manufacturerLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _manufacturerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _manufacturerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.parts.model.Manufacturer fetchManufacturer(
		long manufacturerId) {

		return _manufacturerLocalService.fetchManufacturer(manufacturerId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manufacturerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manufacturerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the manufacturer with the primary key.
	 *
	 * @param manufacturerId the primary key of the manufacturer
	 * @return the manufacturer
	 * @throws PortalException if a manufacturer with the primary key could not be found
	 */
	@Override
	public com.liferay.training.parts.model.Manufacturer getManufacturer(
			long manufacturerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturerLocalService.getManufacturer(manufacturerId);
	}

	/**
	 * Returns a range of all the manufacturers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.training.parts.model.impl.ManufacturerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturers
	 * @param end the upper bound of the range of manufacturers (not inclusive)
	 * @return the range of manufacturers
	 */
	@Override
	public java.util.List<com.liferay.training.parts.model.Manufacturer>
		getManufacturers(int start, int end) {

		return _manufacturerLocalService.getManufacturers(start, end);
	}

	/**
	 * Gets a list with all the Manufacturers in a group
	 */
	@Override
	public java.util.List<com.liferay.training.parts.model.Manufacturer>
			getManufacturersByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _manufacturerLocalService.getManufacturersByGroupId(groupId);
	}

	/**
	 * Gets a list with a range of Manufacturers from a group
	 */
	@Override
	public java.util.List<com.liferay.training.parts.model.Manufacturer>
			getManufacturersByGroupId(long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _manufacturerLocalService.getManufacturersByGroupId(
			groupId, start, end);
	}

	/**
	 * Returns the number of manufacturers.
	 *
	 * @return the number of manufacturers
	 */
	@Override
	public int getManufacturersCount() {
		return _manufacturerLocalService.getManufacturersCount();
	}

	/**
	 * Gets the number of Manufacturers in a group
	 */
	@Override
	public int getManufacturersCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _manufacturerLocalService.getManufacturersCountByGroupId(
			groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manufacturerLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the manufacturer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturer the manufacturer
	 * @return the manufacturer that was updated
	 */
	@Override
	public com.liferay.training.parts.model.Manufacturer updateManufacturer(
		com.liferay.training.parts.model.Manufacturer manufacturer) {

		return _manufacturerLocalService.updateManufacturer(manufacturer);
	}

	@Override
	public ManufacturerLocalService getWrappedService() {
		return _manufacturerLocalService;
	}

	@Override
	public void setWrappedService(
		ManufacturerLocalService manufacturerLocalService) {

		_manufacturerLocalService = manufacturerLocalService;
	}

	private ManufacturerLocalService _manufacturerLocalService;

}