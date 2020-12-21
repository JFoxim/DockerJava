package com.hello.world;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean {
	
    public HelloWorldBean() {
	}

	public HelloWorldBean(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
