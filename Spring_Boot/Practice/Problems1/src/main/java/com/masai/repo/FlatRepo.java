package com.masai.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.models.Flat;

public interface FlatRepo extends JpaRepository<Flat, Integer> {
	@Query("select f from Flat f where f.price<?1")
	public List<Flat> findFlatPriceLess(Integer price);
	
	@Query("select f from Flat f where f.price<=?1 ")
	public List<Flat> findFlatPriceLessThan(Integer price);
	
	@Query("select f from Flat f where f.price>?1")
	public List<Flat> findFlatPriceGreater(Integer price);
	
	@Query("select f from Flat f where f.price between ?1 and ?2 ")
	public List<Flat> findFLatPriceBetween(Integer price1,Integer price2);

}
