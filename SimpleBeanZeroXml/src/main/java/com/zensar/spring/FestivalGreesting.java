package com.zensar.spring;

import org.springframework.stereotype.Component;
//no need to give bean id in xml file it replaces bean defination
@Component("festive") 
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
