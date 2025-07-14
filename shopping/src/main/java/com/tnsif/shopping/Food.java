package com.tnsif.shopping;

import org.springframework.stereotype.Component;

@Component
public class Food implements Ordering{
	public void order()
	{
		System.out.println("I am ordering Food");
	}
}
