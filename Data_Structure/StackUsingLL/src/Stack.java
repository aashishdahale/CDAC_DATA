
public class Stack {
	
	private Node head;
	
	public Stack() {
		head = null;
	}
	
	public void push(int data)
	{
		Node tmp = new Node(data);
		
		if(head == null)
		{
			head = tmp;
		}
		else
		{
			tmp.next = head;
			head = tmp;
		}
	}
	
	
	
	public void pop()
	{
		if(head != null)
		{
			if(head.next == null)
			{
				//Only 1 node..
				Node x=head;
				head=null;
				x.next = null;
			}
			else
			{
				Node x=head;
				head=head.next;
				x.next = null;
			}
		}
		else
			System.out.println("LL is empty");
	}
	
	
	
	public String toString() {
		String str = "";
		
		if(head == null)
		{
			str = "LL is empty";
		}
		else
		{
			Node x = head;
			while(x != null)
			{
				str += "" + x + "-->";
				x = x.next;
			}
		}
		return str;
	}

}
