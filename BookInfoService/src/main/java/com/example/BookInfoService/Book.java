package com.example.BookInfoService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOKS")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_BOOK")
	private int idBook;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AUTHOR_NAME")
	private String authorName;
	
	@Column(name="DESCRIPTION")
	private String description;
	public Book() {
		super();		
	}
	public Book(int idBook, String name, String authorName, String description) {
		super();
		this.idBook = idBook;
		this.name = name;
		this.authorName = authorName;
		this.description = description;
	}
	public int getIdBook() {
		return idBook;
	}
	public void setIdBook(int idBook) {
		this.idBook = idBook;
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
	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", name=" + name + ", authorName=" + authorName + ", description=" + description
				+ "]";
	}
	
}
