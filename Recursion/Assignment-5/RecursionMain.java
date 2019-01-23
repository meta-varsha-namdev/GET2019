import java.util.Scanner;
public class RecursionMain 
{
	
	public static void main(String[] args)
	{
	 System.out.println("Enter the choice from:\n1. Find LCM HCF \n2. Search\n3. N-Queens Problem");
	 Scanner scan1=new Scanner(System.in);
	 int choice_entered= scan1.nextInt();
	 Search search= new Search();
	 
	 switch(choice_entered)
	 {
		 case 1:
		 {
			 FindLCM find_lcm=new FindLCM();
			 FindHCF find_hcf=new FindHCF();
			 System.out.println("please enter two no's.");
			 Scanner scan2= new Scanner(System.in);
			 int number1_is= scan2.nextInt();
			 int number2_is= scan2.nextInt();
			 int parameter=0;
			 if(number1_is>number2_is)
			 {
				 parameter= number1_is;
			 }
			 else
			 {
				 parameter= number2_is;
			 }
			int lcm_result= find_lcm.findLCM(number1_is, number2_is, parameter);
			 int hcf_result= find_hcf.findHCF(number1_is, number2_is);
			 System.out.println("The lcm is"+ lcm_result);
			 System.out.println("The hcf is"+ hcf_result);
			 break;
		 } 
		
		 case 2:
		 {
			 // Linear search
			 
			 System.out.println("Linear Search:\n");
			 System.out.println("please enter the length of an array");
			 Scanner scan3= new Scanner(System.in);
			 int array_length= scan3.nextInt();
			 int[] array_is=new int[array_length];
			 
			 System.out.println("please enter the elements of an array");
			
			 for(int counter=0; counter<array_length; counter++)
			 {
				 Scanner scan4= new Scanner(System.in);
				 array_is[counter]=scan4.nextInt();
			 }
			 System.out.println("please enter the element whose index you want to find in an array");
			 Scanner scan4= new Scanner(System.in);
			 int element_is= scan4.nextInt();
			 int first_is=0;
			 int index=search.searchLinear(element_is, array_is, first_is);
			 if(index==-1)
			 {
				 System.out.println("No elements in array");
			 }
			 else if(index==-2) 
			 {
				 System.out.println("Array index is out of bound");
			 }
			 else 
				 System.out.println(index);
			 
			 //Binary search
			 
			 System.out.println("Binary Search:\n");
			 int start1=0;
			 System.out.println("please enter the length of an array");
			 Scanner scan5= new Scanner(System.in);
			 int array_1_length= scan5.nextInt();
			 int[] array_1_is=new int[array_1_length];
			 System.out.println("please enter the elements of an array");
			
			 for(int counter=0; counter<array_1_length; counter++)
			 {
				 Scanner scan6= new Scanner(System.in);
				 array_1_is[counter]=scan6.nextInt();
			 }
			 Sorting sort=new Sorting();
			 int[] collection_sort=sort.sorting(array_1_is);
			 int collection_length=collection_sort.length;
			 System.out.println("The sorted array is");
			 
			 for( int start=0;start<collection_length; start++)
			 {
				 System.out.println(collection_sort[start]);
			 }
			 
			 System.out.println("please enter the element whose index you want to find in an array");
			 Scanner scan6= new Scanner(System.in);
			 int element_1_is= scan6.nextInt();
			 int result_array=search.searchBinary(element_1_is, collection_sort,start1,collection_length );
			 
			 if(result_array==-1)
			 {
				 System.out.println("Element not present");
			 }
			 if(result_array==-2)
			 {
				 System.out.println("Array index is out of bound");
			 }
			 else
			 {
				 System.out.println("The index at which the element is found is "+result_array);
			 }
		 }
		 
		 case 3:
		}
	}
}



