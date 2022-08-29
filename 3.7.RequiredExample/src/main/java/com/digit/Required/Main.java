package com.digit.Required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String [] args) {
		
//We are using ApplicationContext, it is used to load bean definitions, wire beans together, and dispense beans upon request
//We can also use BeanFactory but its weaker than ApplicationContext	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

//We are creating object of Student Class and storing the data from the id student in beans.xml file	
		
		Student s1=(Student)context.getBean("student");

//Here we are printing the details of the employee
		
		s1.display();
	}

}
