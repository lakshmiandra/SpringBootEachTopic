package com.lakshmi.demo.springbootapplicationproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Value("${spring.application.name:demoService}") //In case if we don't have default value then after: it'll take
	private String name;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	 @RequestMapping(value = "/")
	   public String name() {
	      return name;
	   }
}


