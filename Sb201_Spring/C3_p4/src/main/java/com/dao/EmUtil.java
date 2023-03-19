package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {
private static final EntityManagerFactory emf;

static {
	emf=Persistence.createEntityManagerFactory("abc");
}

public static EntityManager getCon() {
	return emf.createEntityManager();
}
}
