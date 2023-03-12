package com.dto;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="BiryaniId")
public class VegBiryani extends Biryani {
	private int VegBiryaniId;
	private int price;
	private String description;

	public VegBiryani() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VegBiryani(int biryaniId, double biryanirating) {
		super(biryaniId, biryanirating);
		// TODO Auto-generated constructor stub
	}

	public VegBiryani(int vegBiryaniId, int price, String description) {
		super();
		VegBiryaniId = vegBiryaniId;
		this.price = price;
		this.description = description;
	}

	public int getVegBiryaniId() {
		return VegBiryaniId;
	}

	public void setVegBiryaniId(int vegBiryaniId) {
		VegBiryaniId = vegBiryaniId;
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
		return "VegBiryani [VegBiryaniId=" + VegBiryaniId + ", price=" + price + ", description=" + description + "]";
	}

}
