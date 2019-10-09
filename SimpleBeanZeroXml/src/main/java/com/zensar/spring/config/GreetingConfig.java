package com.zensar.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.zensar.spring") //this is package neme of class which are component annotated
public class GreetingConfig {
	//this class is replacement of xml 
}
