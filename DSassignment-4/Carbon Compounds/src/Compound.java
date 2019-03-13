import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
public class Compound 
{
	//stack for storing atom
		Stack<Character> stack = new Stack<Character>();


		/**
		 * @param d character
		 * @param time,how many time character will push
		 * */
		private void pushn(Character d, int times)
		{
			while(times>0) 
			{
				stack.push(d);
				times--;
			}
		}

		/**
		 * @param times, 
		 * popping elements and pushing back them in stack 
		 * */
		private void pushBracket(int times) 
		{
			List<Character> listOfCompound= new ArrayList<Character>();
			char d=this.stack.peek();
			while(d!='(')
			{
				d=this.stack.pop();
				if(d!='(') 
				{
					listOfCompound.add(d); 
				}
			}

			for(Character c:listOfCompound) 
			{
				pushn(c,times);
			}
		}


		public int solveCompound(String formula)
		{
			//starting character will compound always
			stack.push(formula.charAt(0));

			for(int index=1;index<formula.length();index++) 
			{

				char d=formula.charAt(index);

				if(Character.isDigit(d))
				{
					int index2=index;

					//fetching numeric part from string
					while(index2<formula.length()) 
					{
						if(Character.isDigit(formula.charAt(index2)))
							index2++;
						else
							break;
					}

					//fetching numeric string
					String s=formula.substring(index,index2);

					//updating index
					index=index2-1;

					//converting numeric string into number
					int n=Integer.parseInt(s);

					char firstElement=stack.pop();

					//push n times character into stack
					pushn(firstElement,n);
				}

				else if(d==')') 
				{
					int tempIndex=index+1;

					//fetching numeric part from string
					while(tempIndex<formula.length()) 
					{
						if(Character.isDigit(formula.charAt(tempIndex)))
							tempIndex++;
						else
							break;
					}

					//fetching numeric string
					String s=formula.substring(index+1,tempIndex);

					//converting numeric string into number
					int n=Integer.parseInt(s);

					//updating index
					index=tempIndex-1;

					//popping element and pushing back them n times
					pushBracket(n);
				}
				else 
				{
					this.stack.push(d);
				}

			}

			return calculate();
		}


		/**
		 * @return result
		 * */
		private int calculate()
		{
			HashMap<Character, Integer> mass = new HashMap<>();
			
			mass.put('C', 12);
			mass.put('O', 16);
			mass.put('H', 1);
			
			int result=0;
			
			while(!this.stack.isEmpty())
			{
				char d=this.stack.pop();
				result+=mass.get(d);
			}
			return result;
		}
}
