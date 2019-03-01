package com.metacube.shoppingCart.facade;



import com.metacube.shoppingCart.dao.*;
import com.metacube.shoppingCart.model.User;

public class UserFacade {
	FactoryDao factorydao = FactoryDao.getInstanceFactoryDao();
	UserDao userdao=factorydao.getInstanceOfUserDao();
	public static UserFacade userfacade;
	public void addUser(User u) {
		userdao.addUser(u);		
	}
	public static UserFacade getInstance(){
		if(userfacade == null) {
			userfacade = new UserFacade(); 
		}
		return userfacade;

	}
	
}