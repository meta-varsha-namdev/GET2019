package com.metacube.shoppingCart.controller;
import java.util.List;

import com.metacube.shoppingCart.Enum.Status;
import com.metacube.shoppingCart.model.Product;
import com.metacube.shoppingCart.model.*;
import com.metacube.shoppingCart.Enum.*;
import com.metacube.shoppingCart.facade.*;

public class ProductController 
{
	FactoryFacade factoryfacade= FactoryFacade.getInstance();
	ProductFacade pf = factoryfacade.getInstanceOfProductFacade();
	public static ProductController productcontroller;

	public Status addProductInCart(Product p) 
	{
		return (pf.addProduct(p));	
	}

	public List<Product> getListOfProducts() 
	{
		return pf.getAll();
	}
	
	 public static ProductController getInstance()
	 {
		 if(productcontroller == null)
		 {
			 productcontroller = new ProductController();
		 }
		 return productcontroller;
	 }
}