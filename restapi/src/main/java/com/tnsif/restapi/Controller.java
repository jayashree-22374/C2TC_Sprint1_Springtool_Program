package com.tnsif.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/hello")                                             // hello
	public String welcome() {
		return "Hi Coders... Welcome for the restful session";
	}
	
	@GetMapping("/hello/{name}")                                          // hello/name="Jayashree"
	public String Greet(@PathVariable String name) {
		return "Hello "+name+" Welcome";
	}
	
	@GetMapping("/hello")                                                 // hello?name="Jayashree" 
	public String message(@RequestParam String name) {                    // hello?name= "Jaya"+"shree"
		return "Message is "+name;
	}
}
