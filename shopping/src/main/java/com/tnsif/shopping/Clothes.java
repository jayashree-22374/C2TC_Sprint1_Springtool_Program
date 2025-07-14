package com.tnsif.shopping;

import org.springframework.stereotype.Component;

@Component
public class Clothes implements Ordering{
	public void order() 
	{
		System.out.println("I am ordering Clothes");
	}

}
