package com.example.microservices.RibbonClientApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonClientController {
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/home")
	public String getMycart() 
	{
		ResponseEntity<String> entity=template.getForEntity("http://ProductService/home", String.class);
		String response=entity.getBody();
		return response;
	}


}
