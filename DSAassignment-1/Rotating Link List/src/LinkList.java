public class LinkList
{
	int data;
	LinkList next;
	
	public static LinkList push(LinkList head, int value)
	{
		LinkList node_made=new LinkList();
		node_made.data=value;
		node_made.next=(head);
		(head)=node_made;
		return head;
	}

}
