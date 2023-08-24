package com.cd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruddenoWithSpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddenoWithSpringRestApplication.class, args);
		
		//Hit the 'magic-api/employees' in postman/ url.
		//make Sure Your Entity class name is 'Employee'
	}

}
