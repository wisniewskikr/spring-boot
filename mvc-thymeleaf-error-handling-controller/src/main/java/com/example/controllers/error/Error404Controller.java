package com.example.controllers.error;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.NoHandlerFoundException;


@Controller
public class Error404Controller implements ErrorController {

	@RequestMapping(value="/error")
	public void handleError404() throws NoHandlerFoundException {		
		throw new NoHandlerFoundException(null, null, null);		
	}

	@Override
	public String getErrorPath() {
		return null;
	}
	
}