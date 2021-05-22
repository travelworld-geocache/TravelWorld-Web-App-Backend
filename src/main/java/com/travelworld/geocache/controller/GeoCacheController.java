package com.travelworld.geocache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class GeoCacheController {
	
	
	@GetMapping("/greeting")
	public String getData() {
		return "Welcome To geoCache";
		
	}

}
