package com.metacube.shoppingCart.dao;

public class FactoryDao
{
	private static FactoryDao f;

	private FactoryDao(){

	}

	public BaseDao getInstanceOfProductDao() {
		return ProductDao.getInstance();
	}

	
	public UserDao getInstanceOfUserDao() {
		return UserDao.getInstance();
	}

	public static FactoryDao getInstanceFactoryDao() {
		if(f==null){
			f=new FactoryDao();
		}
		return f;
	}
}
