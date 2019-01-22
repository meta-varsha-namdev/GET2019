
public class MirrorSection
{
	public int maxMirror(int number, int[]input_array)
	 {
	  int max=0;
	  assert input_array!=null:"Array is empty";
	  for(int start = 0; start < number; start++)
	  {
	   for(int end = number - 1; end >= 0; end--)
	   {
	    int size = 0;
	    int begin = start;
	    int last = end;
	                                
	    while(begin < number && last >= 0 && input_array[begin] == input_array[last]) 
	    {
	     size++;
	     begin++;
	     last--;
	    }
	                                                                            
	     max = Math.max(max, size);
	   }
	  }
	  return max;
	 }
}
