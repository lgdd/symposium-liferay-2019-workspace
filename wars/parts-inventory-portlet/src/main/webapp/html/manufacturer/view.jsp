<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
--%>

<%@include file="/html/init.jsp" %>

<%
	boolean hasAddPermission = InventoryPermission.contains(
			permissionChecker, scopeGroupId, "ADD_MANUFACTURER");
	boolean hasConfigurePermission = InventoryPermission.contains(
			permissionChecker, scopeGroupId, ActionKeys.PERMISSIONS);
%>

<liferay-ui:success key="manufacturer-added" message="manufacturer-added-successfully" />
<liferay-ui:success key="manufacturer-updated" message="manufacturer-updated-successfully" />
<liferay-ui:success key="manufacturer-deleted" message="manufacturer-deleted-successfully" />

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);	
%>

<aui:button-row>
	<c:if test='<%= hasAddPermission %>'>
		<portlet:renderURL var="addManufacturerURL">
			<portlet:param name="mvcPath" value="/html/manufacturer/edit_manufacturer.jsp" />
			<portlet:param name="redirect" value="<%= redirect %>" />
		</portlet:renderURL>

		<aui:button value="add-manufacturer" onClick="<%= addManufacturerURL.toString() %>" />
	</c:if>

	<c:if test='<%= hasConfigurePermission %>'>
		<liferay-security:permissionsURL
			modelResource="com.liferay.training.parts.model"
			modelResourceDescription="Parts Inventory Top Level Actions"
			resourcePrimKey="<%= String.valueOf(scopeGroupId) %>"
			var="permissionsURL" />

		<aui:button value="permissions" onClick="<%= permissionsURL %>" />
	</c:if>

</aui:button-row>

<liferay-ui:search-container emptyResultsMessage="manufacturer-empty-results-message">
	<liferay-ui:search-container-results
		results="<%=ManufacturerLocalServiceUtil
						.getManufacturersByGroupId(scopeGroupId,
								searchContainer.getStart(), searchContainer.getEnd())%>"/>

	<liferay-ui:search-container-row
		className="com.liferay.training.parts.model.Manufacturer"
		keyProperty="manufacturerId"
		modelVar="manufacturer" escapedModel="<%= true %>"
	>
		<liferay-ui:search-container-column-text
			name="name"
			value="<%= manufacturer.getName() %>"
		/>

		<liferay-ui:search-container-column-text
			name="email-address"
			property="emailAddress"
		/>

		<liferay-ui:search-container-column-text
			name="phone-number"
			property="phoneNumber"
		/>

		<liferay-ui:search-container-column-text
			name="website"
			property="website"
		/>

		<liferay-ui:search-container-column-jsp
			align="right"
			path="/html/manufacturer/manufacturer_actions.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container> 
