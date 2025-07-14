package com.tnsif.dipendenciesInjection;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Customer1 {
	private int id;
	private String name;
	
	public Customer1() {
		System.out.println("Customer 1 has been called");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void show() {
		System.out.println("This is from Customer1 class");
	}

}
