package com.nit.demo.git.runner;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner {
private static Logger logger=LoggerFactory.getLogger(MessageRunner.class);
	@Override
	public void run(String... args) throws Exception {
		logger.info("STARTED");
		System.out.println("Welcome to Spring Boot Runner");
		System.out.println("Welcome to Spring Boot Git Demo");
		try {
			int a=10;
			System.out.println("a="+a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.info("END");
	}

}
