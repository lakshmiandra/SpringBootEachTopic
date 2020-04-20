package com.lakshmi.demo.springbootlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	
	public static void main(String[] args) {
		
		logger.error("This is error message");
		logger.debug("This is debug message");
		logger.info("This is info message");
		SpringApplication.run(DemoApplication.class, args);
	}


	
}
