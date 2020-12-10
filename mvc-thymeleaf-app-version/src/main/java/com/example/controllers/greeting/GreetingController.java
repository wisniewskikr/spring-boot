package com.example.controllers.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.commands.greeting.GreetingCommand;
import com.example.controllers.abstr.AbstractController;


@Controller
public class GreetingController extends AbstractController {	

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String greeting(@ModelAttribute("command") GreetingCommand command) {
		
		command.setText("Hello World!");
		return "home/home";
		
	}
	
}