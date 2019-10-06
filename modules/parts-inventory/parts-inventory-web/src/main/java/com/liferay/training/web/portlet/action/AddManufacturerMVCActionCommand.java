package com.liferay.training.web.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.parts.model.Manufacturer;
import com.liferay.training.parts.service.ManufacturerLocalService;
import com.liferay.training.web.constants.InventoryPortletKeys;
import com.liferay.training.web.constants.MVCCommandNames;
import com.liferay.training.web.validator.ManufacturerValidator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.util.ArrayList;
import java.util.List;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + InventoryPortletKeys.MANUFACTURER,
		"mvc.command.name=" + MVCCommandNames.ADD_MANUFACTURER
	},
	service = MVCActionCommand.class
)
public class AddManufacturerMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest request, ActionResponse response)
									throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) request
										.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();

		if (themeDisplay.getPermissionChecker()
										.hasPermission(groupId, "com.liferay.training.parts.model",
																		groupId, "ADD_MANUFACTURER")) {

			Manufacturer manufacturer = _manufacturerLocalService.createManufacturer(0);

			manufacturer.setManufacturerId(ParamUtil.getLong(request, "manufacturerId"));
			manufacturer.setName(ParamUtil.getString(request, "name"));
			manufacturer.setEmailAddress(ParamUtil.getString(request, "emailAddress"));
			manufacturer.setWebsite(ParamUtil.getString(request, "website"));
			manufacturer.setPhoneNumber(ParamUtil.getString(request, "phoneNumber"));
			manufacturer.setCompanyId(themeDisplay.getCompanyId());
			manufacturer.setGroupId(themeDisplay.getScopeGroupId());
			manufacturer.setUserId(themeDisplay.getUserId());

			_log.error(manufacturer.toString());

			List<String> errors = new ArrayList<>();

			if (ManufacturerValidator
											.validateManufacturer(manufacturer, errors)) {

				long userId = themeDisplay.getUserId();

				_manufacturerLocalService.addManufacturer(manufacturer,
													userId);

				SessionMessages.add(request, "manufacturer-added");

				sendRedirect(request, response);
			} else {
				for (String error : errors) {
					SessionErrors.add(request, error);
				}

				PortalUtil.copyRequestParameters(request, response);

				response.getRenderParameters().setValue("mvcPath",
												"/html/manufacturer/edit_manufacturer.jsp");
			}
		} else {
			SessionErrors.add(request, "permission-error");
			sendRedirect(request, response);
		}
	}

	@Reference
	private ManufacturerLocalService _manufacturerLocalService;

	private static final Log _log = LogFactoryUtil.getLog(AddManufacturerMVCActionCommand.class);
}
