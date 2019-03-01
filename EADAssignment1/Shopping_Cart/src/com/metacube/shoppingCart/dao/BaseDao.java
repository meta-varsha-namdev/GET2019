package com.metacube.shoppingCart.dao;
import java.util.List;

import com.metacube.shoppingCart.model.*;
import com.metacube.shoppingCart.Enum.*;

  public interface BaseDao {
	public Status addProduct(Product p);
	public Status deleteProduct(Product p);
	public Status updateProduct(Product p);
	public List<Product> getAllProductList();

}
