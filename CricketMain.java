import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CricketMain {

	public static void main(String[] args) throws Exception 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no. of balls Virat is allowed to play");
		int balls=scan.nextInt();
		System.out.println("Enter the number of ballers against Virat");
		int number_ballers=scan.nextInt();
		
		HashMap<Integer, Integer> map1=new HashMap<>();
		System.out.println("Enter the number of ballers and their balls");
		
		for(int count=1;count<=number_ballers;count++)
		{
			map1.put(count,scan.nextInt());
		}
		
		CricketSort cricket=new CricketSort();
		int[] array = cricket.cricketFunction(balls, number_ballers, map1);
		for(int index=0;index<balls;index++)
		{
			System.out.print(array[index]+" ");
		}
	}

}
