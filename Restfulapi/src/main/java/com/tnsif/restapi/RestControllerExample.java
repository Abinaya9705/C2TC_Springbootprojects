package com.tnsif.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	@RequestMapping("/hello Coders")
	public String show()
	{
		return "Welcome to the TNSIF Capgemini CSR Spring Boot session";
	}

}
