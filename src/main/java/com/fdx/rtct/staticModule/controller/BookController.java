package com.fdx.rtct.staticModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fdx.rtct.staticModule.dao.BookRepository;
import com.fdx.rtct.staticModule.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
    private BookRepository repository;

	@RequestMapping(path = "/save", method = RequestMethod.GET)
	public List<Book> save(){
			
			repository.save(new Book("Java","java book"));
	        repository.save(new Book("Node","node book"));
	        repository.save(new Book("Python", "python book"));

	        System.out.println("\nfindAll()");
	        repository.findAll().forEach(x -> System.out.println(x));

	        System.out.println("\nfindById(1L)");
	        repository.findById(1l).ifPresent(x -> System.out.println(x));

	        System.out.println("\nfindByName('Node')");
	        repository.findByName("Node").forEach(x -> System.out.println(x));
	        
	        return repository.findByName("node");
	        
	}
	
	@RequestMapping(path = "/books", method = RequestMethod.GET)
	public List<Book> geBooks(){
			
	        return (List<Book>) repository.findAll();
	        
	}
	
	
}
