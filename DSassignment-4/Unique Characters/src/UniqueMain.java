import java.util.Scanner;


public class UniqueMain 
{
	public static void main(String[] args)
	{
		UniqueCharacters unique=new UniqueCharacters();
		System.out.println("Enter the string");
		Scanner scan=new Scanner(System.in);
		String value=scan.next();
		int result=unique.uniqueCharacter(value);
		System.out.println(result);
	}
}
