package com.metacube.shoppingCart.controller;

import com.metacube.shoppingCart.Enum.Status;
import com.metacube.shoppingCart.facade.*;
import com.metacube.shoppingCart.facade.UserFacade;
import com.metacube.shoppingCart.model.User;

public class UserController {

	FactoryFacade factoryfacade= FactoryFacade.getInstance();
	UserFacade userf = factoryfacade.getInstanceOfUserFacade();
	UserCartFacade usercartfacade = factoryfacade.getInstanceOfUserCartFacade();
	
	public static UserController usercontroller;
	public Status addUser(User u) {
		 userf.addUser(u);
		 return Status.ADDED;
		
	}
	public Status changeUser(User u) {
		return usercartfacade.getUser(u);
		
	}
	public static UserController getInstance() {
		 if(usercontroller == null) {
			 usercontroller = new UserController();
		 }
		 return usercontroller;
	 }

}
