
public class Node {
	
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left=right=null;
	}
	
	public String toString() {
		String str="";
		str = "" + data + ", ";
		return str;
	}
}
