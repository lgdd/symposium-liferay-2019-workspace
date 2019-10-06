package com.liferay.training.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.parts.model.Part;
import com.liferay.training.parts.service.PartLocalService;
import com.liferay.training.parts.service.PartLocalServiceUtil;
import com.liferay.training.web.constants.MVCCommandNames;
import com.liferay.training.web.constants.InventoryPortletKeys;
import com.liferay.training.web.validator.PartValidator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.util.*;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + InventoryPortletKeys.PARTS,
		"mvc.command.name=" + MVCCommandNames.ADD_PART
	},
	service = MVCActionCommand.class
)
public class AddPartMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest request, ActionResponse response)
									throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();

		if (themeDisplay.getPermissionChecker().hasPermission(groupId, "com.liferay.training.parts.model", groupId,
										"ADD_PART")) {

			Part part = PartLocalServiceUtil.createPart(0);

			part.setPartId(ParamUtil.getLong(request, "partId"));

			Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(request, "name");
			part.setNameMap(nameMap);

			part.setPartNumber(ParamUtil.getString(request, "partNumber"));

			int orderDateMonth = ParamUtil.getInteger(request, "orderDateMonth");
			int orderDateDay = ParamUtil.getInteger(request, "orderDateDay");
			int orderDateYear = ParamUtil.getInteger(request, "orderDateYear");
			Date orderDate = PortalUtil.getDate(orderDateMonth, orderDateDay, orderDateYear);
			part.setOrderDate(orderDate);

			part.setQuantity(ParamUtil.getInteger(request, "quantity"));
			part.setManufacturerId(ParamUtil.getLong(request, "manufacturerId"));
			part.setCompanyId(themeDisplay.getCompanyId());
			part.setGroupId(themeDisplay.getScopeGroupId());
			part.setUserId(themeDisplay.getUserId());

			List<String> errors = new ArrayList<>();

			if (PartValidator.validatePart(part, errors)) {

				long userId = themeDisplay.getUserId();

				try {
					_partLocalService.addPart(part, userId);
				}
				catch (PortalException e) {
					_log.error(e);
				}

				SessionMessages.add(request, "part-added");

				sendRedirect(request, response);
			}
			else {
				for (String error : errors) {
					SessionErrors.add(request, error);
				}

				PortalUtil.copyRequestParameters(request, response);

				response.getRenderParameters().setValue("mvcPath", "/html/parts/edit_part.jsp");
			}
		}
		else {
			SessionErrors.add(request, "permission-error");
						sendRedirect(request, response);
		}
	}

	@Reference
	private PartLocalService _partLocalService;

	private static final Log _log = LogFactoryUtil.getLog(AddPartMVCActionCommand.class);
}
