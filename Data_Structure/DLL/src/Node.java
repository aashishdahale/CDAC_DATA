
public class Node {

	private Node prev;
	private int data;
	private Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	public Node(int data, Node next, Node prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
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
	
	public void setPrev(Node prev)
	{
		this.prev = prev;
	}
	
	public Node getPrev()
	{
		return this.prev;
	}
}
