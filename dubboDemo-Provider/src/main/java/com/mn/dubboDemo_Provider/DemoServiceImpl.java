package com.mn.dubboDemo_Provider;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		
		return "Hello "+name;
	}

}
