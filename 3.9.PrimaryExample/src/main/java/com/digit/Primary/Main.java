package com.digit.Primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class); 
	Anime anime1=context.getBean(Anime.class);
	
	System.out.println(anime1);
	}

}
