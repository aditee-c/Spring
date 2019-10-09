package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
		Performer p = ctx.getBean("Saif Ali Khan", Performer.class);
		p.perform();
		//sub interface of application context
		ConfigurableApplicationContext cfgCtx = (ConfigurableApplicationContext) ctx;
		//req to spring ioc container to  shut down
		cfgCtx.close();
	}

}
