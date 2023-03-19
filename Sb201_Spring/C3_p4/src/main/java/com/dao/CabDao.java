package com.dao;

import java.util.List;

import com.dto.CabOwner;
import com.exception.CabOwnerNotFoundException;

public interface CabDao {

	public CabOwner createCabOwner(CabOwner cabOwner) throws CabOwnerNotFoundException;

	public List<CabOwner> getCabOwners() throws CabOwnerNotFoundException;

}
