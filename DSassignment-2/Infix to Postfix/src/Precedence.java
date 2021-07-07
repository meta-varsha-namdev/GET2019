
public class Precedence 
{
	static int precedence(char character)
	{
		switch (character) 
        { 
		
		case '^':
			return 1;
			
		case '>':
			return 2;
			
		case '<':
			return 3;
			
        case '+': 
        case '-': 
            return 4; 
       
        case '*': 
        case '/': 
            return 5; 
       
        }
        return -1; 
        
	}
}
