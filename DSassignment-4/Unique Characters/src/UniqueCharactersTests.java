import static org.junit.Assert.*;

import org.junit.Test;


public class UniqueCharactersTests 
{
	
	UniqueCharacters unique = new UniqueCharacters();
	@Test
	public void uniqueCharactersFunction()
	{
		assertEquals(6,unique.uniqueCharacter("metacube"));
		assertEquals(5,unique.uniqueCharacter("sssfjgjtkl"));
		assertEquals(5,unique.uniqueCharacter("mitul"));
		assertEquals(0,unique.uniqueCharacter("vvvvvvv"));
		
	}

}
