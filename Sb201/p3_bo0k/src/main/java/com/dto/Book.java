package com.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Book {

	@Id
	private int id;
	private String name;
	private String author;
	private String publication;
	private String category;
	private int pages;
	private int price;
	private LocalDateTime created_timestamp;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, String author, String publication, String category, int pages, int price,
			LocalDateTime created_timestamp) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.created_timestamp = created_timestamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDateTime getCreated_timestamp() {
		return created_timestamp;
	}

	public void setCreated_timestamp(LocalDateTime created_timestamp) {
		this.created_timestamp = created_timestamp;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", category=" + category + ", pages=" + pages + ", price=" + price + ", created_timestamp="
				+ created_timestamp + "]";
	}

}
