
public class ArraySplit
{
  public int splitArray(int[]input_array)
  {
	int leftsum = 0;
	int numbers= input_array.length;
    for (int left = 0; left < numbers; left++) 
    { 
      leftsum += input_array[left] ; 
      int rightsum = 0 ; 
      for (int right = left+1 ; right < numbers; right++ ) 
      rightsum += input_array[right] ; 
      if (leftsum == rightsum) 
      return left+1 ; 
     } 
     // if it is not possible to  
    // split array into two parts 
    return -1; 
    } 
}
