package com.masai.service;

import java.util.List;

import com.masai.models.Flat;

public interface FlatService {
	public List<Flat> findFlatByPriceLessThan(Integer price);

	public List<Flat> findFlatByPriceLessThanEqualTo(Integer price);

	public List<Flat> findFlatByPriceGreaterThan(Integer price);

	public List<Flat> findFlatByPriceBetween(Integer s_price,Integer e_price);
	
	public Flat addFlat(Flat flat);
}