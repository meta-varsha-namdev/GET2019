import java.util.Scanner;
public class XY_Function 
{
	Scanner scan=new Scanner(System.in);
	
	public int[] xy_array(int length, int array[])
	{
		System.out.println("Enter the value of X and Y");
		int value_x=scan.nextInt();
		int value_y=scan.nextInt();
		int flag=0;
		assert array!=null:"Array is empty";
		for(int count1=0;count1<length;count1++) 
		{
			if(array[count1]==value_x)
			{
				for(int count2=flag;count2<length;count2++) 
				{
					if(array[count2]==value_y && count2!=count1+1) 
					{
						int temporary_variable=array[count1+1];
						array[count1+1]=value_y;
						array[count2]= temporary_variable;
						flag=count2;
					}
					else
					{
						continue;
					}
				}
			}
			else 
			{
				continue;
			}
		}
		System.out.println("The new fixed array is:");
		return array;
		
	}
}
