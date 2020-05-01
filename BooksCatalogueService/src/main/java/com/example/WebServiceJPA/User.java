package com.example.WebServiceJPA;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {

	@Id
	@Column(name = "ID_USER")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUser;

	@Column(name = "NAME")
	private String name;

	@Column(name = "BOOKS")
	@ElementCollection
	private List<Integer> idBooks = new ArrayList<Integer>(); // liste que user a lu

	public User() {
		super();
	}

	public User(int idUser, String name, List<Integer> idBooks) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.idBooks = idBooks;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getIdBooks() {
		return idBooks;
	}

	public void setIdBooks(List<Integer> idBooks) {
		this.idBooks = idBooks;
	}

}
