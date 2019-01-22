
public class ArrayClump 
{
	public int clumpFinding(int array[])
	{
		int size1=array.length;
		int reference_variable=-1;
		int increment=0;
		try
		{
			for(int count=0;count<size1;count++)
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
