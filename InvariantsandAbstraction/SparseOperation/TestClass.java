import static org.junit.Assert.*;

import org.junit.Test;


public class TestClass
{
	
	@Test
	public void test_transpose() 
	{
		int[][] input= new int[][]{{1,2},{3,5}};
		Sparse sparse_is= new Sparse(input);
		assertArrayEquals(new int[][]{{1,3},{2,5}},sparse_is.transpose());
	}
	
	@Test
	public void test_symmetry() 
	{
		int[][] input= new int[][]{{2,6},{6,1}};
		Sparse sparse_is= new Sparse(input);
		assertEquals(true,sparse_is.symmetry()); // assertEquals consider 1 and true differently 
	}
	
	@Test
	public void test_add() 
	{
		int[][] input= new int[][]{{2,6},{6,1}};
		int[][] input2=new int[][]{{1,4},{8,5}};
		Sparse sparse_is= new Sparse(input);
		assertArrayEquals(new int[][]{{3,10},{14,6}},sparse_is.add(input2)); 
	}
	
	@Test
	public void test_multiply() 
	{
		int[][] input= new int[][]{{1,2},{3,1}};
		int[][] input2=new int[][]{{6,4},{2,5}};
		Sparse sparse_is= new Sparse(input);
		assertArrayEquals(new int[][]{{10,14},{20,17}},sparse_is.multiply(input2)); 
	}
	

}
