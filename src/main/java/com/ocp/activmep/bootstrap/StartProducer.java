package com.ocp.activmep.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ocp")
public class StartProducer {

	public static void main(String[] args) {
		SpringApplication.run(StartProducer.class, args);
	}

}
