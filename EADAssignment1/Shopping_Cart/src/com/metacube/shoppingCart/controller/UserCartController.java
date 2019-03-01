package com.metacube.shoppingCart.controller;
import com.metacube.shoppingCart.Enum.Status;
import com.metacube.shoppingCart.model.Product;
import com.metacube.shoppingCart.model.*;
import com.metacube.shoppingCart.Enum.*;
import com.metacube.shoppingCart.facade.*;

import java.util.List;

public class UserCartController {
	FactoryFacade factoryfacade= FactoryFacade.getInstance();
	UserCartFacade uf = factoryfacade.getInstanceOfUserCartFacade();
	public static UserCartController usercartcontroller;

	public Status addProductInCart( int productCode){
		Product p =new Product(productCode);
		return uf.addProduct(p);
	}

	public Status removeProductInCart(int productCode) {
		Product p =new Product(productCode);
		return uf.deleteProduct(p);
	}

	public Status updateProductInCart(int productCode, int quantity) {
		Product p =new Product(productCode,quantity);
		return uf.updateProduct(p);
	}

	public List<Product> viewCart() {
		return (uf.displayCart());
	}
	public static UserCartController getInstance() {
		 if(usercartcontroller == null) {
			 usercartcontroller = new UserCartController();
		 }
		 return usercartcontroller;
	 }
}
