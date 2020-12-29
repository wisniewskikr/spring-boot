package com.example.controllers.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

	private static final String EXCEPTION_ATTRIBUTE = "javax.servlet.error.exception";
	private static final String FORWARD_URI_ATTRIBUTE = "javax.servlet.forward.request_uri";
	private static final String STATUS_CODE_ATTRIBUTE = "javax.servlet.error.status_code";

	@RequestMapping(value="/error")
	public String handleErrors(HttpServletRequest request, Model model) {	
		
		Integer statusCode = (Integer) request.getAttribute(STATUS_CODE_ATTRIBUTE);	
			
		if(statusCode == HttpStatus.NOT_FOUND.value()) {
			model.addAttribute("errorText", "404 Error Page");
			System.out.println("Exception message: there is no such resource: " + request.getAttribute(FORWARD_URI_ATTRIBUTE));
        } else {
        	model.addAttribute("errorText", "Default Error Page");
        	Exception exception = (Exception) request.getAttribute(EXCEPTION_ATTRIBUTE);
        	System.out.println("Exception message: " + exception.getMessage());
        }	    
		
		return "error/error";
		
	}

	@Override
	public String getErrorPath() {
		return null;
	}
	
}