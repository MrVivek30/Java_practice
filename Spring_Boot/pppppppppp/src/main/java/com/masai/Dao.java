package com.masai;

import java.util.List;

public interface Dao {
	 public Seller addSeller() throws E_commerceException; 
	 
//	 public Seller getSeller(int id)throws E_commerceException ;
	
	 public Product addProduct(int sellerId)throws E_commerceException;
	 
	 public List<Product> getProductsBySeller(int sellerId)throws E_commerceException;
	 
	 public Product getProductById(int id)throws E_commerceException;
	 
	 public List<Product> addBatchOfProductsForSeller(int sellerId, List<Product> products) throws E_commerceException;
}
