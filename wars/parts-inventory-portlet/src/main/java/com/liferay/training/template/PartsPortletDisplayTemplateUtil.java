package com.liferay.training.template;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.training.parts.model.Manufacturer;
import com.liferay.training.parts.service.ManufacturerLocalServiceUtil;

public class PartsPortletDisplayTemplateUtil {
	
	public Manufacturer getManufacturer(long manufacturerId) {
		
		try {
			return ManufacturerLocalServiceUtil.getManufacturer(manufacturerId);
		} catch (PortalException pe) {
			pe.getLocalizedMessage();
			return null;
		} catch (SystemException se) {
			se.getLocalizedMessage();
			return null;
		}
	}
	
	public static PartsPortletDisplayTemplateUtil getInstance() {
		
		return new PartsPortletDisplayTemplateUtil();
	}

}
