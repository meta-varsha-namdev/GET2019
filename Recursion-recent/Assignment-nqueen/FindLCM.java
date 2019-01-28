
public class FindLCM 
{
	 public int findLCM(int number1, int number2,int parameter)
		{
			 try
			 {
				 if (number1 % number2 == 0)
					 return number1;
				 else
				     return findLCM(number1 + parameter, number2, parameter); 
			 } catch(ArithmeticException b)
			 {
				 return -1;
			 }
		}
}
