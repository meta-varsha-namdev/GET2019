package com.metacube.shoppingCart.dao;
import com.metacube.shoppingCart.Enum.Status;
import com.metacube.shoppingCart.model.*;

import java.util.ArrayList;

import java.util.List;


public class ProductDao implements BaseDao {
	private static ProductDao product_dao;

 private  List<Product> productlist = new ArrayList<Product>();

	@Override
	public Status addProduct(Product p) {
		productlist.add(p);
		return Status.ADDED;
		
	}

	@Override
	public Status deleteProduct(Product p) {
		// TODO Auto-generated method stub
		productlist.remove(p);
	return Status.DELETED;
	}

	@Override
	public Status updateProduct(Product p) {
		// TODO Auto-generated method stub
		return Status.UPDATED;
	}
	
	public static BaseDao getInstance(){
		if(product_dao==null) {
		product_dao = new ProductDao(); 
		}
		return product_dao;

	}
	public List<Product> getAllProductList() {
		return productlist;
	}
	
}