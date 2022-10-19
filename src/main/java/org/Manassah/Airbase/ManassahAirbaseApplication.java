package org.Manassah.Airbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
*Returns the main class of the application 
*@SpringBootApplication Enabling or disabling Spring Boot auto-configuration. (@EnableAutoConfiguration)
choosing which packages to scan for components (@ComponentScan)
Enabling the configuration bean registrations or for importing additional configurations (@SpringBootConfiguration)
*/
@SpringBootApplication
public class ManassahAirbaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManassahAirbaseApplication.class, args);
	}

}
