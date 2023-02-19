package com.masai.dto;

import java.util.Set;

	public class CategoryImpl implements Category {
	private int categoryid;
	private String categoryname;
	private Set<Product>productSet;
	
	public CategoryImpl() {
		
	}
	public CategoryImpl(int categoryid, String categoryname) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
//		this.productSet = productSet;
	}
	@Override
	public int getCategoryid() {
		return categoryid;
	}
	@Override
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	@Override
	public String getCategoryname() {
		return categoryname;
	}
	@Override
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	@Override
	public Set<Product> getProductSet() {
		return productSet;
	}
	@Override
	public void setProductSet(Set<Product> productSet) {
		this.productSet = productSet;
	}
	@Override
	public String toString() {
		return "CategoryImpl [categoryid=" + categoryid + ", categoryname=" + categoryname + ", productSet="
				+ productSet + "]";
	}
	
	}
