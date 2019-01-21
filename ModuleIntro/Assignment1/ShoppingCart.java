/**
 * @author VARSHA NAMDEV
 * @Date: 20/1/2019
 * Class name: ShoppingCart
 * @Description:
 *  @param:
 *  map1,map2, userinput:  hashmap table for stock as well as cart
 *  index1,index2,index3: variables for index or ID of product
 *  quantity1, quantity2: variables for no. of items to add in cart
 * 	total: total bill of shopped items 
*/
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
	
	class Items 
	{
		HashMap<String, Integer> map1 = new HashMap<>(); 
		HashMap<Integer, String> map2 = new HashMap<>(); 
	
		void create()
		{
			map1.put("Tee Shirt", 800);
			map1.put("Jeans", 2600);
			map1.put("Shoes", 490);
			map1.put("Denim", 620);
			map1.put("Jackets", 4500);
		
			map2.put(1, "Tee Shirt");
			map2.put(2, "Jeans");
			map2.put(3, "Shoes");
			map2.put(4, "Denim");
			map2.put(5, "Jackets");
		}
		
		void display()
		{
			System.out.println(map1);
		}
	
		void displayp()
		{
			System.out.println(map2);
		}
	}	
	
	class Icart
	{
		HashMap<Integer,Double> userinput = new HashMap<>(); 
		void AddItem()
		{ 
				int index1;
				double quantity1;
				System.out.println("Enter the ID");
				Scanner scan3= new Scanner(System.in);
				index1=scan3.nextInt();
				if(0<index1 && index1<6)
				{
					System.out.println("Enter the quantity");
					quantity1=scan3.nextDouble();
					userinput.put(index1, quantity1);
				}
				else
				{
					System.out.println("Enter among the given id");
				}
		}
	
		void DeleteItem()
		{
			int index2;
			System.out.println("Enter the ID");
			Scanner scan= new Scanner(System.in);
			index2=scan.nextInt();
			if(0<index2 && index2<6)
			{
				userinput.remove(index2);
			} 
			else
			{
				System.out.println("Enter valid ID");
			}
	
		}
	
		void UpdateCart()
		{
			int index3;
			double quantity2;
			System.out.println("Enter the ID");
			Scanner scan2= new Scanner(System.in);
			index3=scan2.nextInt();
			if(0<index3 && index3<6)
			{
				System.out.println("Update the Quantity");
				quantity2=scan2.nextDouble();
				userinput.put(index3, quantity2);
			}
			else
			{
				System.out.println("Enter the correct ID");
			}
		}
	
		void Bill()
		{
			System.out.println("Hello");
		}
	}
public class ShoppingCart
{
	public static void main(String[] args) 
	{
		int temporary=1;
		double variable,total=0;
		String string;
		Items stuff = new Items();
		Icart stuffis = new Icart();
		stuff.create();
		System.out.println("Items with their prices ");
		stuff.display();
		System.out.println("Items with their ids ");
		stuff.displayp(); 
		while(temporary!=0)
		{
			System.out.println("Select any one:- ");
			System.out.println("1.Add Item");
			System.out.println("2.Delete Item");
			System.out.println("3.Update Cart");
			System.out.println("4.Bill Amount");
			System.out.println("5.Display Cart");
			System.out.println("6.Exit");
			Scanner in = new Scanner(System.in);
			temporary=in.nextInt();
		
			switch (temporary) { 
				case 1: 
					stuffis.AddItem(); 
					break; 
					
				case 2: 
					stuffis.DeleteItem(); 
					break; 
					
				case 3: 
					stuffis.UpdateCart(); 
					break;
					
				case 4: 
					for(Map.Entry<Integer,Double> entry : stuffis.userinput.entrySet())
					{
						int userkey= entry.getKey();
						double userquant = entry.getValue();
						string=stuff.map2.get(userkey) ;
						variable= (stuff.map1.get(string)) * userquant;
					
						total+=variable;
						System.out.println(userkey+" "+string+" "+userquant+" "+variable);
					}
					System.out.println("Your total amount is "+total);
					break; 
					
				case 5: 
					for(Map.Entry<Integer,Double> entry : stuffis.userinput.entrySet())
					{
						int userkey= entry.getKey();
						double userquant = entry.getValue();
						string=stuff.map2.get(userkey) ;
						variable= (stuff.map1.get(string)) * userquant;
					
						total+=variable;
						System.out.println(userkey+" "+string+" "+userquant+" "+variable);
					}
					System.out.println("Your total amount is "+total);
					if(total==0)
					{
						System.out.println("Your cart is empty"); 
					}
					break; 
					
				case 6:
					temporary=0;
					break;
			
				default: 
					System.out.println("Invalid choice. Please enter again !");
					break;
			}
		}
	}
}