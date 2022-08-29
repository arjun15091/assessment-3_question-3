package com.digit.Primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.digit.Primary")
public class Config {
	
	@Bean
	public Anime narutoBean() {
	    return new Anime("This is Naruto Bean");
	  }
	
	/*
	 * we use @Primary to give higher preference to a bean when there are multiple
	 * beans of the same type.
	 */
	
	@Primary
	@Bean
	public Anime dragonballBean() {
	    return new Anime("This is DragonBall Bean");
	  }
	
	@Bean
	public Anime opnepeiceBean() {
	    return new Anime("This is One Peice Bean");
	  }
	
	

}
