package com.satesh.simplespring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	public String sayHello(String name) {
		if(!name.equals(null))
		{
			return "Hello ::: "+name;
		}
		else
		{
			return "Hello Guest";
		}
	}
	
}
