package com.ecs.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	int count = 1;

	@GetMapping("/sample")
	// @CrossOrigin(origins = "https://localhost")
	public String sample() {
		System.out.println("Api Called :" + count);
		count++;
		//String x = "{ " + "\"stateMachineArn\": \"arn:aws:states:ap-northeast-1:834502459661:stateMachine:GIB-LCOnePOC-Hello-World\"" + "}";
		return "{" + " \"result\":\"Hi! data is from backend\"" + "}";
	}

}
