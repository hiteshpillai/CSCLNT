package com.capgemini.HiteshCapStoreClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.capgemini.controller")
public class HiteshCapStoreClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiteshCapStoreClientApplication.class, args);
	}
}
