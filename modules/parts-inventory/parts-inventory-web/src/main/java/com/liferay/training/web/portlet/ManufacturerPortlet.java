package com.liferay.training.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.training.parts.service.permission.ManufacturerPermissionChecker;
import com.liferay.training.parts.service.permission.PartPermissionChecker;
import com.liferay.training.web.constants.InventoryPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"com.liferay.portlet.add-default-resource=true",
		"com.liferay.portlet.css-class-wrapper=manufacturer-portlet-portlet",
		"javax.portlet.display-name=Manufacturer",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/html/manufacturer/view.jsp",
		"javax.portlet.name=" + InventoryPortletKeys.MANUFACTURER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ManufacturerPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
									throws IOException, PortletException {

		renderRequest.setAttribute("manufacturerPermissionChecker", _manufacturerPermissionChecker);

		super.render(renderRequest, renderResponse);
	}

	@Reference
	private ManufacturerPermissionChecker _manufacturerPermissionChecker;
}
