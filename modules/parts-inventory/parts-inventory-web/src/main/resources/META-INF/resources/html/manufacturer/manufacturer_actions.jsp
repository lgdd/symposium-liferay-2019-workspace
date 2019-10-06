<%@include file="/html/init.jsp" %>

<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Manufacturer manufacturer = (Manufacturer) row.getObject();
	ManufacturerPermissionChecker manufacturerPermissionChecker =
			(ManufacturerPermissionChecker) renderRequest.getAttribute("manufacturerPermissionChecker");

	long groupId = manufacturer.getGroupId();
	String name = Manufacturer.class.getName();
	long manufacturerId = manufacturer.getManufacturerId();

	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>
	<c:if test="<%= manufacturerPermissionChecker.contains(permissionChecker, scopeGroupId, manufacturerId, ActionKeys.UPDATE) %>">
		<portlet:renderURL var="editURL">
			<portlet:param name="mvcPath" value="/html/manufacturer/edit_manufacturer.jsp" />
			<portlet:param name="manufacturerId" value="<%= String.valueOf(manufacturerId) %>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
		</portlet:renderURL>

		<liferay-ui:icon image="edit" url="<%=editURL.toString() %>" />
	</c:if>

	<c:if test="<%= manufacturerPermissionChecker.contains(permissionChecker, scopeGroupId, manufacturerId, ActionKeys.DELETE) %>">

		<portlet:actionURL name="<%=MVCCommandNames.DELETE_MANUFACTURER %>" var="deleteURL">
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="manufacturerId" value="<%= String.valueOf(manufacturerId) %>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
		</portlet:actionURL>

		<liferay-ui:icon image="delete" url="<%=deleteURL.toString() %>" />
	</c:if>

	<c:if test="<%= manufacturerPermissionChecker.contains(permissionChecker, scopeGroupId, manufacturerId, ActionKeys.PERMISSIONS) %>">
		<liferay-security:permissionsURL
			modelResource="<%= Manufacturer.class.getName() %>"
			modelResourceDescription="<%= manufacturer.getName() %>"
			resourcePrimKey="<%= String.valueOf(manufacturerId) %>"
			var="permissionsURL" />

		<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
	</c:if>
	    
</liferay-ui:icon-menu>
