package com.liferay.training.web.portlet.action;

import com.liferay.portal.kernel.exception.SystemException;
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
		"mvc.command.name=" + MVCCommandNames.UPDATE_MANUFACTURER
	},
	service = MVCActionCommand.class
)
public class UpdateManufacturerMVCActionCommand extends BaseMVCActionCommand {

	@Override
	public void doProcessAction(ActionRequest request, ActionResponse response)
									throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) request
										.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();

		long manufacturerId = ParamUtil.getLong(request, "manufacturerId");
		Manufacturer manufacturer = null;

		try {
			manufacturer = _manufacturerLocalService
											.fetchManufacturer(manufacturerId);
		} catch (SystemException se) {
			_log.error(se);
			return;
		}

		if (themeDisplay.getPermissionChecker().hasPermission(groupId,
										"com.liferay.training.parts.model.Manufacturer",
										manufacturer.getManufacturerId(), "UPDATE")) {

			manufacturer.setName(ParamUtil.getString(request, "name"));
			manufacturer.setEmailAddress(ParamUtil.getString(request, "emailAddress"));
			manufacturer.setWebsite(ParamUtil.getString(request, "website"));
			manufacturer.setPhoneNumber(ParamUtil.getString(request, "phoneNumber"));

			List<String> errors = new ArrayList<String>();

			if (ManufacturerValidator
											.validateManufacturer(manufacturer, errors)) {

				_manufacturerLocalService.updateManufacturer(manufacturer);

				SessionMessages.add(request, "manufacturer-updated");

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

	private static final Log _log = LogFactoryUtil.getLog(UpdateManufacturerMVCActionCommand.class);
}
