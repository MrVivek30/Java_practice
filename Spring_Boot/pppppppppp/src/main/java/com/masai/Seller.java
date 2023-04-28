package com.masai;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String phone;
    
    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private Set<Product> products = new HashSet<>();

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(int id, String name, String email, String phone, Set<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.products = products;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

    
}
