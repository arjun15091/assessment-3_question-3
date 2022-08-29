package com.digit.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	  @Bean 
	  public Hello hello() { //@Bean annotation is meant to provide a spring bean. 
		                     //The type of the bean to provide will be the same type of the class/interface We define in the return method.
	  
	  return new Hello(); }

}
