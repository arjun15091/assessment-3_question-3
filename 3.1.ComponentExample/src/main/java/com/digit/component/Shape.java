package com.digit.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * The purpose of @Component annotation is to create all the beans of the
 * specified in the beans.xml file. With the help of this annotation we don't
 * need to create bean id of all the classes present the package, as this
 * automatically create the bean id.
 */

@Component

public class Shape {
	
	public String getData() {
		return "Here are the Property of your Shape:";
	}
	
	@Autowired
	private Properties property;
	public Properties getProperty() {
		return property;
	}
}
