import java.util.Scanner;

public class CompoundMain
{
	public static void main(String args[])
	{
		 Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the formula: ");
		  String formula = scan.next();
		  Compound mole = new Compound();
		  System.out.println("molecular weight is: "+mole.solveCompound(formula));
	}
	
}
