/**
@author: Varsha Namdev
@Date: 17/1/2019
Class Name: HexCalc
@Description: Hexadecimal to decimal and vice versa and operations on hexadecimal like arithmetic operation, conversion, comparison
*/
import java.util.Scanner;
import java.util.*;
public class HexCalc {
	
	public static boolean compare1(String one, String two)
	{
		int comparisonResult = one.compareTo(two);
		if (comparisonResult < 0)
		{
		    return false;// hash1 is less
		}
		else if (comparisonResult > 0)
		{
			return true;// hash1 is less
		}
		else 
		{
			return false; // comparisonResult == 0: hash1 compares
		}
	}
	
	public static boolean compare2(String one, String two)
	{
		int comparisonResult = one.compareTo(two);
		if (comparisonResult < 0)
		{
		    return true;// hash1 is less
		}
		else if (comparisonResult > 0)
		{
			return false;// hash1 is less
		}
		else 
		{
			return false; // comparisonResult == 0: hash1 compares
		}
	}
	
	public static boolean compare3(String one, String two)
	{
		int comparisonResult = one.compareTo(two);
		if (comparisonResult < 0)
		{
		    return true;// hash1 is less
		}
		else if (comparisonResult > 0)
		{
			return false;// hash1 is less
		}
		else 
		{
			return false; // comparisonResult == 0: hash1 compares
		}
	}
	
	public static int hexToDecimal(String value1)
	{
		int out;
		out=Integer.parseInt(value1,16);
		return out;
	}
	public static int operationperform(String str1,String str2)
	{
		int val1,val2,sol=0;
		String operator;
		val1=Integer.parseInt(str1,16);
		val2=Integer.parseInt(str2,16);
		System.out.println("Enter the operation: +,-,*,/");
		Scanner sc=new Scanner(System.in);
		operator=sc.next();
		try
		{
		switch(operator)
		{
			case "+":
				{
					sol=val1+val2;
					break;
				}
			case "-":
				{
					sol=val1-val2;
					break;
				}
			case "*":
				{
					sol=val1*val2;
					break;
				}
			case "/":
				{
					sol=val1/val2;
					break;
				}
			default:
				{
					System.out.println("Enter valid operation");
					break;
				}
		}
		return sol;
		} catch(NumberFormatException n)
		{
			System.out.println("Option out of approach");
		}
	}

	public static String decimalConvert(int p)
	{
		String str=Integer.toHexString(p);
		return str;
	}
	
	public static void main(String[] args) {
		int typeoperation, preference;
		String result, temporary1, temporary2;
		int tmp, newvalue;
		boolean output1, output2, output3, t=true;
		while(t=true)
		{
			System.out.println("What type of operation you want to perform? 1. Arithmetic operation 2. Comparison 3. Conversion(Hexadecimal-> Decimal 4. Conversion(Decimal-> Hexadecimal)");
			Scanner sc= new Scanner(System.in);
			typeoperation=sc.nextInt();
			try
			{
				if(typeoperation==1)
				{
					System.out.println("Enter the two hexadecimal no");
					Scanner scan= new Scanner(System.in);
					temporary1=scan.next();
					temporary2=scan.next();
					tmp=operationperform(temporary1, temporary2);
					result=decimalConvert(tmp);
					System.out.println(result);
				}
				
				if(typeoperation==2)
				{
					System.out.println("Enter the two hexadecimal no");
					Scanner scan=new Scanner(System.in);
					temporary1=scan.next();
					temporary2=scan.next();
					try
					{
						System.out.println("At what condition you want to check? 1. String one is greater 2. String two is greater 3. Both are equal");
						Scanner scann=new Scanner(System.in);
						preference=scann.nextInt();
						
						if(preference==1)
						{
							output1= compare1(temporary1, temporary2);	
							System.out.println(output1);
						}
						if(preference==2)
						{
							output2= compare2(temporary1, temporary2);	
							System.out.println(output2);
						}
						if(preference==3)
						{
							output3= compare3(temporary1, temporary2);	
							System.out.println(output3);
						}
				}
				catch(ArithmeticException c)
				{
					System.out.println("Invalid input");
				}
			}
			
			if(typeoperation==3)
			{
				try
				{
					System.out.println("Enter the hexadecimal no");
					Scanner scan=new Scanner(System.in);
					temporary1=scan.next();
					System.out.println("Hexadecimal to decimal conversion of input string is");
					System.out.println(hexToDecimal(temporary1));
				}
				catch(ArithmeticException b)
				{
					System.out.println("Invalid input");
				}
			}
			
			if(typeoperation==4)
			{
				try
				{
					System.out.println("Enter the decimal no");
					Scanner scan=new Scanner(System.in);
					newvalue=scan.nextInt();
					System.out.println("Decimal to Hexadecimal conversion of input is");
					System.out.println(decimalConvert(newvalue));
				}
				catch(ArithmeticException a)
				{
					System.out.println("Invalid input");
				}
			}
		} catch(NumberFormatException m)
			{
				System.out.println("Invalid choice");
			}
		}
	}
}

