/**
 * @author: Varsha Namdev
 * Date: 19/1/2019
 * @Description: Performing operations like comparison, case conversion, 
 * Reversal, Finding largest word of the string on String
 * @param:
 * compare: Function to compare two strings
 * reverse:to find reverse of a string
 * conversion:to convert lower case to upper case string and vice versa 
 * returnlargest: It returns the largest word of the sting, and also if
 * 2 strings are equal then 2nd one
 * @return:
 * input: Return largest word of the string
 * Specifications:
 * Require:Any string  
 * Effect: 
 * compare: Function to compare two strings
 * reverse:to find reverse of a string
 * conversion:to convert lower case to upper case string and vice versa 
 */
import java.util.InputMismatchException;
import java.util.Scanner; 
public class StringOperation {
	public static int compare(String value1, String value2)
	{
		int flag=0;
		int length1= value1.length();
		int length2= value2.length();
		for(int i=0;i<length1 && i<length2 ;i++)
		{
			int character1=(int)value1.charAt(i);
			int character2=(int)value2.charAt(i);
			if(character1==character2)
			{
				continue;
			}
			else
			{
				flag=character1-character2;
				break;
			}	
		}
		if(flag==0)
			return 1;
		else
			return 0;	
	}
	
	public static void reverse(String parameter)
	{
		int length3= parameter.length();
		System.out.println("The reverse array is:");
		for(int i=0;i<length3 ;i++)
		{
			System.out.print(parameter.charAt(length3-1-i));
		}
	}
	
	public static void conversion(String parameter1)
	{
		char character;
		char number;
		int length4= parameter1.length();
		
			for(int i=0;i<length4 ;i++)
			{
				if(48<=parameter1.charAt(i) && parameter1.charAt(i)<=57)
				{
					System.out.print("Give only alphabets");
				}
				else
				{
					if(parameter1.charAt(i)!=32 && ('A'<=parameter1.charAt(i) && parameter1.charAt(i)<='Z'))
					{
						char variable=(char) (parameter1.charAt(i)+32);
						System.out.print(variable);
					}
					else if (parameter1.charAt(i)!=32 && ('a'<=parameter1.charAt(i) && parameter1.charAt(i)<='z'))
					{
						char variable=(char)(parameter1.charAt(i)-32);
						System.out.print(variable);
					}
				}
			}
	}
	public static String returnlargest(String parameter2)
	{
		String[] word= parameter2.split(" ");
		String input=" ";
		for(int i=0; i<word.length;i++)
		{
			for(int j=i+1;j<word.length;j++)
			{
				 if(word[j].length()>=word[i].length())
				 {
	                    input=word[j];
				 }
				 else if(word[i].length()==word[j].length())
				 {
					 input=word[j];
				 }
				 else if(word[j].length()<=word[i].length())
				 {
					 input=word[i];
				 }
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int flag;
		System.out.println("Hello welcome to String operations program");
		while(true)
		{
			System.out.println("\nChoose the operation you want to perform");
			System.out.println("1. Compare, 2. Reverse 3. Lower Case to Upper Case and vis versa 4. Return largest String ");
			Scanner scan= new Scanner(System.in);
			int choice= scan.nextInt();
			String response;
			try
			{
				switch(choice)
				{
					case(1):
					{
						try
						{
							System.out.println("Enter two strings you want to compare");
							Scanner scan1= new Scanner(System.in);
							String string1= scan1.nextLine();
							String string2= scan1.nextLine();
							int result=compare(string1, string2);
							if(result==1)
								System.out.println("Two Strings are equal");
							else
								System.out.println("Two Strings are unequal");
						} catch(NumberFormatException a)
						{
							System.out.println("Enter valid strings");
						}
						break;
					}
					
					case(2):
					{
						try
						{
							System.out.println("Enter the string you want to reverse");
							Scanner scann1= new Scanner(System.in);
							String input1= scann1.nextLine();
							reverse(input1);
						} catch(NumberFormatException b)
						{
							System.out.println("Enter valid strings");
						}
						break;
					}
					
					case(3):
					{
						System.out.println("Enter the string you want to ammend");
						Scanner scann2= new Scanner(System.in);
						String input2= scann2.nextLine();
						conversion(input2);
						break;
					}
				
					case(4):
					{
						System.out.println("Enter any string ");
						Scanner scann3= new Scanner(System.in);
						String input3= scann3.nextLine();
						response=returnlargest(input3);
						System.out.println("The largest string of all is: "+response);
						break;
					}
					
					default:
					{
						System.out.println("Out of scope String operation");
					}
				}
		}catch(InputMismatchException ab)
			{
			System.out.println("Please do not enter special characters ");
			}
		}
	}
}

