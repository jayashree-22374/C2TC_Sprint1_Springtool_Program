package com.tnsif.dipendenciesInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DipendenciesInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(DipendenciesInjectionApplication.class, args);
		
	/*	Customer1 c1=var.getBean(Customer1.class);
		c1.show();
		
		Customer2 c2=var.getBean(Customer2.class);
		c2.show(); */
		
		Customer3 c3=var.getBean(Customer3.class);
		c3.show();
		
	}

}
