package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {

	private static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory=Persistence.createEntityManagerFactory("abc");
	}
	
	public static EntityManager getCon() {
		return entityManagerFactory.createEntityManager();
	}
}
