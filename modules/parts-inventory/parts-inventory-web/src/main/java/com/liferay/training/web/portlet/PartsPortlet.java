package com.liferay.training.web.portlet;

import com.liferay.training.parts.service.permission.PartPermissionChecker;
import com.liferay.training.web.constants.PartsPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;

/**
 * @author lgd
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.training",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"com.liferay.portlet.add-default-resource=true",
		"com.liferay.portlet.css-class-wrapper=parts-portlet-portlet",
		"javax.portlet.display-name=Parts",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/html/parts/view.jsp",
		"javax.portlet.name=" + PartsPortletKeys.PARTS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PartsPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
									throws IOException, PortletException {

		renderRequest.setAttribute("partPermissionChecker", _partPermissionChecker);
		
		super.render(renderRequest, renderResponse);
	}

	@Reference
	private PartPermissionChecker _partPermissionChecker;
}
