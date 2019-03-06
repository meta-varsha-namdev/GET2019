import java.util.Scanner;

public class ListMain 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of node you want to make a list of");
		int number=scan.nextInt();
		System.out.println("Enter the data values");
		
		LinkList head=null;
		for(int counter=0; counter<number; counter++)
		{
			head=LinkList.push(head,scan.nextInt());
		}
	    
	    System.out.println(); 
		System.out.println("Enter the left, right and step values");
		int position_left=scan.nextInt();
		int position_right=scan.nextInt();
		int step=scan.nextInt();
		
		RotateSubList sub_list=new RotateSubList();
		sub_list.rotateSubList(head, position_left, position_right, step);
		
		
		
	}

}
