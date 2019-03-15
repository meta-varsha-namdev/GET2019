import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;


public class CricketSort 
{
	public int[] cricketFunction(int balls, int number_baller, HashMap<Integer, Integer>map1) throws Exception
	{
		
		int sum=0;
		int value_is[] = new int[balls];
		for(int count=1; count<=number_baller; count++)
		{
			sum+=map1.get(count);
		}
		if(balls!=sum)
		{
			throw new Exception("Total number of balls of balls should be equal to Virat's");
		}
		
		else
		{
			int temporary=0;
			int start=1;
			
			while(start<=balls)
			{
				int maxValueInMap = 0;
				
				maxValueInMap = (Collections.max(map1.values()));  
				for (Entry<Integer, Integer> entry : map1.entrySet()) 
				{ 
		            if (entry.getValue()==maxValueInMap)
		            {
		                value_is[temporary]= entry.getKey();
		                temporary++;
						map1.put(entry.getKey(), --maxValueInMap);
		                break;
		            }    
				}
				
				start++;
			}
			
		}
		return value_is;
	}
}
