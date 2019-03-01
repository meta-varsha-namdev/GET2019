package com.metacube.shoppingCart.facade;

public class FactoryFacade {
	public static FactoryFacade factoryfacade;
	
	public ProductFacade getInstanceOfProductFacade() {
		return ProductFacade.getInstance();
	}
	
	public UserCartFacade getInstanceOfUserCartFacade() {
		return UserCartFacade.getInstance();
	}
	
	public UserFacade getInstanceOfUserFacade() {
		return UserFacade.getInstance();
	}
	
	public static FactoryFacade getInstance(){
		if(factoryfacade == null) {
			factoryfacade = new FactoryFacade(); 
		}
		return factoryfacade;

	}

}