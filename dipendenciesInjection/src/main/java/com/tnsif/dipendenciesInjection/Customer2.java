package com.tnsif.dipendenciesInjection;
import org.springframework.stereotype.Component;

@Component
public class Customer2 {
	private int id;
	private String name;
	
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
		System.out.println("This is from Customer2 class");
	}

}
