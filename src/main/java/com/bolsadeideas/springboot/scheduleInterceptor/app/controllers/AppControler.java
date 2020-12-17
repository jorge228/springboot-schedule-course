package com.bolsadeideas.springboot.scheduleInterceptor.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppControler {
	
	@Value("${config.schedule.open}")
	private Integer open;
	@Value("${config.schedule.close}")
	private Integer close;
	
	
	@GetMapping({"/", "/index"})
	public String index(Model model) {
		model.addAttribute("title", "Welcome!!!");
		return "index";
	}
	
	@GetMapping({"/close"})
	public String close(Model model) {
		model.addAttribute("title", "Ups, it's closed!!!");
		model.addAttribute("message", "Open from " + open + " to " + close + ", sorry!");
		return "close";
	}

}
