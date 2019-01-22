
public class ArrayClump 
{
	public int clumpFinding(int length ,int array[])
	{
	
		assert array!=null:"Array is empty";
		
		int reference_variable=-1;
		int increment=0;
		try
		{
			for(int count=0;count<length;count++)
			{
				if(array[count]==array[count+1] && array[count]!=reference_variable)
				{
					increment++;
					reference_variable=array[count];
				}
				else if(array[count]!=reference_variable)
				{
					reference_variable=-1;
				}
			}
			
		} 
		catch(ArrayIndexOutOfBoundsException a)
		{
			return increment;
		}
		finally
		{
			return increment;
		}
		
	}
	
	
	
	
}
