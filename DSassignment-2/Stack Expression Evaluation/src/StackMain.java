import java.util.Scanner;


public class StackMain 
{
	public static void main(String[] args)
	{
		StackOperation stack_data=new StackOperation();
		System.out.println("Enter the expression");
		Scanner scan=new Scanner(System.in);
		String expression=scan.next();
		int result=stack_data.evaluation(expression);
		System.out.println("The result is"+result);
	}
}
