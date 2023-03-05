package com.dao;

public class UniversityUtil {

	public static UniversityDao getInstance (String dao) {
		if (!dao.equals("jdbc")&&!dao.equals("orm")) {
			return null;
		}if (dao.equals("jdbc")) {
			return new UniversityDaoJdbcImpl();
		}
		return new UniversityDaoOrmImpl();
		
	}
}
