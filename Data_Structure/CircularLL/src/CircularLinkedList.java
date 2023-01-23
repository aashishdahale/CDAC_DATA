
public class CircularLinkedList {

	private Node head;
	private int nodeCount;

	public CircularLinkedList() {
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
			tmp.setNext(head);
		}
		else
		{
			Node it = head;
			while(it.getNext() != head)
			{
				it = it.getNext();
			}

			it.setNext(tmp);
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
			tmp.setNext(head);
		}
		else
		{
			Node it = head;
			while(it.getNext() != head)
			{
				it = it.getNext();
			}

			it.setNext(tmp);
			tmp.setNext(head);
		}
	}

	public void deleteFirst()
	{
		if(head != null)
		{
			if(head.getNext() == head)
			{
				Node tmp = head;
				head = null;
				tmp.setNext(null);
			}
			else
			{
				Node it = head;
				Node tmp = head;

				while(it.getNext() != head)
				{
					it = it.getNext();
				}

				head = head.getNext();
				it.setNext(head);
				tmp.setNext(null);
			}
			nodeCount--;
		}
		else
			System.out.println("CLL is empty");
	}

	public void deleteByPos(int pos)
	{
		if(pos == 1)
			deleteFirst();
		else if(pos == nodeCount)
		{
			//deleteLast();
		}
		else if(pos<=0 || pos >nodeCount)
			System.out.println("Invalid Pos!");
		else
		{
			int x=1;
			Node it = head;
			while(x < pos-1)
			{
				it = it.getNext();
				x++;
			}

			Node tmp = it.getNext();
			it.setNext(tmp.getNext());
			tmp.setNext(null);
		}
	}

	public void reverse()
	{
		
		if(head !=null)
		{
			Node it = head;
			Node itp = null;
			Node itn= head;
			
			do {
				itn = it.getNext();
				it.setNext(itp);
				itp=it;
				it =itn;
			}while(it != head);
			
			it.setNext(itp);
			head=itp;
		}
	}

	public String toString() {
		String str = "";

		if(head != null)
		{
			Node it = head;
			do {
				str += "" + it + "-->";
				it = it.getNext();

			}while(it != head);

		}
		else
			str = "CLL is empty";
		
		return str;
	}

}



















