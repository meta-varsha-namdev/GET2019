import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class EmployeeMain
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int number=scan.nextInt();
		List<Employee> list=new ArrayList<>();
		System.out.println("Enter the name and address of employee");
		
		for(int count=0; count<number;count++)
		{
			String name=scan.next();
			String address=scan.next();
			Employee employee=new Employee(name,address);
			list.add(employee);
		}
		
		Collections.sort(list, new Compare());
		System.out.println(list);
	}
}
