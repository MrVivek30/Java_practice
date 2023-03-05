package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {

	private static EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("student");

	}

	public static EntityManager getConnection() {
		return emf.createEntityManager();
	}

}
