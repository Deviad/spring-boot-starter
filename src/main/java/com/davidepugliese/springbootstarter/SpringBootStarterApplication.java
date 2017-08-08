package com.davidepugliese.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.davidepugliese")
@SpringBootApplication
public class SpringBootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterApplication.class, args);
	}
}
