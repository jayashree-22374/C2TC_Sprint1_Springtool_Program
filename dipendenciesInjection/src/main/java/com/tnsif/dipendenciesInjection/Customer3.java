package com.tnsif.dipendenciesInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer3 {
	private int id;
	private String name;
	
	@Autowired
	private Customer1 customer1;
	@Autowired
	private Customer2 customer2;
	
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
		customer1.show();
		customer2.show();
		System.out.println("This is from Customer3 class");
	}

}

