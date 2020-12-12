package com.example.controlleradvices;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler {
	
	@ExceptionHandler(value = Exception.class)
	public String defaultErrorHandling(HttpServletRequest request, Exception e) {
		
		return "error/error";
		
	}

}
