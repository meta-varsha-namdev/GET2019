
public final class IntSet
{
	private final int array[];
	private int length;
	private Object complement_set;
	public IntSet(int array[])
	{
		this.array=array;
	}
	
	public boolean valueCheck(int value)
	{
		for(int index=0;index<array.length; index++)
		{
			if(value==this.array[index])
			{
				return true;
			}	
		}
		return false;	
	}
	
	public int size_array(int array[])
	{
		int length= this.array.length;
		return length;
	}
	
	public int size()
	{
		return this.array.length;
	}
	
	public boolean isSubSet(IntSet subset)
	{
		int exist=0;
		for(int index1=0; index1<subset.size();index1++)
		{
			for(int index2=0; index2<this.size();index2++)
			{
				if(subset.array[index1]==this.array[index2])
				{
					exist=1;
					break;
				}
			}
			if(exist==1)
				exist=0;
			else
				return false;
		}
		return true;
	}
	
	public int[] isComplement()
	{
		int exist=0;
		int first=0;
		int complement_set[]= new int[1000-this.size()];
		for(int index2=0; index2<1000;index2++)
		{
			for(int index1=0; index1<this.size(); index1++ )
			{
				if(index2==this.array[index1])
				{
					exist=1;
					break;
				}
			}
			if(exist==1)
				exist=0;
			else
			{
				complement_set[first++]=index2;
			}
		}
		return complement_set;
	}
	
	public int[] union(IntSet set1, IntSet set2)
	{
     //creating an array size of addition of both set size
	 int tempUnionSet[] = new int[set1.size()+set2.size()],elementInTempUnionSet=0;
		
		//set has to be return
		int unionSet[];
		
		//Initializing s1 set into unionSet
		for(int index=0;index<set1.size();index++)
		{
			tempUnionSet[elementInTempUnionSet++]=set1.array[index];
		}
		
		for(int index=0;index<set2.size();index++)
		{
			//is s2 set value is not member of s1 set then only it will  assign into union set 
			if(!set1.valueCheck(set2.array[index]))
			{
				tempUnionSet[elementInTempUnionSet++]=set2.array[index];
			}
		}
		//initializing unionSet
		
		
		//returning unionSet 
		return tempUnionSet;
	}
	
}
