package com.liferay.training.web.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.parts.service.ManufacturerLocalService;
import com.liferay.training.web.constants.InventoryPortletKeys;
import com.liferay.training.web.constants.MVCCommandNames;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + InventoryPortletKeys.MANUFACTURER,
		"mvc.command.name=" + MVCCommandNames.DELETE_MANUFACTURER
	},
	service = MVCActionCommand.class
)
public class DeleteManufacturerMVCActionCommand extends BaseMVCActionCommand {

	@Override
	public void doProcessAction(ActionRequest request, ActionResponse response)
									throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) request
										.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();

		long manufacturerId = ParamUtil.getLong(request, "manufacturerId");

		if (themeDisplay.getPermissionChecker().hasPermission(groupId,
										"com.liferay.training.parts.model.Manufacturer",
										manufacturerId, "DELETE")) {

			if (Validator.isNotNull(manufacturerId)) {
				_manufacturerLocalService.deleteManufacturer(manufacturerId);

				SessionMessages.add(request, "manufacturer-deleted");

				sendRedirect(request, response);
			} else {
				SessionErrors.add(request, "error-deleting");
			}
		} else {
			SessionErrors.add(request, "permission-error");
			sendRedirect(request, response);
		}
	}

	@Reference
	private ManufacturerLocalService _manufacturerLocalService;

	private static final Log _log = LogFactoryUtil.getLog(DeleteManufacturerMVCActionCommand.class);
}
