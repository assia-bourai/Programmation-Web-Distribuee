package com.example.WebServiceJPA;

import java.util.List;

public class CatalogueItem {
	private String name;
	private String authorName;
	private String description;
	public CatalogueItem() {
		super();
		
	}
	public CatalogueItem(String name, String authorName, String description) {
		super();
		this.name = name;
		this.authorName = authorName;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	} 
	
	
	/*private List<Book> books;

	public CatalogueItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CatalogueItem(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
    */ 
	
	

}
