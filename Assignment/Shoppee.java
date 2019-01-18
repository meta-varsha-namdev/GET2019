

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

class Items{
	
	HashMap<String, Integer> map1 = new HashMap<>(); 
	HashMap<Integer, String> map2 = new HashMap<>(); 
	
	void create(){
	
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
	void display(){
		System.out.println(map1);
	}
	
	void displayp(){
		System.out.println(map2);
	}
}	
	class Icart{
		HashMap<Integer,Double> userinp = new HashMap<>(); 
		void AddItem()
		{   int index;
			double quant;
			System.out.println("Enter the ID");
			 Scanner n= new Scanner(System.in);
	         index=n.nextInt();
	         System.out.println("Enter the quantity");
	         quant=n.nextDouble();
	         userinp.put(index, quant);
	     }
		
		void DeleteItem()
		{
			int index;
			System.out.println("Enter the ID");
			 Scanner n= new Scanner(System.in);
	         index=n.nextInt();
			userinp.remove(index);
			
		}
		
		void UpdateCart(){
			int index;
			double quant;
			System.out.println("Enter the ID");
			Scanner n= new Scanner(System.in);
			index=n.nextInt();
			System.out.println("Update the Quantity");
			quant=n.nextDouble();
			userinp.put(index, quant);
		}
		
		void Bill()
		{System.out.println("Hello");}
		
	}
	public class Shoppee {
		   
		public static void main(String[] args) {
		       int tmp=1;
		       double t1,total=0;
		       String str;
	          Items s = new Items();
	          Icart s1 = new Icart();
	          s.create();
	          System.out.println("Items with their prices ");
	          s.display();
	          System.out.println("Items with their ids ");
	          s.displayp();  
	          while(tmp!=0)
	          {
	        	  System.out.println("Select any one:- ");
	          System.out.println("1.Add Item");
	          System.out.println("2.Delete Item");
	          System.out.println("3.Update Cart");
	          System.out.println("4.Bill Amount");
	          System.out.println("5.Display Cart");
	          System.out.println("6.Exit");
	          Scanner in = new Scanner(System.in);
	          tmp=in.nextInt();
	          
	          switch (tmp) { 
	          case 1: 
	              s1.AddItem(); 
	              break; 
	          case 2: 
	              s1.DeleteItem(); 
	              break; 
	          case 3: 
	              s1.UpdateCart(); 
	              break; 
	          case 4: 
	              for(Map.Entry<Integer,Double> entry : s1.userinp.entrySet())
	              {
	            	  int userkey= entry.getKey();
	            	  double userquant = entry.getValue();
	            	  str=s.map2.get(userkey) ;
	            	  t1= (s.map1.get(str)) * userquant;
	            	 
	            	  total+=t1;
	            	  System.out.println(userkey+"  "+str+"  "+userquant+"  "+t1);
	              }
	              System.out.println("Your total amount is "+total);
	              break; 
	          case 5:  
	        	  for(Map.Entry<Integer,Double> entry : s1.userinp.entrySet())
	              {
	            	  int userkey= entry.getKey();
	            	  double userquant = entry.getValue();
	            	  str=s.map2.get(userkey) ;
	            	  t1= (s.map1.get(str)) * userquant;
	            	 
	            	  total+=t1;
	            	  System.out.println(userkey+"  "+str+"  "+userquant+"  "+t1);
	              }
	              System.out.println("Your total amount is "+total);
	               if(total==0)
	               {
	            	   System.out.println("Your cart is empty"); 
	               }
	              break; 
	          case 6:
	        	  tmp=0;
	        	  break;
	        	  
	          default: 
	              System.out.println("Invalid choice. Please enter again !");
	              break;
	          }
	          }
		}
	}
	
	          
	       


	          
	      
