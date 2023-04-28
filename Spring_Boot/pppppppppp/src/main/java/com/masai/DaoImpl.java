package com.masai;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class DaoImpl implements Dao {

	@Override
	public Seller addSeller() throws E_commerceException {
//		
		EntityManager em=EmUtil.provideEntityManager();
		em.getTransaction().begin();
		
	        Seller seller = new Seller();
	        seller.setName("ram");
	        seller.setEmail("ram@ahds");
	        seller.setPhone("47575754");
	        em.persist(seller);
	       em.getTransaction().commit();
	        em.close();
	        return seller;
	}

	@Override
	public Product addProduct(int sellerId) throws E_commerceException {
		EntityManager em=EmUtil.provideEntityManager();
		em.getTransaction().begin();
		
		Seller seller = em.find(Seller.class, sellerId);
        if (seller == null) {
            throw new E_commerceException();
        }
        Product product = new Product();
        product.setName("pen");
        product.setPrice(10);
        product.setQuantity(500);
        product.setCategory(Category.BOOKS);
        product.setSeller(seller);
        em.persist(product);
        seller.getProducts().add(product);
        
	       em.getTransaction().commit();
	        em.close();
	        return product;
	}

	@Override
	public List<Product> getProductsBySeller(int sellerId) throws E_commerceException {
		EntityManager em=EmUtil.provideEntityManager();
		em.getTransaction().begin();
		
		Seller seller = em.find(Seller.class, sellerId);
        if (seller == null) {
            throw new E_commerceException();
        }
        List<Product> products = (List<Product>) seller.getProducts();
        
        em.close();
        return products;
	}

	@Override
	public Product getProductById(int id) throws E_commerceException {
		EntityManager em=EmUtil.provideEntityManager();
		em.getTransaction().begin();
		
		  Product product = em.find(Product.class, id);
		  if (product == null) {
			  throw new E_commerceException();
	        }
		em.close();
		return product;
	}

	@Override
	public List<Product> addBatchOfProductsForSeller(int sellerId, List<Product> products) throws E_commerceException {
		// TODO Auto-generated method stub
		EntityManager em=EmUtil.provideEntityManager();
		em.getTransaction().begin();
		 Seller seller = em.find(Seller.class, sellerId);
	        if (seller == null) {
	        	  throw new E_commerceException();
	        }
	        List<Product> addProducts = new ArrayList<>();
	        Product p=new Product();
	        p.setCategory(Category.ELECTRONICS);
	        p.setName("laptop");
	        p.setPrice(55620);
	        p.setQuantity(1);
	        p.setSeller(seller);
	        
	        addProducts.add(p);
	        
		return addProducts;
	}

}
