package com.dto;

import javax.persistence.Entity;

@Entity
public class ChickenBiryani extends Biryani {

	private int chickenBiryaniId;
	private int price;
	private String description;

	public ChickenBiryani() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChickenBiryani(int biryaniId, double biryanirating) {
		super(biryaniId, biryanirating);
		// TODO Auto-generated constructor stub
	}

	public ChickenBiryani(int chickenBiryaniId, int price, String description) {
		super();
		this.chickenBiryaniId = chickenBiryaniId;
		this.price = price;
		this.description = description;
	}

	public int getChickenBiryaniId() {
		return chickenBiryaniId;
	}

	public void setChickenBiryaniId(int chickenBiryaniId) {
		this.chickenBiryaniId = chickenBiryaniId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ChickenBiryani [chickenBiryaniId=" + chickenBiryaniId + ", price=" + price + ", description="
				+ description + "]";
	}

}
