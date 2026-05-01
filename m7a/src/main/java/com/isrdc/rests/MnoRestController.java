package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.feigns.M7BFeignClient;

@RestController
public class MnoRestController {
	@Autowired
	private M7BFeignClient feignClient;
	
//	http://localhost:9090/pro -> use postman/browser to test this api
	@GetMapping("/pro")
	public String process() {
		String resp = feignClient.callM7BInformation();
		
		return "jai hoo..." + resp;
	}
}
