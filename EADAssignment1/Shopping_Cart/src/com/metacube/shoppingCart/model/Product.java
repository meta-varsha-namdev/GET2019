package com.metacube.shoppingCart.model;

public class Product 
{
	String name;
	int id;
	int productCode;
	int quantity;
	public Product(int code) {
		this.productCode=code;
	}
	public Product(int code, int quantity) {
		this.productCode=code;
		this.quantity=quantity;
	}
	public Product( int id,String name, int code, int quantity, int price) {
		this.name = name;
		this.id = id;
		this.productCode = code;
		this.price = price;
		this.quantity=quantity;
	}
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int  getProductCode() {
		return productCode;
	}
	public void setProductCode(int  productCode) {
		this.productCode = productCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [ Name=" + getName() + " , ID = " + getId()
				+ ", Quantity= " + getQuantity() + " , product code= "
				+ getProductCode() + " , Price= " + getPrice() + "]";
	}
}
