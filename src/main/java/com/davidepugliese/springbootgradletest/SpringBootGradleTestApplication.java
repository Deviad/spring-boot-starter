package com.davidepugliese.springbootgradletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.davidepugliese")
@SpringBootApplication
public class SpringBootGradleTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGradleTestApplication.class, args);
	}
}
