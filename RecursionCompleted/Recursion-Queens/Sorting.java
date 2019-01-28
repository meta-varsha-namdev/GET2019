
public class Sorting 
{
 public int[] sorting(int array[])
 {
	 int length= array.length;
	 int temporary;
	 for(int first=0;first<length-1;first++)
	 {
		 for(int second=first+1; second<length; second++)
		 {
			 if(array[second]<array[first])
			 {
				 temporary= array[first];
				 array[first]=array[second];
				 array[second]=temporary;
			 }
		 }
	 }
	 return array;
 }
}
