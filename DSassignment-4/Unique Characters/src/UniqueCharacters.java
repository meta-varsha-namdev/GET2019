import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class UniqueCharacters 
{
	HashMap<String,Integer> cache = new HashMap<>();
	
	public int uniqueCharacter(String value)
	{
		int result=0;
		
		if(cache.containsKey(value))
		{
			result=cache.get(value);
			return result;
		}
		
		HashMap<Character, Integer> unique_character = new HashMap<>();
		
		for( int count=0; count<value.length();count++)
		{
			char character=value.charAt(count);
			if(unique_character.containsKey(character))
			{
				int temporary=unique_character.get(character);
				unique_character.put(character, temporary+1);
			}
			
			else
				unique_character.put(character, 1);
			
		}
		
		Set<Character> key_set=unique_character.keySet();
		
		Iterator<Character> iterator = key_set.iterator();
		
		while(iterator.hasNext())
		{
			if(unique_character.get(iterator.next()) == 1 )
			result++;
		}
		
		cache.put(value, result);
		return result;
	}
	
	
}
