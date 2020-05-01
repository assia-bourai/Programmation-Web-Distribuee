package com.example.BookInfoService;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer>{
	List<Book> findByName(String name);
	
}
