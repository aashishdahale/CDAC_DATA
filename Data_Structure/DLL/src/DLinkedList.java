
public class DLinkedList {
	
	private Node head;
	private Node tail;
	
	public DLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void insert(int data)
	{
		Node tmp = new Node(data);
		if(head == null)
		{
			head=tail=tmp;
		}
		else
		{
			tmp.setNext(head);
			head.setPrev(tmp);
			head=tmp;
		}
	}
	
	public void append(int data)
	{
		Node tmp = new Node(data);
		if(head == null)
		{
			head=tail=tmp;
		}
		else
		{
			tmp.setPrev(tail);
			tail.setNext(tmp);
			tail=tmp;
		}
	}
	
	public void deleteFirst()
	{
		if(head!=null) {
			
			if(head==tail) {
				head=tail=null;
			}
			else {
				Node tmp = head;
				head = tmp.getNext();
				head.setPrev(null);
				tmp.setNext(null);
			}
		}
		else {
			System.out.println("Empty");
		}
	}
	
	public void deleteLast()
	{
		if(tail!=null) {
			
			if(head==tail) {
				head=tail=null;
			}
			else {
				Node tmp = tail;
				tail = tail.getPrev();
				tail.setNext(null);
				tmp.setPrev(null);
			}
		}
	}

	public void reverse()
	{
		Node it = head;
		
		while(it != null)
		{
			Node tmp = it.getNext();
			it.setNext(it.getPrev());
			it.setPrev(tmp);
			
			it= it.getPrev();;
		}
		
		Node tmp = head;
		head=tail;
		tail=tmp;
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
		/*if(pos == 1)
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
		}*/
	}
	
	
	

}
