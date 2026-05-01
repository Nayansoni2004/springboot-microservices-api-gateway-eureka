package com.isrdc.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="m7b")
public interface M7BFeignClient {
	
	@GetMapping("/info")
	public String callM7BInformation();
}
