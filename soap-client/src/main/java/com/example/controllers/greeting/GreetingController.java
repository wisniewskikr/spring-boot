package com.example.controllers.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.commands.greeting.GreetingCommand;
import com.example.we.clients.GreetingWsClient;
import com.example.we.elements.GreetingResponse;


@Controller
public class GreetingController {
	
	@Autowired
	private GreetingWsClient greetingWsClient;

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String greeting(@ModelAttribute("command") GreetingCommand command) {
		
		GreetingResponse greetingResponse = greetingWsClient.getGreetingResponse("Stranger");		
		command.setText(greetingResponse.getMessage());
		return "home/home";
		
	}
	
}