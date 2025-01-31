<%@ include file="../init.jsp" %>

<%
String displayStyle = GetterUtil.getString(portletPreferences.getValue("displayStyle", StringPool.BLANK));
long displayStyleGroupId = GetterUtil.getLong(portletPreferences.getValue("displayStyleGroupId", null), scopeGroupId);
%>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<aui:form action="<%= configurationURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

	<aui:fieldset>
		<div class="display-template">

			<%
			TemplateHandler templateHandler = TemplateHandlerRegistryUtil.getTemplateHandler(Part.class.getName());
			%>

			<liferay-ui:ddm-template-selector
				displayStyle="<%= displayStyle %>"
				displayStyleGroupId="<%= displayStyleGroupId %>"
				refreshURL="<%= PortalUtil.getCurrentURL(request) %>"
				showEmptyOption="<%= true %>"
			className="<%= PortalUtil.getClassNameId(templateHandler.getClassName()) %>"/>
		</div>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>i:form>