package com.digit.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * We are using ApplicationContext, it is used to load bean definitions, wire
		 * beans together, and dispense beans upon request We can also use BeanFactory
		 * but its weaker than ApplicationContext
		 */
		
	ApplicationContext context=new AnnotationConfigApplicationContext(Config.class); 
	Hello hello=context.getBean("hello",Hello.class);
	hello.getData();
	}

}
