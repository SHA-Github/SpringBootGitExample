package com.nit.demo.git.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to Spring Boot Runner");
		System.out.println("Welcome to Spring Boot Git Demo");
	}

}
