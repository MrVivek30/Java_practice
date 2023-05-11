package com.masai.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entities.Cab;
import com.masai.Repository.CabRepository;

@Service
public class CabServiceImpl implements CabService{
	
	@Autowired
	private CabRepository cabRep;

	@Override
	public Cab registerCab(Cab cab) {
		return cabRep.save(cab);
	}

}
