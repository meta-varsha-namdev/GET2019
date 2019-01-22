import java.lang.reflect.Array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestJunit
{	
   MirrorSection mirror_section_is=new MirrorSection();
   ArrayClump array_clump_is= new ArrayClump();
   XY_Function xy_function= new XY_Function();
   ArraySplit array = new ArraySplit();
   
   @Test
   public void mirrorSectionTests()
   {
	   assertEquals(3,mirror_section_is.maxMirror(new int[] {1,2,3,8,9,3,2,1}));
   }

   @Test
   public void splitArrayTests()
   {	  
      assertEquals(3,array.splitArray(new int[]{1, 1, 1, 2, 1}));
   }
   
   @Test
   public void fixXYTests()
   {
	   int[] return_array=xy_function.xy_array(new int[]{5,4,9,4,9,5});
	   int[] expected_array=new int[]{9,4,5,4,5,9};
	   Assert.assertArrayEquals(expected_array, return_array);
   }
   
   @Test
   public void arrayClumpTests()
   {
	   assertEquals(1,array_clump_is.clumpFinding(new int[]{1,1,1,1,1}));
   }
  
}
