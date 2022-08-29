package com.digit.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* With Spring, we use the @ComponentScan annotation along with the 
 * @Configuration annotation to specify the packages that we want to be scanned
 * @Configuration annotation indicates that the class has @Bean definition methods.*/

@Configuration
@ComponentScan(basePackages="com.digit.componentscan")

public class VehicleConfig {
	

}

