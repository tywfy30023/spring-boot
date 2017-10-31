package com.wfy.spring.boot.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
//@SpringBootApplication
@ComponentScan(value = {"com.wfy.spring.boot.controller"})  
@EnableAutoConfiguration
public class StartUP {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StartUP.class, args);
	}
}
