package com.reference.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reference.app.shared.Hello;

@RestController
public class HelloController {
	@Autowired
	private Hello helloService;
	
	@GetMapping("/hello")
	@ResponseBody
	public String sayHello(@RequestParam("greeting") String msg) {
		return helloService.sayHello(msg);
	}
}
