package com.reference.app.shared;

import org.springframework.stereotype.Component;

@Component
public class HelloImpl implements Hello {

	@Override
	public String sayHello(String msg) {
		return "hello " + msg;
	}
}
