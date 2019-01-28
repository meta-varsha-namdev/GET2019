import java.util.Scanner;
public class IntSetMain {

	public static void main(String[] args)
	{
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int length= scan.nextInt();
		int elements[]= new int[length];
		System.out.println("Enter the elements of an array");
		for(int index=0; index<length; index++)
		{
			elements[index]=scan.nextInt();
		}
		IntSet intset= new IntSet(elements);
		System.out.println("Enter the choice of operation:\n1. Is Member\n2. Size\n3. Is SubSet\n4. Get Complement\n5. Union");
		int choice=scan.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			boolean result;
			System.out.println("Enter the value you want to check in an array");
			int value_is= scan.nextInt();
			result= intset.valueCheck(value_is);
			if(result==true)
				System.out.println("The value is present");
			else
				System.out.println("The value is not present");
			break;
		}
		
		case 2:
		{
			System.out.println("The size of an array is:"+intset.size_array(elements));
			break;
		}
		
		case 3:
		{
			boolean result_is;
			System.out.println("Enter the length of an array");
			int length1= scan.nextInt();
			int subset_array[]= new int[length1];
			System.out.println("Enter the new array elements");
			for(int index=0; index<length1; index++)
			{
				subset_array[index]=scan.nextInt();
			}
			IntSet intset1= new IntSet(subset_array);
			result_is=intset.isSubSet(intset1);
			if(result_is==true)
				System.out.println("Subset is present");
			else
				System.out.println("Subset is not present");
			break;
		}
		
		case 4:
		{
			int complement_array[]= new int[1000-length];
			IntSet intset_is= new IntSet(elements);
			complement_array=intset.isComplement();
			System.out.println("The complemented array is");	
			for(int index=0; index<complement_array.length; index++)
			{
				System.out.print(complement_array[index]);
			}
		}
		
		case 5:
		
			System.out.println("Enter the length of first array");
			int length3= scan.nextInt();
			int elements_1[]= new int[length3];
			System.out.println("Enter the elements of an array");
			for(int index=0; index<length3; index++)
			{
				elements_1[index]=scan.nextInt();
			}
			System.out.println("Enter the length of second array");
			int length4= scan.nextInt();
			int[] union_array=new int[length3+length4];
			int elements_2[]= new int[length4];
			System.out.println("Enter the elements of an array");
			for(int index=0; index<length4; index++)
			{
				elements_2[index]=scan.nextInt();
			}
			IntSet intset_is_1= new IntSet(elements_1);
			IntSet intset_is_2= new IntSet(elements_2);
			System.out.println("The union of array is:");
			union_array=intset.union(intset_is_1, intset_is_2);
			for(int index=0; index<(length3+length4); index++)
			{
				System.out.print(union_array[index]);
			}
			
				
			}
		}
	}


