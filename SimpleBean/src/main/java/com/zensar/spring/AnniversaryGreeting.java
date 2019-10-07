package com.zensar.spring;

public class AnniversaryGreeting implements Greeting {
	public AnniversaryGreeting() {
		System.out.println("Anniversary Greeting is created");
	}
	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Anniversary!!!!!!";
	}

}
