package com.example.BrownieCakes.demo;


import java.lang.ModuleLayer.Controller;

import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Log {
 
	org.slf4j.Logger log=LoggerFactory.getLogger(Controller.class);
	@RequestMapping("/")
	public String demo()
	{
		log.info("information message");
		log.warn("Warning message");
		log.error("Error message");
		log.trace("Trace message");
		
		return "Completed";
	}
}
