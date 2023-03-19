package com.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dto.CabOwner;
import com.exception.CabOwnerNotFoundException;

public class CabDaoImpl implements CabDao {

	public CabOwner createCabOwner(CabOwner cabOwner) throws CabOwnerNotFoundException {
		// TODO Auto-generated method stub
		EntityManager eManager=EmUtil.getCon();
		
		eManager.getTransaction().begin();
		CabOwner cabOwner2=eManager.find(CabOwner.class, cabOwner.getOwnerId());
		if (cabOwner2!=null) {
			throw new CabOwnerNotFoundException();
		}
		eManager.persist(cabOwner);
		eManager.getTransaction().commit();
		eManager.close();
		return cabOwner;
	}

	public List<CabOwner> getCabOwners() throws CabOwnerNotFoundException {
EntityManager eManager=EmUtil.getCon();
		
		eManager.getTransaction().begin();
		
		Query query=eManager.createQuery("from CabOwner");
		List<CabOwner> list=query.getResultList();
		if(list.isEmpty()) {
			throw new CabOwnerNotFoundException();
		}
		
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			CabOwner cabOwner = (CabOwner) iterator.next();
//			System.out.println();
//		}
		
		eManager.getTransaction().commit();
		eManager.close();
		return list;
	}

}
