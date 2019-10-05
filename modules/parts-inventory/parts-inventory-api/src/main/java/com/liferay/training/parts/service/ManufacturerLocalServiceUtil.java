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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Manufacturer. This utility wraps
 * <code>com.liferay.training.parts.service.impl.ManufacturerLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Joe Bloggs
 * @see ManufacturerLocalService
 * @generated
 */
@ProviderType
public class ManufacturerLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.parts.service.impl.ManufacturerLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the manufacturer to the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturer the manufacturer
	 * @return the manufacturer that was added
	 */
	public static com.liferay.training.parts.model.Manufacturer addManufacturer(
		com.liferay.training.parts.model.Manufacturer manufacturer) {

		return getService().addManufacturer(manufacturer);
	}

	/**
	 * Adds the Manufacturer to the database incrementing the primary key
	 *
	 * @throws PortalException
	 */
	public static com.liferay.training.parts.model.Manufacturer addManufacturer(
			com.liferay.training.parts.model.Manufacturer newManufacturer,
			long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().addManufacturer(newManufacturer, userId);
	}

	/**
	 * Creates a new manufacturer with the primary key. Does not add the manufacturer to the database.
	 *
	 * @param manufacturerId the primary key for the new manufacturer
	 * @return the new manufacturer
	 */
	public static com.liferay.training.parts.model.Manufacturer
		createManufacturer(long manufacturerId) {

		return getService().createManufacturer(manufacturerId);
	}

	/**
	 * Deletes the manufacturer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturerId the primary key of the manufacturer
	 * @return the manufacturer that was removed
	 * @throws PortalException if a manufacturer with the primary key could not be found
	 * @throws SystemException
	 */
	public static com.liferay.training.parts.model.Manufacturer
			deleteManufacturer(long manufacturerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().deleteManufacturer(manufacturerId);
	}

	/**
	 * Deletes the manufacturer from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturer the manufacturer
	 * @return the manufacturer that was removed
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static com.liferay.training.parts.model.Manufacturer
			deleteManufacturer(
				com.liferay.training.parts.model.Manufacturer manufacturer)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().deleteManufacturer(manufacturer);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.training.parts.model.Manufacturer
		fetchManufacturer(long manufacturerId) {

		return getService().fetchManufacturer(manufacturerId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the manufacturer with the primary key.
	 *
	 * @param manufacturerId the primary key of the manufacturer
	 * @return the manufacturer
	 * @throws PortalException if a manufacturer with the primary key could not be found
	 */
	public static com.liferay.training.parts.model.Manufacturer getManufacturer(
			long manufacturerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getManufacturer(manufacturerId);
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
	public static java.util.List<com.liferay.training.parts.model.Manufacturer>
		getManufacturers(int start, int end) {

		return getService().getManufacturers(start, end);
	}

	/**
	 * Gets a list with all the Manufacturers in a group
	 */
	public static java.util.List<com.liferay.training.parts.model.Manufacturer>
			getManufacturersByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getManufacturersByGroupId(groupId);
	}

	/**
	 * Gets a list with a range of Manufacturers from a group
	 */
	public static java.util.List<com.liferay.training.parts.model.Manufacturer>
			getManufacturersByGroupId(long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getManufacturersByGroupId(groupId, start, end);
	}

	/**
	 * Returns the number of manufacturers.
	 *
	 * @return the number of manufacturers
	 */
	public static int getManufacturersCount() {
		return getService().getManufacturersCount();
	}

	/**
	 * Gets the number of Manufacturers in a group
	 */
	public static int getManufacturersCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getManufacturersCountByGroupId(groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the manufacturer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturer the manufacturer
	 * @return the manufacturer that was updated
	 */
	public static com.liferay.training.parts.model.Manufacturer
		updateManufacturer(
			com.liferay.training.parts.model.Manufacturer manufacturer) {

		return getService().updateManufacturer(manufacturer);
	}

	public static ManufacturerLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ManufacturerLocalService, ManufacturerLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ManufacturerLocalService.class);

		ServiceTracker<ManufacturerLocalService, ManufacturerLocalService>
			serviceTracker =
				new ServiceTracker
					<ManufacturerLocalService, ManufacturerLocalService>(
						bundle.getBundleContext(),
						ManufacturerLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}