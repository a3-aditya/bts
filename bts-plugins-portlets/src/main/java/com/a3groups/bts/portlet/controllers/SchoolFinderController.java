package com.a3groups.bts.portlet.controllers;

import com.a3groups.bts.util.RenderConstants;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class SchoolFinderController {
	@RenderMapping
	public String home(Locale locale, Model model) {
		return RenderConstants.SCHOOL_FINDER_PORTLET_VIEW;
	}

	/*@ActionMapping
	public void doAction(Model model,
            @ModelAttribute("school") School school,
            BindingResult result,
            HttpServletRequest request,
            RedirectAttributes rdAttr) {
		System.out.println("Test Action");
	}*/
}
