package com.example.controllers.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.commands.greeting.GreetingCommand;


@Controller
@RequestMapping(value="/")
public class GreetingController {

	@RequestMapping
	public String display(@ModelAttribute("command") GreetingCommand command) {
		
		command.setText("Hello World!");
		return "home/home";
		
	}
	
}