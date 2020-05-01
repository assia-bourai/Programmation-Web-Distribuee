package com.example.BookInfoService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/book/")
	public Iterable<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping(value = "/book/{idBook}")
	public Book getBook(@PathVariable("idBook") int idBook) {

		return bookService.getBook(idBook);

	}

	@PostMapping(value = "/book/add/")
	public void addBook(@RequestBody Book book) throws Exception {
		bookService.addBook(book);
	}

	@DeleteMapping(value = "/book/delete")
	public void deleteUser(@RequestParam("idBook") int idBook) {
		bookService.deleteBook(idBook);
	}

}
/*
 * { "name":"orgeuil et préjugés","authorName":"jane austen"
 * ,"description":"roman "}
 * {"name":"harry potter","authorName":"JK Rowling","description":"roman"}
 * {"name":"ce que le jour doit à la nuit ","authorName":"yasmina khadra"
 * ,"description":"roman"} {
 * "name":"l'insoutenable légèreté de l'etre ","authorName":"milan kundera"
 * ,"description":"roman"}
 */