package com.metacube.shoppingCart.view;



import java.util.List;
import java.util.Scanner;

import com.metacube.shoppingCart.Enum.Status;
import com.metacube.shoppingCart.controller.*;
import com.metacube.shoppingCart.model.*;
import com.metacube.shoppingCart.Enum.*;

public class ShoppingCartView {
	static FactoryController factorycontroller = FactoryController.getInstance();
	static Scanner sc=new Scanner(System.in);
	static ProductController pc = factorycontroller.getInstanceOfProductController();
	static UserCartController uc =factorycontroller.getInstanceOfUserCartCOntroller();
	static UserController usercontroller = factorycontroller.getInstanceOfUserController();
	public static void main(String[] args) {


		System.out.println("Add item to STOCK (Admin Task) :- ");
		System.out.println("Enter number of products");
		int noOfProduct=sc.nextInt();
		while(noOfProduct>0) {
			System.out.println("Enter the Product ID  :-");
			int id=sc.nextInt();sc.nextLine();
			System.out.println("Enter the Product Name  :-");
			String name=sc.nextLine();
			System.out.println("Enter the Product Code  :-");
			int code=sc.nextInt();
			System.out.println("Enter the Product Quantity  :-");
			int quantity=sc.nextInt();
			System.out.println("Enter the Product Price  :-");
			int price=sc.nextInt();
			Product p = new Product(id,name,code,quantity,price);
			System.out.println(Status.valueOf((pc.addProductInCart(p)).toString()));
			noOfProduct--;
		}
		
		System.out.println("Please Add User");
		System.out.println("Please Enter your ID :-");
		int id =sc.nextInt();sc.nextLine();
		System.out.println("Please Enter your Name  :-");
		String name=sc.nextLine();
		User u= new User (name,id);
		System.out.println(Status.valueOf((usercontroller.addUser(u)).toString()));
		System.out.println(Status.valueOf((usercontroller.changeUser(u)).toString()));
		List<Product> listofProducts=pc.getListOfProducts();
		for(Product items1 : listofProducts){
			System.out.println(items1.toString());
		}
		
		while(true) {
			System.out.println("Select any one :- \n 1. Add item in Cart\n 2. Remove Item from cart\n 3. Update Item in Cart\n 4. View Cart \n 5.Add User \n 6. Change user \n 7. Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the product code");
				int productCode=sc.nextInt();
				System.out.println(Status.valueOf((uc.addProductInCart(productCode)).toString()));
				break;
			case 2:
				System.out.println("Enter the product code");
				int productCode1=sc.nextInt();
				System.out.println(Status.valueOf((uc.removeProductInCart(productCode1)).toString()));
				break;
			case 3:
				System.out.println("Enter the product code");
				int productCode2=sc.nextInt();
				System.out.println("Enter the updated product Quantity");
				int quantity1=sc.nextInt();
				System.out.println(Status.valueOf((uc.updateProductInCart(productCode2,quantity1)).toString()));
				break;
			case 4:
				List<Product> listofUserProduct1=uc.viewCart();
				for(Product items : listofUserProduct1){
					System.out.println(items.toString());
				}
				break;

			case 5:
				System.out.println("Please Enter your ID :-");
				int id2 =sc.nextInt();sc.nextLine();
				System.out.println("Please Enter your Name  :-");
				String name2=sc.nextLine();
				User u2= new User (name2,id2);
				System.out.println(Status.valueOf((usercontroller.addUser(u2)).toString()));
				System.out.println(Status.valueOf((usercontroller.changeUser(u2)).toString()));
				break;
			case 6:
				System.out.println("Please Enter your ID :-");
				int id1 =sc.nextInt();sc.nextLine();
				System.out.println("Please Enter your Name  :-");
				String name1=sc.nextLine();
				User u1= new User (name1,id1);
				System.out.println(Status.valueOf((usercontroller.changeUser(u1)).toString()));
				break;
			case 7:
				System.exit(0);
				break;
			}
		}
	}
}