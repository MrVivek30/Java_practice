package com.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dto.ChickenBiryani;
import com.dto.VegBiryani;
import com.exception.BiryaniException;

public class BiryaniDaoImpl implements BiryaniDao {

	public VegBiryani insertVegBiryani(VegBiryani vegBiryani) throws BiryaniException {
		// TODO Auto-generated method stub
		EntityManager entityManager = EmUtil.getCon();
//		Query query=entityManager.createQuery("from ");
		entityManager.getTransaction().begin();
		entityManager.persist(vegBiryani);
		entityManager.getTransaction().commit();
		entityManager.close();

		return vegBiryani;
	}

	public ChickenBiryani insertChickenBiryani(ChickenBiryani chickenBiryani) throws BiryaniException {
		EntityManager entityManager = EmUtil.getCon();
//		Query query=entityManager.createQuery("from ");
		entityManager.getTransaction().begin();

		entityManager.persist(chickenBiryani);

		entityManager.getTransaction().commit();
		entityManager.close();
		return chickenBiryani;
	}

	public VegBiryani getVegBiryani(int id) throws BiryaniException {
		EntityManager entityManager = EmUtil.getCon();
		entityManager.getTransaction().begin();

		Query query = entityManager.createQuery("from VegBiryani where VegBiryaniId=?1");
		query.setParameter(1, id);
		VegBiryani vegBiryani = (VegBiryani) query.getSingleResult();

		entityManager.getTransaction().commit();
		entityManager.close();
		return vegBiryani;
	}

	public ChickenBiryani getChickenBiryani(int id) throws BiryaniException {
		EntityManager entityManager = EmUtil.getCon();
//	
		entityManager.getTransaction().begin();
		Query query=entityManager.createQuery("from ChickenBiryani where chickenBiryaniId=?1");
		query.setParameter(1, id);
		ChickenBiryani ChickenBiryani = (ChickenBiryani) query.getSingleResult();

		entityManager.getTransaction().commit();
		entityManager.close();
		return ChickenBiryani;
	}

	public List<ChickenBiryani> getAllChickenBiryanis() throws BiryaniException {
		
		EntityManager entityManager = EmUtil.getCon();
	//	
			entityManager.getTransaction().begin();
			Query query=entityManager.createQuery("from ChickenBiryani");
			
			List<ChickenBiryani>chickenBiryanis=query.getResultList();
			
//			for (Iterator iterator = chickenBiryanis.iterator(); iterator.hasNext();) {
//				ChickenBiryani chickenBiryani = (ChickenBiryani) iterator.next();
//				
//			}
				
			for (ChickenBiryani chickenBiryani : chickenBiryanis) {
				System.out.println(chickenBiryani);
			}
			entityManager.getTransaction().commit();
			entityManager.close();
			return chickenBiryanis;
		
		
	}

	public List<VegBiryani> getallVegBiryanis() throws BiryaniException {
		EntityManager entityManager = EmUtil.getCon();
		entityManager.getTransaction().begin();

		Query query = entityManager.createQuery("from VegBiryani");
		
		List<VegBiryani>vegBiryanis=query.getResultList();
		
		for(VegBiryani vegBiryani:vegBiryanis) {
			System.out.println(vegBiryani);
		}
		entityManager.getTransaction().commit();
		entityManager.close();
		return vegBiryanis;
	}

	public List<ChickenBiryani> getAllChickenWhosepriceis() throws BiryaniException {
		EntityManager entityManager = EmUtil.getCon();
		//	
				entityManager.getTransaction().begin();
				Query query=entityManager.createQuery("from ChickenBiryani where price<500");
				
				List<ChickenBiryani>chickenBiryanis=query.getResultList();
				
//				for (Iterator iterator = chickenBiryanis.iterator(); iterator.hasNext();) {
//					ChickenBiryani chickenBiryani = (ChickenBiryani) iterator.next();
//					
//				}
					
				for (ChickenBiryani chickenBiryani : chickenBiryanis) {
					System.out.println(chickenBiryani);
				}
				entityManager.getTransaction().commit();
				entityManager.close();
				return chickenBiryanis;

		
	}

}
