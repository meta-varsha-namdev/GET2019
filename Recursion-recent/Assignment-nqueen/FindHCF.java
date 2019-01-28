
public class FindHCF
{
	public int findHCF(int number1, int number2)
	{
		if(number1==0)
			  return number2;
		else
			  return findHCF(number2 % number1,number1);
	}	
}
