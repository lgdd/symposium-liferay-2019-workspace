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
 * Provides the local service utility for Part. This utility wraps
 * <code>com.liferay.training.parts.service.impl.PartLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Joe Bloggs
 * @see PartLocalService
 * @generated
 */
@ProviderType
public class PartLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.parts.service.impl.PartLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the part to the database. Also notifies the appropriate model listeners.
	 *
	 * @param part the part
	 * @return the part that was added
	 */
	public static com.liferay.training.parts.model.Part addPart(
		com.liferay.training.parts.model.Part part) {

		return getService().addPart(part);
	}

	/**
	 * Adds the Part to the database incrementing the primary key
	 *
	 * @throws PortalException
	 */
	public static com.liferay.training.parts.model.Part addPart(
			com.liferay.training.parts.model.Part newPart, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().addPart(newPart, userId);
	}

	/**
	 * Creates a new part with the primary key. Does not add the part to the database.
	 *
	 * @param partId the primary key for the new part
	 * @return the new part
	 */
	public static com.liferay.training.parts.model.Part createPart(
		long partId) {

		return getService().createPart(partId);
	}

	/**
	 * Deletes the part with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param partId the primary key of the part
	 * @return the part that was removed
	 * @throws PortalException if a part with the primary key could not be found
	 * @throws SystemException
	 */
	public static com.liferay.training.parts.model.Part deletePart(long partId)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().deletePart(partId);
	}

	/**
	 * Deletes the part from the database. Also notifies the appropriate model listeners.
	 *
	 * @param part the part
	 * @return the part that was removed
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static com.liferay.training.parts.model.Part deletePart(
			com.liferay.training.parts.model.Part part)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().deletePart(part);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.training.parts.model.impl.PartModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.training.parts.model.impl.PartModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.liferay.training.parts.model.Part fetchPart(long partId) {
		return getService().fetchPart(partId);
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
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the part with the primary key.
	 *
	 * @param partId the primary key of the part
	 * @return the part
	 * @throws PortalException if a part with the primary key could not be found
	 */
	public static com.liferay.training.parts.model.Part getPart(long partId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPart(partId);
	}

	/**
	 * Returns a range of all the parts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.training.parts.model.impl.PartModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of parts
	 * @param end the upper bound of the range of parts (not inclusive)
	 * @return the range of parts
	 */
	public static java.util.List<com.liferay.training.parts.model.Part>
		getParts(int start, int end) {

		return getService().getParts(start, end);
	}

	/**
	 * Gets a list with all the Parts in a group
	 */
	public static java.util.List<com.liferay.training.parts.model.Part>
			getPartsByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getPartsByGroupId(groupId);
	}

	/**
	 * Gets a list with a range of Parts from a group
	 */
	public static java.util.List<com.liferay.training.parts.model.Part>
			getPartsByGroupId(long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getPartsByGroupId(groupId, start, end);
	}

	/**
	 * Gets a list of Parts from a Manufacturer
	 */
	public static java.util.List<com.liferay.training.parts.model.Part>
			getPartsByManufacturer(long manufacturerId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getPartsByManufacturer(manufacturerId, groupId);
	}

	/**
	 * Returns the number of parts.
	 *
	 * @return the number of parts
	 */
	public static int getPartsCount() {
		return getService().getPartsCount();
	}

	/**
	 * Gets the number of Parts in a group
	 */
	public static int getPartsCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getPartsCountByGroupId(groupId);
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the part in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param part the part
	 * @return the part that was updated
	 */
	public static com.liferay.training.parts.model.Part updatePart(
		com.liferay.training.parts.model.Part part) {

		return getService().updatePart(part);
	}

	public static PartLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PartLocalService, PartLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PartLocalService.class);

		ServiceTracker<PartLocalService, PartLocalService> serviceTracker =
			new ServiceTracker<PartLocalService, PartLocalService>(
				bundle.getBundleContext(), PartLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}