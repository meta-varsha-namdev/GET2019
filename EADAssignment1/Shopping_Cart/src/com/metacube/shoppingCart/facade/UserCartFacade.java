package com.metacube.shoppingCart.facade;

import java.util.Iterator;

import com.metacube.shoppingCart.dao.*;
import com.metacube.shoppingCart.Enum.*;
import com.metacube.shoppingCart.model.*;

import java.util.List;
public class UserCartFacade {

	FactoryDao factorydao = FactoryDao.getInstanceFactoryDao();
	UserCartDao usercartdao;
	BaseDao productdao=factorydao.getInstanceOfProductDao();
	UserDao userdao=factorydao.getInstanceOfUserDao();
	public static UserCartFacade usercartfacade; 
	
	Product temp,temp1;

	public Status addProduct(Product p) {
		if( (isProductInStock(p))) {				
			if(!(isProductInList(p)) ){
				return usercartdao.addProduct(temp1);
			}
			else {
				temp.setQuantity(temp.getQuantity()+1);
				return Status.ADDED;
			}
		}
		return Status.NOT_VALID;

	}

	public boolean isProductInList (Product p) {
		if((usercartdao.getAllProductList()).size()==0)
			return false;
		
		Iterator<Product> itr=(usercartdao.getAllProductList()).iterator();

		while(itr.hasNext()) {
			temp = (Product)itr.next();
			if(temp.getProductCode()==p.getProductCode()) {
				return true;
			}
		}
		return false;
	}
	public boolean isProductInStock (Product p) {
		Iterator<Product> itr=productdao.getAllProductList().iterator();

		while(itr.hasNext()) {
			temp1 = (Product)itr.next();
			if(temp1.getProductCode()==p.getProductCode()) {
				return true;
			}
		}
		return false;
	}


	public Status deleteProduct(Product p) {
		if(usercartdao.getAllProductList().size() == 0) {
			return Status.CART_EMPTY;
		}
		if(isProductInList(p))
			return (usercartdao.deleteProduct(temp));

		return Status.PRODUCT_NOT_AVAILABLE;
	}

	public Status updateProduct(Product p) {
		if(isProductInList(p)) {
			temp.setQuantity(p.getQuantity());
			return Status.UPDATED;
		}	
		return Status.PRODUCT_NOT_AVAILABLE;
	}

	public List<Product> displayCart() {
		return (usercartdao.getAllProductList());
	}
	public Status getUser(User u) {
		this.usercartdao= userdao.getUserCart(u);
		return Status.USER_CHANGED;
	}
	public static UserCartFacade getInstance(){
		if(usercartfacade == null) {
			usercartfacade = new UserCartFacade(); 
		}
		return usercartfacade;

	}

	}

