package com.metacube.shoppingCart.dao;
import com.metacube.shoppingCart.Enum.Status;
import com.metacube.shoppingCart.model.*;

import java.util.HashMap;

public class UserDao {
	 static HashMap<User,UserCartDao> mp = new HashMap<User,UserCartDao>();
	static  UserDao userdao;

	private UserDao() {
		
	}
	public Status addUser(User u) {
		UserCartDao uc = new UserCartDao();
		mp.put(u,uc);
		return Status.ADDED;
	}
	public UserCartDao getUserCart(User u) {
		for(User user :mp.keySet()){
			if(user.getId() == u.getId() && user.getName() == u.getName())
			return mp.get(user);
		}
		return null;
	}
	public HashMap<User, UserCartDao> getAllUserCart() {
		return mp;
	}
	public static UserDao getInstance(){
		if(userdao==null) {
			userdao = new UserDao(); 
		}
		return userdao;

	}
	

}
