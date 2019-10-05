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
*/
--%>

<%@include file="/html/init.jsp"%>

<style>
.part {
	border-style: solid;
    border-width: 1px;
	font-size: 1.2em;
	padding: 5px;
	margin: 10px;
}
</style>

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);

	boolean hasAddPermission = InventoryPermission.contains(
			permissionChecker, scopeGroupId, "ADD_PART");
	boolean hasConfigurePermission = InventoryPermission.contains(
			permissionChecker, scopeGroupId, ActionKeys.PERMISSIONS);
%>

<liferay-ui:success key="part-added" message="part-added-successfully" />
<liferay-ui:success key="part-deleted"
	message="part-deleted-successfully" />
<liferay-ui:success key="part-updated"
	message="part-updated-successfully" />

<aui:button-row>
	<c:if test='<%= hasAddPermission %>'>
		<portlet:renderURL var="addPartURL">
			<portlet:param name="mvcPath" value="/html/parts/edit_part.jsp" />
			<portlet:param name="redirect" value="<%= redirect %>" />
		</portlet:renderURL>

		<aui:button name="addPartButton" value="add-part"
			onClick="<%=addPartURL %>" />
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

<liferay-ui:search-container emptyResultsMessage="part-empty-results-message">
	<liferay-ui:search-container-results
		results="<%=PartLocalServiceUtil.getPartsByGroupId(
						scopeGroupId, searchContainer.getStart(),
						searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
		className="com.liferay.training.parts.model.Part" keyProperty="partId"
		modelVar="part" escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text name="name"
			value="<%= part.getName(locale) %>" />

		<liferay-ui:search-container-column-text name="part-number"
			property="partNumber" />

		<liferay-ui:search-container-column-text name="quantity"
			property="quantity" />

		<liferay-ui:search-container-column-text name="order-date"
			value="<%= new SimpleDateFormat(\"MMMM dd, yyyy\").format(part.getOrderDate()) %>" />

		<%
			String manufacturerName = "";
			try {
				manufacturerName = HtmlUtil.escape(ManufacturerLocalServiceUtil
					.getManufacturer(part.getManufacturerId()).getName());
			} catch (PortalException pe) {
				System.err.println(pe.getLocalizedMessage());
			} catch (SystemException se) {
				System.err.println(se.getLocalizedMessage());
			}
		%>

		<liferay-ui:search-container-column-text name="manufacturer"
			value="<%= manufacturerName %>" />

		<liferay-ui:search-container-column-jsp align="right"
			path="/html/parts/part_actions.jsp" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
