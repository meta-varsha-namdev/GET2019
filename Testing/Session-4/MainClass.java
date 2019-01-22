/**@author VARSHA NAMDEV
 * @Date: 22/1/2019
 * Classname: MainClass
 */
public class MainClass
{
 public static void main(String[] args)
 {
	 while(true)
		{
		 ArrayInput option=new ArrayInput();
		 int length=option.number_of_elements();
		 int[] array_complete =option.arrayElements(length);
		
		 int choice_of_operation= option.choice();
		 switch(choice_of_operation)
		 {
			 case 1:
			 {
				 MirrorSection mirror_elements=new MirrorSection();
				 int mirror_elements_length= mirror_elements.maxMirror(length, array_complete);
				 System.out.println("The mirror section is:" + mirror_elements_length);
				 break;
			 } 
			 case 2:
			 {
				 ArrayClump clump=new ArrayClump();
				 int number_of_clump=clump.clumpFinding(length,array_complete);
				 System.out.println("The clump in an array is"+number_of_clump);	
				 break;
			 }
			 case 3:
			 {
				 XY_Function xy_function=new XY_Function();
				 int[] new_array_is =xy_function.xy_array(length, array_complete);
				 System.out.println("The XY fixed array is"+ new_array_is);
				 for(int count=0; count<length;count++)
				 {
					 System.out.println(new_array_is[count]);
				 }
				 break;
			 }
			 case 4:
			 {
				 ArraySplit splitting_array=new ArraySplit();
				 int answer= splitting_array.splitArray(length, array_complete);
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
