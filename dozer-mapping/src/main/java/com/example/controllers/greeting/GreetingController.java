package com.example.controllers.greeting;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.commands.greeting.GreetingCommand;
import com.example.mappings.Destination;
import com.example.mappings.Source;


@Controller
public class GreetingController {
	
	@Autowired
    private Mapper mapper;

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String greeting(@ModelAttribute("command") GreetingCommand command) {
		
		// Mapping
		Source source = new Source("Hello Word With Default Mapping!", "Hello World With Custom Mapping!");
		Destination destination = mapper.map(source, Destination.class);
		
		// Filling Command object
		command.setTextDefaultMapping(destination.getMessageDefault());
		command.setTextCustomMapping(destination.getCustomMessage());
		
		return "home/home";
		
	}
	
}