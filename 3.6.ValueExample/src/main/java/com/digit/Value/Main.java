package com.digit.Value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String [] args) {
		
//We are using ApplicationContext, it is used to load bean definitions, wire beans together, and dispense beans upon request
//We can also use BeanFactory but its weaker than ApplicationContext	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

//We are creating object of Employee Class and storing the data from the id employee in beans.xml file	
		
		Employee e1=(Employee)context.getBean("employee");

//Here we are printing the details of the employee
		
		e1.display();
	}

}
