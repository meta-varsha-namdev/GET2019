package com.metacube.shoppingCart.controller;

public class FactoryController 
{
public static FactoryController factorycontroller;
	
	public ProductController getInstanceOfProductController() {
		return ProductController.getInstance();
	}
	public UserCartController getInstanceOfUserCartCOntroller() {
		return UserCartController.getInstance();
	}
	public UserController getInstanceOfUserController() {
		return UserController.getInstance();
	}
	
	public static FactoryController getInstance() {
		if(factorycontroller == null){
			factorycontroller = new FactoryController();
		}
		return factorycontroller;
		
	}
}
