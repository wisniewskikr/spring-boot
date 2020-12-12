package com.example.controlleradvices;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalErrorHandler {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public String handleError404(Model model, HttpServletRequest request, Exception e) {
		
		model.addAttribute("errorText", "404 Error Page");
		return "error/error";
		
	}
	
	@ExceptionHandler(Exception.class)
	public String handleError(Model model, HttpServletRequest request, Exception e) {
		
		model.addAttribute("errorText", "Default Error Page");
		return "error/error";
		
	}	

}
