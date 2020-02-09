package com.fdx.rtct.staticModule.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fdx.rtct.staticModule.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

	List<Book> findByName(String name);
	
}
