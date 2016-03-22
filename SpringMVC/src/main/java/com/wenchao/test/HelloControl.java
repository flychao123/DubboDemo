package com.wenchao.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("he")
public class HelloControl {
	 @RequestMapping("me")
	    public String printWelcome(ModelMap model) {  
		   System.out.println("fsfsd");
	        model.addAttribute("message", "Spring 3 MVC Hello World");  
	        return "one";  
	    }  
}	
