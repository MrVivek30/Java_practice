package com.masai.dto;

import java.util.Set;

public interface Category {
	
	public int getCategoryid() ;
	public void setCategoryid(int categoryid);
	public String getCategoryname() ;
	public void setCategoryname(String categoryname) ;
	public Set<Product> getProductSet() ;
	public void setProductSet(Set<Product> productSet) ;
	
}
