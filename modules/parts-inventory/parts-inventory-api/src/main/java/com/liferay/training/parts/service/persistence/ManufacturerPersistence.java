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

package com.liferay.training.parts.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.parts.exception.NoSuchManufacturerException;
import com.liferay.training.parts.model.Manufacturer;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manufacturer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joe Bloggs
 * @see ManufacturerUtil
 * @generated
 */
@ProviderType
public interface ManufacturerPersistence extends BasePersistence<Manufacturer> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManufacturerUtil} to access the manufacturer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the manufacturers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching manufacturers
	 */
	public java.util.List<Manufacturer> findByGroupId(long groupId);

	/**
	 * Returns a range of all the manufacturers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ManufacturerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of manufacturers
	 * @param end the upper bound of the range of manufacturers (not inclusive)
	 * @return the range of matching manufacturers
	 */
	public java.util.List<Manufacturer> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the manufacturers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ManufacturerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByGroupId(long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param start the lower bound of the range of manufacturers
	 * @param end the upper bound of the range of manufacturers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturers
	 */
	@Deprecated
	public java.util.List<Manufacturer> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Manufacturer> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the manufacturers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ManufacturerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of manufacturers
	 * @param end the upper bound of the range of manufacturers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturers
	 */
	public java.util.List<Manufacturer> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Manufacturer> orderByComparator);

	/**
	 * Returns the first manufacturer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturer
	 * @throws NoSuchManufacturerException if a matching manufacturer could not be found
	 */
	public Manufacturer findByGroupId_First(
			long groupId, OrderByComparator<Manufacturer> orderByComparator)
		throws NoSuchManufacturerException;

	/**
	 * Returns the first manufacturer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturer, or <code>null</code> if a matching manufacturer could not be found
	 */
	public Manufacturer fetchByGroupId_First(
		long groupId, OrderByComparator<Manufacturer> orderByComparator);

	/**
	 * Returns the last manufacturer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturer
	 * @throws NoSuchManufacturerException if a matching manufacturer could not be found
	 */
	public Manufacturer findByGroupId_Last(
			long groupId, OrderByComparator<Manufacturer> orderByComparator)
		throws NoSuchManufacturerException;

	/**
	 * Returns the last manufacturer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturer, or <code>null</code> if a matching manufacturer could not be found
	 */
	public Manufacturer fetchByGroupId_Last(
		long groupId, OrderByComparator<Manufacturer> orderByComparator);

	/**
	 * Returns the manufacturers before and after the current manufacturer in the ordered set where groupId = &#63;.
	 *
	 * @param manufacturerId the primary key of the current manufacturer
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturer
	 * @throws NoSuchManufacturerException if a manufacturer with the primary key could not be found
	 */
	public Manufacturer[] findByGroupId_PrevAndNext(
			long manufacturerId, long groupId,
			OrderByComparator<Manufacturer> orderByComparator)
		throws NoSuchManufacturerException;

	/**
	 * Removes all the manufacturers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of manufacturers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching manufacturers
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the manufacturer in the entity cache if it is enabled.
	 *
	 * @param manufacturer the manufacturer
	 */
	public void cacheResult(Manufacturer manufacturer);

	/**
	 * Caches the manufacturers in the entity cache if it is enabled.
	 *
	 * @param manufacturers the manufacturers
	 */
	public void cacheResult(java.util.List<Manufacturer> manufacturers);

	/**
	 * Creates a new manufacturer with the primary key. Does not add the manufacturer to the database.
	 *
	 * @param manufacturerId the primary key for the new manufacturer
	 * @return the new manufacturer
	 */
	public Manufacturer create(long manufacturerId);

	/**
	 * Removes the manufacturer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturerId the primary key of the manufacturer
	 * @return the manufacturer that was removed
	 * @throws NoSuchManufacturerException if a manufacturer with the primary key could not be found
	 */
	public Manufacturer remove(long manufacturerId)
		throws NoSuchManufacturerException;

	public Manufacturer updateImpl(Manufacturer manufacturer);

	/**
	 * Returns the manufacturer with the primary key or throws a <code>NoSuchManufacturerException</code> if it could not be found.
	 *
	 * @param manufacturerId the primary key of the manufacturer
	 * @return the manufacturer
	 * @throws NoSuchManufacturerException if a manufacturer with the primary key could not be found
	 */
	public Manufacturer findByPrimaryKey(long manufacturerId)
		throws NoSuchManufacturerException;

	/**
	 * Returns the manufacturer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturerId the primary key of the manufacturer
	 * @return the manufacturer, or <code>null</code> if a manufacturer with the primary key could not be found
	 */
	public Manufacturer fetchByPrimaryKey(long manufacturerId);

	/**
	 * Returns all the manufacturers.
	 *
	 * @return the manufacturers
	 */
	public java.util.List<Manufacturer> findAll();

	/**
	 * Returns a range of all the manufacturers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ManufacturerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturers
	 * @param end the upper bound of the range of manufacturers (not inclusive)
	 * @return the range of manufacturers
	 */
	public java.util.List<Manufacturer> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the manufacturers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ManufacturerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of manufacturers
	 * @param end the upper bound of the range of manufacturers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturers
	 */
	@Deprecated
	public java.util.List<Manufacturer> findAll(
		int start, int end, OrderByComparator<Manufacturer> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the manufacturers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ManufacturerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturers
	 * @param end the upper bound of the range of manufacturers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturers
	 */
	public java.util.List<Manufacturer> findAll(
		int start, int end, OrderByComparator<Manufacturer> orderByComparator);

	/**
	 * Removes all the manufacturers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manufacturers.
	 *
	 * @return the number of manufacturers
	 */
	public int countAll();

}