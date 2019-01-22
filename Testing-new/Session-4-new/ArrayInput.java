import java.util.Scanner;
public class ArrayInput
{
 Scanner scan= new Scanner(System.in);
 
 public int[] arrayElements()
 {
	 System.out.println("Enter the size of an array");
	 int size= scan.nextInt();
	 int array[]=new int[size];
	 System.out.println("Enter the elements of array");
	 for( int count=0; count<size; count++ )
	 {
		 int value=scan.nextInt();
		 array[count]=value;
	 }
	 return array;
 }
 
 public int choice()
 {
	 System.out.println("Enter the choise among: \n 1. Find Mirror section in array \n 2. Find clump in an array\n3. Fix XY Problem\n 4. Split Array");
	 int choice_is=scan.nextInt();
	 return choice_is;
 }
}
