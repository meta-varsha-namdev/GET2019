/**@author VARSHA NAMDEV
 * @Date: 22/1/2019
 * Classname: MainClass
 */
import java.util.Scanner;
public class MainClass
{
 public static void main(String[] args)
 {
	 Scanner scan= new Scanner(System.in);
	 while(true)
		{
		
		 ArrayInput option= new ArrayInput();
		 int[] array_complete=option.arrayElements();
		 int choice_of_operation= option.choice();
		 switch(choice_of_operation)
		 {
			 case 1:
			 {
				 MirrorSection mirror_elements=new MirrorSection();
				 int mirror_elements_length=mirror_elements.maxMirror(array_complete);
				 System.out.println("The mirror section is:" + mirror_elements_length);
				 break;
			 } 
			 case 2:
			 {
				 ArrayClump clump=new ArrayClump();
				 int number_of_clump=clump.clumpFinding(array_complete);
				 System.out.println("The clump in an array is"+number_of_clump);	
				 break;
			 }
			 case 3:
			 {
				 XY_Function XY_Function=new XY_Function();
				 int[] new_array_is =XY_Function.xy_array(array_complete);
				 System.out.println("The XY fixed array is"+ new_array_is);
				 int length2= new_array_is.length;
				 for(int count=0; count<length2;count++)
				 {
					 System.out.println(new_array_is[count]);
				 }
				 break;
			 }
			 case 4:
			 {
				 ArraySplit splitting_array=new ArraySplit();
				 int answer= splitting_array.splitArray(array_complete);
				 if(answer== -1)
				 {
					 System.out.println("Splitting of array is not possible");
				 }
				 else
				 {
					 System.out.println("The index at which array can be splitted is:"+ answer);
				 }
				 break;
			 }
		 }
	}
 }
}
