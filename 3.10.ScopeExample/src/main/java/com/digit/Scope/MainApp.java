package com.digit.Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      Places place1 = (Places) context.getBean("places");

      place1.setPlace("Egypt");
      place1.getPlace();

      Places place2 = (Places) context.getBean("places");
      place2.getPlace();  //Here Egypt will automatically set to place2 as due to singleton scope
   }
}