package com.example.controllers.abstr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.ModelAttribute;

public abstract class AbstractController {
	
	@Autowired
    private BuildProperties buildProperties;
	
	@ModelAttribute("applicationVersion")
    public String getApplicationVersion() {
        return buildProperties.getVersion();
    }

}
