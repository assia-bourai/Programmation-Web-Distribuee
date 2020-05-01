package com.example.BookInfoService;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public Iterable<Book> getAllBooks() {
		return bookRepository.findAll(); 
	}
	public Book getBook(int id) {
		return bookRepository.findById(id).orElse(null);
	}
	
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	public void updateBook(Book book) {
		bookRepository.save(book);
	}
	
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

	public List<Book> getBookByName(String bookName) {

		return bookRepository.findByName(bookName);
	}
}
