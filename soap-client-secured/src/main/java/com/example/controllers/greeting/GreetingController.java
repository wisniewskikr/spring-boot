package com.example.controllers.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.we.clients.GreetingWsClient;
import com.example.we.elements.GreetingResponse;


@Controller
public class GreetingController {
	
	@Autowired
	private GreetingWsClient greetingWsClient;

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	@ResponseBody
	public String greeting() {
		
		GreetingResponse greetingResponse = greetingWsClient.getGreetingResponse("Stranger");		
		return greetingResponse.getMessage();
		
	}
	
}