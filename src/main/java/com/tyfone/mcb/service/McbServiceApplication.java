package com.tyfone.mcb.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class McbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(McbServiceApplication.class, args);
		System.out.println("At remote");
	}
}
