package com.openinov.glamping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GlampingApplication {

	public static void main(String[] args) {

		SpringApplication.run(GlampingApplication.class, args);
		System.out.println("Hello Glamping");
	}

}
