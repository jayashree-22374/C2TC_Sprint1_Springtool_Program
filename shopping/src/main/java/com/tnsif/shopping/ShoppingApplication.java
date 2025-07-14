package com.tnsif.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShoppingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(ShoppingApplication.class, args);
	Customer c=var.getBean(Customer.class);
	c.customerOrder();
	}

}
