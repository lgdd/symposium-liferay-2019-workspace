package com.liferay.training.web.application.list;

import com.liferay.application.list.BasePanelCategory;
import com.liferay.application.list.PanelCategory;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.liferay.training.web.constants.InventoryAdminPanelCategoryKeys;
import org.osgi.service.component.annotations.Component;

import java.util.Locale;
import java.util.ResourceBundle;

@Component(
	immediate = true,
	property = {
		"panel.category.order:Integer=100",
		"panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION
	},
	service = PanelCategory.class
)
public class InventoryAdminPanelCategory extends BasePanelCategory {

	@Override
	public String getKey() {
		return InventoryAdminPanelCategoryKeys.CONTROL_PANEL_CATEGORY;
	}

	@Override
	public String getLabel(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
										"content.Language", locale, getClass());

		return LanguageUtil.get(resourceBundle, "category.inventory.label");
	}

}
