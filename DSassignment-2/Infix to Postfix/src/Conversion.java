import java.util.Stack;

public class Conversion 
{
	
	static String conversion(String expression)
	{
		
		String result=new String(" ");
		Stack<Character> stack=new Stack<>();
		
		for(int count=0;count<expression.length();count++)
		{
			 char character = expression.charAt(count); 
			 if(character == ' ')
				 continue;
             
             // If the scanned character is an operand, add it to output. 
			 else if (Character.isLetterOrDigit(character)) 
                result += character; 
               
            // If the scanned character is an '(', push it to the stack. 
            else if (character == '(') 
                stack.push(character); 
              
            //  If the scanned character is an ')', pop and output from the stack  
            // until an '(' is encountered. 
            else if (character == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    result += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression"; // invalid expression                 
                else
                    stack.pop(); 
            } 
            else // an operator is encountered 
            { 
            	Precedence test=new Precedence();
                while (!stack.isEmpty() && test.precedence(character) <= test.precedence(stack.peek())) 
                    result += stack.pop(); 
                stack.push(character); 
            } 
       
        } 
       
        // pop all the operators from the stack 
        while (!stack.isEmpty()) 
            result += stack.pop(); 
       
        return result; 
	}
}
