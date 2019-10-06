package com.liferay.training.parts.service.permission;

import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.training.parts.model.Part;

public interface PartPermissionChecker extends BaseModelPermissionChecker {

	public static final String RESOURCE_NAME = Part.class.getName();

	public static final String TOP_LEVEL_RESOURCE =
									Part.class.getName().substring(
																	0, Part.class.getName().lastIndexOf("."));

	public void check(
									PermissionChecker permissionChecker, long groupId, long partId,
									String actionId)
									throws AuthException;

	public void checkTopLevel(
									PermissionChecker permissionChecker, long groupId, String actionId)
									throws AuthException;

	public boolean contains(
									PermissionChecker permissionChecker, long groupId, long partId,
									String actionId);

	public boolean containsTopLevel(
									PermissionChecker permissionChecker, long groupId, String actionId);
}
