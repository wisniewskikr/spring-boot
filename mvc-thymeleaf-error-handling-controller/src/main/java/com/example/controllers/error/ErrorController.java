package com.example.controllers.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

	@RequestMapping(value="/error")
	public String handleErrors(HttpServletRequest request, Model model) {	
		
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");		
		
		if(statusCode == HttpStatus.NOT_FOUND.value()) {
			model.addAttribute("errorText", "404 Error Page");
        } else {
        	model.addAttribute("errorText", "Default Error Page");
        	Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
        	System.out.println("Exception message: " + exception.getMessage());
        }	    
		
		return "error/error";
		
	}

	@Override
	public String getErrorPath() {
		return null;
	}
	
}