package org.Manassah.Airbase.bean;

import org.Manassah.Airbase.model.Flight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
* @Configuration The annotation @EnableAutoConfiguration is used to enable the auto-configuration feature.
The @EnableAutoConfiguration annotation enables the auto-configuration of Spring ApplicationContext by scanning the classpath components and registering the beans.
This annotation is wrapped inside the @SpringBootApplication annotation along with @ComponentScan and @SpringBootConfiguration annotations.
*@Bean objects that form the backbone of your application and that are managed by the Spring IoC container
* 
*/
@Configuration
public class Config {
	
	

		 @Bean
		 
		    // Here the method name is the
		    // bean id/bean name
		    public Flight flightBean()
		    {
		 
		        // Returns the College class object
		        return new Flight(0, null);
		    }
		 @Bean
		 
		    // Here the method name is the
		    // bean id/bean name
		    public org.Manassah.Airbase.model.Passenger passengerBean()
		    {
		 
		        // Returns the Passenger class object
		        return new org.Manassah.Airbase.model.Passenger();
		    }
		}
		


