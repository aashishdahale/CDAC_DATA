
public class LinkedList {
	
	private Node head;
	private int nodeCount;
	
	private class Node {

		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
		
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
		
		public String toString() {
			String str = "";
			str = "" + data ;
			return str;
		}
		
		public void setNext(Node next)
		{
			this.next = next;
		}
		
		public Node getNext()
		{
			return this.next;
		}
	}
	
	public LinkedList() {
		head = null;
		nodeCount=0;
	}
	
	public void insert(int data)
	{
		Node tmp = new Node(data);
		nodeCount++;		
		if(head == null)
		{
			head = tmp;
		}
		else
		{
			tmp.setNext(head);
			head = tmp;
		}
	}
	
	public void append(int data)
	{
		Node tmp = new Node(data);
		nodeCount++;
		if(head == null)
		{
			head = tmp;
		}
		else
		{
			Node x = head;
			while(x.getNext() != null)
			{
				x = x.getNext();
			}
			x.setNext(tmp);
		}
	}
	
	public void deleteFirst()
	{
		if(head != null)
		{
			if(head.getNext() == null)
			{
				//Only 1 node..
				Node x=head;
				head=null;
				x.setNext(null);
			}
			else
			{
				head=head.getNext();
				Node x=head;
				x.setNext(null);
			}
			nodeCount--;
		}
		else
			System.out.println("LL is empty");
	}
	
	public void deleteLast()
	{
		if(head != null)
		{
			if(head.getNext() == null)
			{
				//Only 1 node..
				Node x=head;
				head=null;
				x.setNext(null);
			}
			else
			{
				Node itp = null;
				Node it = head;
				
				while(it.getNext() != null)
				{
					itp = it;
					it = it.getNext();
				}
				itp.setNext(null);
			}
			nodeCount--;
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
				x = x.getNext();
			}
		}
		return str;
	}
	
	public void insertByPos(int data, int pos)
	{
		if(pos == 1)
			insert(data);
		else if(pos == nodeCount+1)
			append(data);
		else if(pos<=0 || pos >nodeCount+1)
			System.out.println("Invalid Pos!");
		else
		{
			nodeCount++;
			Node tmp = new Node(data);
		
			int x=1;
			Node it = head;
			while(x < pos-1)
			{
				it = it.getNext();
				x++;
			}
			
			tmp.setNext(it.getNext());
			it.setNext(tmp);
		}
	}
	
	public void reverse()
	{
		Node it=head;
		Node itp=null;
		Node itn=it;
		
		while(it != null)
		{
			itn = it.getNext();
			it.setNext(itp);
			itp=it;
			it=itn;
		}
		head = itp;
	}
	
	
	public void reversePrint()
	{
		_reversePrint(head);
		System.out.println();
	}

	private void _reversePrint(Node it) {
		
		if(it.getNext() != null)
		{
			_reversePrint(it.getNext());
		}
		System.out.print(it + "-->");
	}
	
	
	
	
	
	
	
	
	
	
}
