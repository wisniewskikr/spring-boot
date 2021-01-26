package com.example.app.controllers.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	@ResponseBody
	@RequestMapping(value="/greeting", method = RequestMethod.GET)	
	public String greeting() {		
		return "<h1>Hello World!</h1>";		
	}
	
}