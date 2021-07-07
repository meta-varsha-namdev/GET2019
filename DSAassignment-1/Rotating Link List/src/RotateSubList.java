
public class RotateSubList 
{
	public void rotateSubList(LinkList node, int position_left, int position_right, int step)
	{
		int left=position_left-1;
		int right=position_right-1;
		int size=right-left+1;
		
		if(step>size)
		{
			step=step%size;
		}
		
		if(step==0 || step==size)
		{
			LinkList head=node;
			while(head!=null)
			{
				System.out.println(head.data);
				head=head.next;
			}
			return;
		}
		
		LinkList link=null;
		if(left==0)
			link=node;
		
		LinkList new_node=node;
		int count=0;
		LinkList start=null;
		LinkList end=null;
		
		while(new_node!=null)
		{
			
			if(count==left-1)
			{
				start=new_node;
				link=new_node.next;
				
			}
			
			if(count==right-step)
			{
				if(left==0)
				{
					end=new_node;
					node=new_node.next;
				}
				
				else 
				{  
	                end = new_node;  
	    
	                // That is how we bring (n-k+1)th  
	                // node to front of sublist.  
	                start.next = new_node.next;  
	            }  
					
			}
			
			if(count==right)
			{
				LinkList proceed = new_node.next;  
				new_node.next = link;  
	            end.next = proceed;  
	            LinkList head = node;  
	            while (head != null)
	            {  
	                System.out.print( head.data+" ");  
	                head = head.next;  
	            }  
	            return;  
			}
			new_node=new_node.next;
			count++;
		}
		
	}
	
	//Method to detect loop in linked list
	
	public int detectLoop()
	{
		 LinkList slow_p = head, fast_p = head; 
	        while (slow_p != null && fast_p != null && fast_p.next != null) { 
	            slow_p = slow_p.next; 
	            fast_p = fast_p.next.next; 
	            if (slow_p == fast_p) { 
	                System.out.println("Found loop"); 
	                return 1; 
	            } 
	        } 
	        return 0; 
	}
}
