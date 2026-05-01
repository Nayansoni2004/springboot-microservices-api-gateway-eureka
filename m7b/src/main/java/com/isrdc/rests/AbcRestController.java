package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbcRestController {
	@Autowired
	private Environment env;
	
	@GetMapping("/info")
	public String information() {
		String port = env.getProperty("local.server.port");
		
		return "Response from m7b instance running on port: " + port;
	}
}
