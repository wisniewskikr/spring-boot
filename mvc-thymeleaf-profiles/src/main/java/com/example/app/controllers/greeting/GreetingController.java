package com.example.app.controllers.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.app.commands.greeting.GreetingCommand;


@Controller
public class GreetingController {
	
	@Value(value = "${profile.type}")
	private String profileType;

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String greeting(@ModelAttribute("command") GreetingCommand command) {
		
		command.setText("Hello World: " + profileType + "!");
		return "home/home";
		
	}
	
}