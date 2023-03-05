package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtils {

	private static EntityManagerFactory entityManagerFactory;

	static {

		entityManagerFactory = Persistence.createEntityManagerFactory("book-unit");
	}

	public static EntityManager getConnection() {
		
		return entityManagerFactory.createEntityManager();

	}
}
