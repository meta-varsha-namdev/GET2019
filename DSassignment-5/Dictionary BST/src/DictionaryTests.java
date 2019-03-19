import static org.junit.Assert.*;

import org.junit.Test;


public class DictionaryTests {

	BST bst = new BST("C:\\Users\\admin\\workspace\\Dictionary BST\\src\\input.json");
	
	@Test
	public void testGetSortedList()
	{
		String expected = "[1 : chandler, 2 : monica, 3 : rachel, 4 : joey, 5 : phoebe, city : Manhatten, first name : ross, mobile : 1234566789, name : John]";
		assertEquals(expected, bst.getSortedList().toString());
		
	}
	
	@Test
	public void testGetSortedListBoundKey() 
	{
		String exp1="[2 : monica, 3 : rachel, 4 : joey, 5 : phoebe]";
		String exp2="[1 : chandler, 2 : monica, 3 : rachel, 4 : joey, 5 : phoebe, city : Manhatten, first name : ross, mobile : 1234566789]";
		String exp3 ="[4 : joey, 5 : phoebe, city : Manhatten]";
		String exp4 = "[city : Manhatten, first name : ross, mobile : 1234566789, name : John]";
		String exp5 = "[3 : rachel, 4 : joey, 5 : phoebe, city : Manhatten, first name : ross, mobile : 1234566789]";

		assertEquals(exp1, bst.getSortedList("2", "5").toString());
		assertEquals(exp2, bst.getSortedList("1", "mobile").toString());
		assertEquals(exp3, bst.getSortedList("4", "city").toString());
		assertEquals(exp5, bst.getSortedList("3", "mobile").toString());
	}
	
	@Test
	public void testGetValue()
	{
		assertEquals("chandler", bst.getValue("1"));
		assertEquals("monica", bst.getValue("2"));
		assertEquals("rachel", bst.getValue("3"));
		assertEquals("joey", bst.getValue("4"));
		assertEquals("phoebe", bst.getValue("5"));
		assertEquals("Manhatten", bst.getValue("city"));
		assertEquals("ross", bst.getValue("first name"));
		assertEquals("1234566789", bst.getValue("mobile"));
		assertEquals("John", bst.getValue("name"));
	}
	
	@Test
	public void testDelete() 
	{
		
		assertEquals(true, bst.delete("4"));
		assertEquals(false, bst.delete("8"));
		assertEquals(true, bst.delete("1"));
	}

}
