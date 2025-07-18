package com.tnsif.bookModule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/book")
	public BookEntity save(@RequestBody BookEntity bookEntity) {
		return bookService.saveAllBooks(bookEntity);
	}
	
	@GetMapping("/books")
	public List<BookEntity>getAllBooks(){
		return bookService.ListAll();
	}
	
	
	
	


	
}
