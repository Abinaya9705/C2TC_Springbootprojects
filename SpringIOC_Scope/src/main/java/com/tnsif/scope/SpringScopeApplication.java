package com.tnsif.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(SpringScopeApplication.class, args);
		
		Product p1=var.getBean(Product.class);
	}

}
