package com.example.Spring_Framework_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	@GetMapping("/message")
	public String message()
	{
		return "SpringBoot..........";
	}

}
