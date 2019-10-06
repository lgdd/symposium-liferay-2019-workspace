package com.liferay.training.web.application.list;

import com.liferay.application.list.BaseJSPPanelApp;
import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.training.parts.service.permission.ManufacturerPermissionChecker;
import com.liferay.training.web.constants.InventoryAdminPanelCategoryKeys;
import com.liferay.training.web.constants.InventoryPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lgd
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + InventoryAdminPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class ManufacturerAdminPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return InventoryPortletKeys.MANUFACTURER;
	}

	@Reference(
		target = "(javax.portlet.name=" + InventoryPortletKeys.MANUFACTURER + ")",
		unbind = "-"
	)
	@Override
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}
