package com.metacube.shoppingCart.dao;
import com.metacube.shoppingCart.Enum.Status;
import com.metacube.shoppingCart.model.*;

import java.util.ArrayList;
import java.util.List;

public class UserCartDao implements BaseDao {
	
	public  List<Product> listOfProduct = new ArrayList<Product>();


	@Override
	public Status addProduct(Product p) {
		listOfProduct.add(p);
		return Status.ADDED;
		
		
	}

	@Override
	public Status deleteProduct(Product p) {
		listOfProduct.remove(p);
		return Status.DELETED;
		
		
	}

	@Override
	public Status updateProduct(Product p) {
		return Status.UPDATED;
		
		
	}
	public List<Product> getAllProductList() {
		return listOfProduct;
		}
}
