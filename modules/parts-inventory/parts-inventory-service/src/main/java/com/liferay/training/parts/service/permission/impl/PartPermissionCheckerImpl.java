package com.liferay.training.parts.service.permission.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.training.parts.service.permission.PartPermissionChecker;
import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"model.class.name=com.liferay.training.parts.model.Part"
	},
	service = PartPermissionChecker.class
)
public class PartPermissionCheckerImpl implements PartPermissionChecker {

	@Override
	public void check(
									PermissionChecker permissionChecker, long groupId, long partId,
									String actionId)
									throws AuthException {

		if (!contains(permissionChecker, groupId, partId, actionId)) {
			throw new AuthException();
		}
	}

	@Override
	public boolean contains(
									PermissionChecker permissionChecker, long groupId, long partId,
									String actionId) {

		return (permissionChecker.hasPermission(
										groupId, RESOURCE_NAME, partId, actionId));
	}

	@Override
	public void checkTopLevel(
									PermissionChecker permissionChecker, long groupId, String actionId)
									throws AuthException {

		if (!containsTopLevel(permissionChecker, groupId, actionId)) {
			throw new AuthException();
		}
	}

	@Override
	public boolean containsTopLevel(
									PermissionChecker permissionChecker, long groupId, String actionId) {

		return (permissionChecker.hasPermission(
										groupId, TOP_LEVEL_RESOURCE, groupId, actionId));
	}

	@Override
	public void checkBaseModel(PermissionChecker permissionChecker, long groupId, long primaryKey, String actionId)
									throws PortalException {
		check(permissionChecker, groupId, primaryKey, actionId);
	}
}
