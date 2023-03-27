package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.models.Flat;
import com.masai.repo.FlatRepo;
@Service
public class FlatServiceImpl implements FlatService {
@Autowired
private FlatRepo flatRepo;
	@Override
	public List<Flat> findFlatByPriceLessThan(Integer price) {
		List<Flat> flats=flatRepo.findFlatPriceLess(price);
		
				
		return flats;
	}

	@Override
	public List<Flat> findFlatByPriceLessThanEqualTo(Integer price) {
		// TODO Auto-generated method stub
		List<Flat> flats=flatRepo.findFlatPriceLessThan(price);
		return flats;
		
	}

	@Override
	public List<Flat> findFlatByPriceGreaterThan(Integer price) {
		// TODO Auto-generated method stub
		List<Flat> flats=flatRepo.findFlatPriceGreater(price);
		return flats;
	}

	@Override
	public List<Flat> findFlatByPriceBetween(Integer s_price, Integer e_price) {
		// TODO Auto-generated method stub
		List<Flat>flats=flatRepo.findFLatPriceBetween(s_price, e_price);
		return flats;
	}

	@Override
	public Flat addFlat(Flat flat) {
	Flat flat2=	flatRepo.save(flat);
		return flat2;
	}

}
