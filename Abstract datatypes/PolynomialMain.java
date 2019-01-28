import java.util.Scanner;
public class PolynomialMain {
	

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the degree of polynomials");
		int degree=scan.nextInt();
		int coefficient_is[]= new int[degree+1];
		System.out.println("Enter the coefficients of polynomials");
		for(int index=0; index<degree+1; index++)
		{
			coefficient_is[index]= scan.nextInt();
		}
		Polynomial polynomial= new Polynomial(coefficient_is);
		System.out.println("Enter the choice of operation of polynomials:\n 1. Evaluation\n 2. Degree\n 3. Addition\n 4. Multiplication");
		int choice= scan.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the value you want to evaluate");
			float value_is= scan.nextInt();
			float evaluated_value=polynomial.evaluate(value_is);
			System.out.println("The evaluated value is\n"+evaluated_value);
			break;
		}
	
		case 2:
		{
			System.out.println("The degree of polynomial is:"+polynomial.degree());
			break;
		}	
		case 3:
		{
			System.out.println("Enter the degree of new polynomial");
			int degree2=scan.nextInt();
			int coefficient_new[]= new int[degree2+1];
			System.out.println("Enter the new polynomial");
			for(int index=0; index<degree2+1;index++)
			{
				coefficient_new[index]=scan.nextInt();
			}
			Polynomial polynomial1= new Polynomial(coefficient_new);
			System.out.println("The sum of the polynomial is:");
			polynomial.add(polynomial1).printPolynomial();
			break;
		}
			
		case 4:
		{

			System.out.println("Enter the degree of new polynomial");
			int degree3=scan.nextInt();
			int coefficient_new1[]= new int[degree3+1];
			System.out.println("Enter the new polynomial");
			for(int index=0; index<degree3+1;index++)
			{
				coefficient_new1[index]=scan.nextInt();
			}
			Polynomial polynomial2= new Polynomial(coefficient_new1);
			System.out.println("The multiplication of the polynomial is:");
			polynomial.multiply(polynomial2).printPolynomial();
			break;
		}
			
		}

	}

}
