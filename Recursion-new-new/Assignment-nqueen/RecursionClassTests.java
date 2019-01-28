import static org.junit.Assert.*;

import org.junit.Test;


public class RecursionClassTests
{
	FindLCM lcm_output= new FindLCM();
	FindHCF hcf_output= new FindHCF();
	Search search=new Search();
	
	@Test
	public void FindLCMTests()
	{
		assertEquals(2860,lcm_output.findLCM(44,65,44) );
	}
	
	@Test
	public void FindHCFTests()
	{
		assertEquals(22,hcf_output.findHCF(44,66));
	}
	
	@Test
	public void SearchTests()
	{
		assertEquals(4,search.searchLinear(3,new int[]{1,6,4,7,3,8},0));
		assertEquals(1,search.searchBinary(5,new int[] {1,5,3,6,8,5,5}, 0, 6));
	}
	
	

}
