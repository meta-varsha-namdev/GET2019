import java.util.InputMismatchException;
import java.util.Scanner;
public class SparseMain 
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the row of a matrix");
		int row= scan.nextInt();
		int matrix_is[][]= new int[row][row];
		int count1=0, count2=0;
		System.out.println("Enter the elements of a matrix");
		for(int index1=0; index1<row; index1++)
		{
			for(int index2=0; index2<row; index2++)
			{
				try
				{
					int value=scan.nextInt();
					if(value==0)
					{
						System.out.println("Enter only non zero elements");
						break;
					}
					else
					{
						matrix_is[index1][index2]=value;
					}
				} catch(InputMismatchException a)
				{
					System.out.println("Please enter only numeric value");
					System.exit(0);
				}
			}
		}
		
		
		Sparse sparse= new Sparse(matrix_is);
		System.out.println("Enter the choice of operation on matrix\n1. Transpose\n2. Symmetry Check\n3. Addition\n4. Multiplication");
		int choice=scan.nextInt();
		switch(choice)
		{
			case 1:
			{
				 int matrix_transpose[][]=new int[row][row];
				 matrix_transpose= sparse.transpose();
				 System.out.println("The elements of a transpose matrix is:");
				 for(int index1=0; index1<row; index1++)
					{
						for(int index2=0; index2<row; index2++)
						{
							System.out.print("\t"+matrix_is[index2][index1]);
						}
						System.out.print("\n");
					}
				 System.out.println("The time complexity of transpose is:"+ row*row);
				 break;
			 }
			 
			 case 2:
			 {
				 boolean result;
				 result=sparse.symmetry();
				 if(result)
					 System.out.println("Matrix is Symmetrical");
				 else
					 System.out.println("Matrix is not Symmetrical");
				 System.out.println("The time complexity of symmetric matrix is:"+ row*row*row);
				 break;
			 }
			 
			 case 3:
			 {
				 int[][] matrix_2_is= new int[row][row];
				 int[][] add_result= new int[row][row];
				 System.out.println("Enter the elements of second matrix");
				 try
				 {
					for(int index1=0; index1<row; index1++)
					{
						for(int index2=0; index2<row; index2++)
						{
							matrix_2_is[index1][index2]= scan.nextInt();
						}
					}
				 } catch(InputMismatchException b)
				 {
					 System.out.println("Please enter only numeric value");
					 System.exit(0);
				 }
				 add_result= sparse.add(matrix_2_is);
				 System.out.println("The new added matrix is:");
				 for(int index1=0; index1<row; index1++)
				 {
					 for(int index2=0; index2<row; index2++)
					 {
						 System.out.println(add_result[index1][index2]);
					 }
					 System.out.print("\n");
				 }
			 }
			 
			 case 4:
			 {
				 int[][] matrix_3_is= new int[row][row];
				 int[][] multiply_result= new int[row][row];
				 System.out.println("Enter the elements of second matrix");
				 try
				 {
					for(int index1=0; index1<row; index1++)
					{
						for(int index2=0; index2<row; index2++)
						{
							matrix_3_is[index1][index2]= scan.nextInt();
						}
					}
				 } catch(InputMismatchException c)
				 {
					 System.out.println("Please enter only numeric value");
					 System.exit(0);
				 }
				 multiply_result= sparse.multiply(matrix_3_is);
				 System.out.println("The new multiplied matrix is:");
				 for(int index1=0; index1<row; index1++)
				 {
					 for(int index2=0; index2<row; index2++)
					 {
						 System.out.print("\t"+multiply_result[index1][index2]);
					 }
					 System.out.print("\n");
				 }
			 }
		}
	}

}
