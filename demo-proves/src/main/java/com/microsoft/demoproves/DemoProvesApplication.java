package com.microsoft.demoproves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.delivery.request"})
public class DemoProvesApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoProvesApplication.class, args);
	}

}
