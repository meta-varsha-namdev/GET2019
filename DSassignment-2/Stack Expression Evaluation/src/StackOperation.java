import java.util.EmptyStackException;
import java.util.Stack;

public class StackOperation implements StackNew
{
	Stack<Integer> stack=new Stack<>();
	int operation;
	@Override
	public int evaluation(String expression)
	{
		for(int count=0; count<expression.length();count++)
		{
			char character=expression.charAt(count);
			if(Character.isDigit(character))
			{
				stack.push(character-'0');
			}
			
			else if(character=='+' || character=='-' || character=='*' || character=='/')
			{	
				try 
				{
					int value1=stack.pop();
					int value2=stack.pop();
					switch(character)
					{
					case '+':
						operation=value1+value2;
						stack.push(operation);
						break;
						
					case '-':
						operation=value2-value1;
						stack.push(operation);
						break;
						
					case '/':
						operation=value2/value1;
						stack.push(operation);
						break;
						
					case '*':
						operation=value2*value1;
						stack.push(operation);
						break;
					}
					
				}  catch(EmptyStackException e)
				{
					System.out.println("Please enter postfix expression");
					return 0;
				}
			}
				
		}
		return stack.pop();
		}
	}
