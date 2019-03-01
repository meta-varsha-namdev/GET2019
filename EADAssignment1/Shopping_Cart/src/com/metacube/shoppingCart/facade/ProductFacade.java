package com.metacube.shoppingCart.facade;

import java.util.Iterator;
import java.util.List;

import com.metacube.shoppingCart.dao.*;
import com.metacube.shoppingCart.Enum.*;
import com.metacube.shoppingCart.model.*;

public class ProductFacade {
	FactoryDao factorydao = FactoryDao.getInstanceFactoryDao();
	BaseDao productdao=factorydao.getInstanceOfProductDao();
	public static ProductFacade productfacade;
	Product temp;

	public Status addProduct(Product p) {
		if(!(isProductInList(p)))
			return productdao.addProduct(p);
		return Status.PRODUCT_ALREADY_AVAILABLE;
	}

	public boolean isProductInList (Product p) {
		Iterator<Product> itr=productdao.getAllProductList().iterator();

		while(itr.hasNext()) {
			temp = (Product)itr.next();
			if(temp.getProductCode()==p.getProductCode()) {
				return true;
			}
		}
		return false;
	}



	public Status deleteProduct(Product p) {
		if(isProductInList(p))
			return (productdao.deleteProduct(temp));

		return Status.PRODUCT_NOT_AVAILABLE;
	}

	public Status updateProduct(Product p) {
		if(isProductInList(p))
			temp.setQuantity(temp.getQuantity()+p.getQuantity());
		return Status.PRODUCT_NOT_AVAILABLE;
	}
	public List<Product> getAll() {
		return productdao.getAllProductList();
	}
	public static ProductFacade getInstance(){
		if(productfacade == null) {
			productfacade = new ProductFacade(); 
		}
		return productfacade;

	}
}