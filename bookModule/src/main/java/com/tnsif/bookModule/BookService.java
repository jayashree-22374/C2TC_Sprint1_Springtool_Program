package com.tnsif.bookModule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
	public BookEntity saveAllBooks(BookEntity bookEntity) {
		return bookRepo.save(bookEntity);
	}
	
	public List<BookEntity> ListAll(){
		return bookRepo.findAll();
	}
	
	public BookEntity getAllBooks(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	
	
	
	
	
	
	
	

}
