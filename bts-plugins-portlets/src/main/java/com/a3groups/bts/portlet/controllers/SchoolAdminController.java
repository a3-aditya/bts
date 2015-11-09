package com.a3groups.bts.portlet.controllers;

import com.a3groups.bts.util.RenderConstants;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class SchoolAdminController {
	
	private static Log log = LogFactoryUtil.getLog(SchoolAdminController.class);
	
	@RenderMapping
	public String home(Locale locale, Model model) {
		return RenderConstants.SCHOOL_ADMIN_PORTLET_VIEW;
	}

	@ActionMapping(params = "action=addSchoolInfo")
	public void actionOneMethod(ActionRequest request, ActionResponse response) {
		String schoolName = ParamUtil.getString(request, "schoolName");
		log.info("School Name : "+ schoolName );
		
	}
}
