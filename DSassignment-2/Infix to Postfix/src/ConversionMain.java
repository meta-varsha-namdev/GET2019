import java.util.Scanner;


public class ConversionMain 
{
	public static void main(String args[])
	{
		System.out.println("Enter the expression");
		Scanner scan=new Scanner(System.in);
		String expression=scan.next();
		Conversion convert=new Conversion();
		String result=convert.conversion(expression);
		System.out.println("The postfix expression is" +result);
		
	}
}
