package com.bojug.appcds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AppcdsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AppcdsApplication.class, args);

		if(args != null && args.length > 0 && args[0].equals("EXIT")) {
			context.close();
		}
	}
}