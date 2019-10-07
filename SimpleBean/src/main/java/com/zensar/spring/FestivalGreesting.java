package com.zensar.spring;

public class FestivalGreesting implements Greeting {
	public FestivalGreesting() {
		// TODO Auto-generated constructor stub
		System.out.println("Festival Greeting is created");
	}
	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Diwali";
	}

}
