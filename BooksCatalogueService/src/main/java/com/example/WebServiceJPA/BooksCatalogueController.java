package com.example.WebServiceJPA;

import java.util.ArrayList;
import java.util.List;

//import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class BooksCatalogueController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/catalog/{idUser}")
	public List<CatalogueItem> getCatalog(@PathVariable("idUser") String idUser) {

		User userBooks = restTemplate.getForObject("http://localhost:8081/user/" + idUser, User.class);// ça rend tout
																										// l'user

		System.out.println("l'objet user retourné par MS1" + userBooks);

		List<Integer> idbooks = userBooks.getIdBooks();
		for (Integer id : idbooks) {
			System.out.println("le livre numéro " + id);
		}

		List<CatalogueItem> LCI = new ArrayList<CatalogueItem>();
		for (Integer id : idbooks) {
			Book book = restTemplate.getForObject("http://localhost:8082/book/" + id, Book.class);
			System.out.println(book);
			LCI.add(new CatalogueItem(book.getName(), book.getAuthorName(), book.getDescription()));
		}

		return LCI;

		

	}

}
