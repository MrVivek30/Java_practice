package com.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.dto.Subscription;

public class StreamMasterDAOImpl  implements StreamMasterDAO{

	public Subscription findSubscriptionById(int id) {
		// TODO Auto-generated method stub
		
		EntityManager entityManager=EmUtil.getCon();
		
		Subscription subscription=entityManager.find(Subscription.class,id);
		if (subscription==null) {
			return null;
		}
		entityManager.close();
		
		return subscription;
	}

	public List<Subscription> findSubscriptionsByName(String name) {
		// TODO Auto-generated method stub
		EntityManager entityManager=EmUtil.getCon();
		entityManager.getTransaction().begin();
		Query query=entityManager.createQuery("Select s from Subscription s where s.name=?1");
		
		List<Subscription>list=query.getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		return list;
	}

	public String saveSubscription(Subscription subscription) {
		// TODO Auto-generated method stub
		String msg="Saved successfully";
		EntityManager entityManager=EmUtil.getCon();
		entityManager.getTransaction().begin();
		entityManager.persist(subscription);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return msg;
	}

	public String deleteSubscriptionById(int id) {
		// TODO Auto-generated method stub
		String msg= "deleted successfully";
		EntityManager entityManager=EmUtil.getCon();
		entityManager.getTransaction().begin();
		Subscription subscription=entityManager.find(Subscription.class,id);
		if (subscription==null) {
			return null;
		}
		entityManager.remove(subscription);
		entityManager.getTransaction().commit();
		entityManager.close();
		return msg;
	}

	public String updatePrice(int new_price, int id) {
		// TODO Auto-generated method stub
		String msg= "updated successfully";
		EntityManager entityManager=EmUtil.getCon();
		entityManager.getTransaction().begin();
		Subscription subscription=entityManager.find(Subscription.class,id);
		if (subscription==null) {
			return null;
		}
		subscription.setPrice(new_price);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return msg;
	}

	public String extendSubscription(int extra_days, int id) {
		String msg= "Extended successfully";
		EntityManager entityManager=EmUtil.getCon();
		entityManager.getTransaction().begin();
		Subscription subscription=entityManager.find(Subscription.class,id);
		if (subscription==null) {
			return null;
		}
//		subscription.set
//		entityManager.getTransaction().commit();
		entityManager.close();
		
		return msg;
	}

	public String updatePlanName(String new_plan_name, int id) {
		// TODO Auto-generated method stub
		String msg= "updated planName successfully";
		EntityManager entityManager=EmUtil.getCon();
		entityManager.getTransaction().begin();
		Subscription subscription=entityManager.find(Subscription.class,id);
		if (subscription==null) {
			return null;
		}
		subscription.setPlan_name(new_plan_name);
		entityManager.getTransaction().commit();
		entityManager.close();
		return msg;
	}

	public List<Subscription> findSubscriptionsByPlan(String plan_name) {
		EntityManager entityManager=EmUtil.getCon();
		entityManager.getTransaction().begin();
		Query query=entityManager.createQuery("Select s from Subscription s where s.plan_name=?1");
		
		List<Subscription>list=query.getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		return list;
	}

	public List<Subscription> findSubscriptionsByDateRange(Date start_date, Date end_date) {
		// TODO Auto-generated method stub
		
		EntityManager entityManager=EmUtil.getCon();
		entityManager.getTransaction().begin();
		 TypedQuery<Subscription> query = entityManager.createQuery(
			        "Select s from Subscription s WHERE s.start_date >= ?1 AND s.end_date <= ?2", Subscription.class
			    );
			    query.setParameter("start_date", start_date);
			    query.setParameter("end_date", end_date);
		List<Subscription>list=query.getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		return list;
		
	}

}
