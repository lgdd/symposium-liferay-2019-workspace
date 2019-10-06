package com.liferay.training.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.*;
import com.liferay.training.parts.model.Part;
import com.liferay.training.parts.service.PartLocalService;
import com.liferay.training.parts.service.PartLocalServiceUtil;
import com.liferay.training.web.constants.MVCCommandNames;
import com.liferay.training.web.constants.PartsPortletKeys;
import com.liferay.training.web.validator.PartValidator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import java.io.IOException;
import java.util.*;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + PartsPortletKeys.PARTS,
		"mvc.command.name=" + MVCCommandNames.DELETE_PART
	},
	service = MVCActionCommand.class
)
public class DeletePartMVCActionCommand extends BaseMVCActionCommand {

	@Override
	public void doProcessAction(ActionRequest request, ActionResponse response)
									throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) request
										.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();

		long partId = ParamUtil.getLong(request, "partId");

		if (themeDisplay.getPermissionChecker().hasPermission(groupId,
										"com.liferay.training.parts.model.Part",
										partId, "DELETE")) {

			if (Validator.isNotNull(partId)) {

				try {
					_partLocalService.deletePart(partId);
				}
				catch (PortalException e) {
					_log.error(e);
				}

				SessionMessages.add(request, "part-deleted");

				sendRedirect(request, response);
			} else {
				SessionErrors.add(request, "deletion-error");
			}
		} else {
			SessionErrors.add(request, "permission-error");
			sendRedirect(request, response);

		}
	}

	@Reference
	private PartLocalService _partLocalService;

	private static final Log _log = LogFactoryUtil.getLog(DeletePartMVCActionCommand.class);
}
