package com.digit.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Shape {
	
	public String getData() {
		return "Here are the Property of your Shape:";
	}
	
	@Autowired
	
	/*
	 * The purpose of @Qualifier annotation is to specify which particular bean
	 * you want to get wired in case of multiple beans of same class. So here
	 * i have mentioned property2 so that i can see the values of property2.
	 */
	
	@Qualifier("property2") //it will print the elements of id=property2
	
	private Properties property;
	public Properties getProperty() {
		return property;
	}
}
