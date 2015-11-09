<%@include file="../init.jsp"%>

<portlet:defineObjects />

<%
	String document_abstr = GetterUtil.getString(request.getAttribute("document-abstr"));
	String referenceid = ParamUtil.getString(PortalUtil.getOriginalServletRequest(request), "referenceid");
	if(referenceid == null || "".equals(referenceid)){
		referenceid = renderRequest.getParameter("referenceid");
	}
%>

<portlet:actionURL var="submitSchoolInfo" >
	<portlet:param name="action" value="addSchoolInfo"/>
</portlet:actionURL>
<portlet:renderURL var="renderUrl">
	<portlet:param name="referenceid" value="<%=referenceid %>"/>
</portlet:renderURL>
<!-- School Info -> Name, Address, Dist, City, State (Admin) -->
<aui:form method="post" enctype="multipart/form-data" action="<%=submitSchoolInfo%>" name="documentUploadForm" id="schoolUploadInformation" cssClass="schoolUploadInformation">
	<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.ADD%>"></aui:input>
	<aui:input name="<%=WebKeys.REDIRECT %>" type="hidden" value="<%= renderUrl %>" />
	<aui:fieldset label="School Information">
		<aui:input name="schoolName" type="text" showRequiredLabel="<%=true%>" value="${title}" size="80">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="schoolAddress" type="text" showRequiredLabel="<%=true%>" value="${author}" size="80">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="district" type="text" showRequiredLabel="<%=true%>" value="${author}" size="80">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="city" type="text" showRequiredLabel="<%=true%>" value="${author}" size="80">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="state" type="text" showRequiredLabel="<%=true%>" value="${author}" size="80">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="schoolEmail" type="text" size="80">
			<aui:validator name="email" />
		</aui:input>
	</aui:fieldset>
	<aui:fieldset label="Abstract information School">
		<liferay-ui:input-editor editorImpl='<%="simple" %>' name="document-abstract"  toolbarSet="editInPlace" resizable="<%=false %>" />
	</aui:fieldset>
	<aui:fieldset label="School Statistics Information">
		<aui:input name="year" type="text" showRequiredLabel="<%=true%>" value="${author}" size="4">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="medium" type="text" showRequiredLabel="<%=true%>" value="${author}" size="4">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="boardName" type="text" showRequiredLabel="<%=true%>" value="${author}" size="4">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="totalEnrollStudents" helpMessage="current year only" type="text" showRequiredLabel="<%=true%>" value="${author}" size="4">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="firstDevision" type="text" showRequiredLabel="<%=true%>" value="${author}" size="4">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="secondDevision" type="text" showRequiredLabel="<%=true%>" value="${author}" size="4">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="thirdDevision" type="text" showRequiredLabel="<%=true%>" value="${author}" size="4">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="fail" type="text" showRequiredLabel="<%=true%>" value="${author}" size="4">
			<aui:validator name="required" />
		</aui:input>	
	</aui:fieldset>
	<aui:fieldset>
		<label class="aui-field-label">Document of Authorization</label>
		<aui:input name="authorizationDocument" inlineLabel="file" type="file" showRequiredLabel="<%=true%>">
		</aui:input>
	</aui:fieldset>
	<aui:button-row>
		<aui:button type="submit" value="submit"></aui:button>
	</aui:button-row>
</aui:form>

<aui:script>
	function <portlet:namespace />initEditor() {
		return "<%= UnicodeFormatter.toString(document_abstr) %>";
	}
	
	
</aui:script>