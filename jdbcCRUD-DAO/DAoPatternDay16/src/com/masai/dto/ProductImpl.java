package com.masai.dto;

import java.time.LocalDate;

public class ProductImpl implements Product{
	private Integer prodId;
	private String prodName;
	private Double MRP;
	private LocalDate MFGDate;
	private Category category;
	
	public ProductImpl() {}

	public ProductImpl(Integer prodId, String prodName, Double mRP, LocalDate mFGDate, Category category) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		MRP = mRP;
		MFGDate = mFGDate;
		this.category = category;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Double getMRP() {
		return MRP;
	}

	public void setMRP(Double mRP) {
		MRP = mRP;
	}

	public LocalDate getMFGDate() {
		return MFGDate;
	}

	public void setMFGDate(LocalDate mFGDate) {
		MFGDate = mFGDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
