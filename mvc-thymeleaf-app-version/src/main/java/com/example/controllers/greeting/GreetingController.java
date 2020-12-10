package com.example.controllers.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.commands.greeting.GreetingCommand;


@Controller
public class GreetingController {
	
	@Autowired
    private BuildProperties buildProperties;
	
	@ModelAttribute("applicationVersion")
    public String getApplicationVersion() {
        return buildProperties.getVersion();
    }

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String greeting(@ModelAttribute("command") GreetingCommand command) {
		
		command.setText("Hello World!");
		return "home/home";
		
	}
	
}