
public class Search 
{
	 public int searchLinear(int element, int array[], int first)
	 {
		 try
		 {
			 int length=array.length;
			 if(first>length)
				 return -1;
			 if(array[first]==element)
				 return first;
			 else
				 return searchLinear(element,array,first+1);
		 } catch(ArrayIndexOutOfBoundsException a)
		 {
			 return -2;
		 }
	 }
	 
	 public int searchBinary(int element, int array[], int start, int end)
	 {
		 int length=array.length;
		 try
		 {
			 if(start>=end)
			 {
				 if(array[start]==element)
					 return start;
				 else
					 return -1;
			 }
			 else
			 {
				 int mid=(start+end)/2;
				 if(array[mid]==element)
				 {
					 return mid;
				 }
				 if(element<array[mid])
				 {
					 return searchBinary(element,array,start,mid-1);
				 }
				 else
				 {
					 return searchBinary(element, array, mid+1,end);
				 }
			 }
		 } catch(ArrayIndexOutOfBoundsException b)
		 {
			 return -2;
		 }
	 }
}
