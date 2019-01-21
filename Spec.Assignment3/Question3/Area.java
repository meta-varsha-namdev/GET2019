/**@author VARSHA NAMDEV
 * @Date:20/1/2019
 * Classname: Area
 * @Description:
 * height, width: Height and width of cornered figures
 * radius: radius of circle
 * area: Area of figure
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Area 
{
	public static double triangle(double height, double width)
	{
		double area= (height*width)/2;
		return area;
	}
	
	public static double rectangle(double height, double width)
	{
		double area= (height*width);
		return area;
	}
	
	public static double square(double side)
	{
		double area= side*side;
		return area;
	}
	
	public static double circle(double radius)
	{
		double area= (22*radius*radius)/7;
		return area;
	}
	
	public static void main(String[] args) {
		while(true)
		{
			System.out.println(" \nHello to the world of figures !!\n Enter the no. of which figure you want to calculate area");
			System.out.println("\n 1. Right Triangle 2. Rectangle 3. Square 4. Circle");
			Scanner scan1=new Scanner(System.in);
			int option=scan1.nextInt();
			switch(option)
			{
			case 1:
				try
				{
					System.out.println("Enter the height and width of right angle triangle");
					Scanner scan2=new Scanner(System.in);
					double height1=scan2.nextDouble();
					Scanner scan3=new Scanner(System.in);
					double width1=scan3.nextDouble();
					double areais1= triangle(height1, width1);
					System.out.println("The area is"+areais1);
				} catch(InputMismatchException a)
				{
					System.out.println("Enter the dimensions in numerals !!");
				}
				break;
			case 2:
				try
				{
					System.out.println("Enter the height and width of Rectangle");
					Scanner scan4=new Scanner(System.in);
					double height2=scan4.nextDouble();
					Scanner scan5=new Scanner(System.in);
					double width2=scan5.nextDouble();
					double areais2= rectangle(height2, width2);
					System.out.println("The area is"+areais2);
				} catch(InputMismatchException a)
				{
					System.out.println("Enter the dimensions in numerals !!");
				}
				break;
			case 3:
				try
				{
					System.out.println("Enter the side length of square");
					Scanner scan6=new Scanner(System.in);
					double side1=scan6.nextDouble();
					double areais3= square(side1);
					System.out.println("The area is"+areais3);
					break;
				} catch(InputMismatchException  a)
				{
					System.out.println("Enter the dimensions in numerals !!");
				}
				break;
			case 4:
				try
				{
					System.out.println("Enter the radius of circle");
					Scanner scan7=new Scanner(System.in);
					double radius1=scan7.nextDouble();
					double areais4= circle(radius1);
					System.out.println("The area is"+areais4);
					break;
				} catch(InputMismatchException  a)
				{
					System.out.println("Enter the dimensions in numerals !!");
				}	
				break;
				
			default:
				System.out.println("Choose from the given figures");
			}
		}
	}
}