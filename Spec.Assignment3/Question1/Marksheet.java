/**
 * 
 */

/**
 * @author MYHP
 *
 */
import java.util.Scanner;
public class Marksheet {
	public static float average(float[] gradearray)
	{
		float averagegrade=0;
		int length1= gradearray.length;
		for(int j=0; j<length1;j++)
		{
			averagegrade=gradearray[j]+averagegrade;
		}
		return averagegrade;
	}
	public static void maximumminimum(float[] gradearray)
	{
		float max=-3.40282347E+38F, min=3.40282347E+38F;
		int length2= gradearray.length;
		for(int k=0;k<length2;k++)
		{
			if(gradearray[k]>max)
				max=gradearray[k];
			if(gradearray[k]<min)
				min=gradearray[k];
		}
		System.out.println("The maximum  grade is\n:"+max);
		System.out.println("The minimum grade is\n"+min);
	}
	public static int totalpass(float array[])
	{
		int number=0,length3= array.length;;
		for(int m=0;m<length3;m++)
		{
			if(array[m]>=40.0)
				number++;
		}
		return number;
	}
	
	public static void main(String[] args) {
		int n, passis;
		float marks, averageis=0,percentage,sumis, maximumis ;
		System.out.println("Enter the number of students");
		Scanner scan1=new Scanner(System.in);
		n=scan1.nextInt();
		float[] gradearray=new float[n];
		if(n<=0)
		{
			System.out.println("Enter Natural number");
		}
		else
		{
			System.out.println("Enter the grades of students");
			try
			{
				for(int i=0;i<n;i++)
				{
					Scanner scan2=new Scanner(System.in);
					marks=scan2.nextFloat();
					gradearray[i]= marks;	
				}
			} catch(NumberFormatException a)
			{
				System.out.println("Enter the valid grades ");
			}
		}
		sumis=average(gradearray);
		System.out.println("The sum of the grades is:"+ sumis);
		averageis=sumis/n;
		System.out.println("The average of the grades is:"+ averageis);
		maximumminimum(gradearray);
		passis=totalpass(gradearray);
		percentage=(passis*100)/n;
		System.out.println("The percentage of students passed is :"+ percentage);
	}

}
