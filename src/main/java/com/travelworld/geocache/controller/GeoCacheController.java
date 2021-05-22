package com.travelworld.geocache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Controller	
public class GeoCacheController {
	
	
	@GetMapping("/greeting")
	public ResponseEntity<String> getData() {
		System.out.println("Welcome to application");
		return new ResponseEntity<>("Application Up and running!",HttpStatus.OK);
		
	}

}
