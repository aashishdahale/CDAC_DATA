
public class BST {
	
	private Node root;
	
	public BST() {
		root = null;
	}
	
	public void insert(int data)
	{
		root = insertNode(root, data);
	}

	private Node insertNode(Node it, int data) {
		
		if(it == null)
		{
			Node tmp = new Node(data);
			return tmp;
		}
		
		if(data < it.data)
			it.left = insertNode(it.left, data);
		else if(data > it.data)
			it.right = insertNode(it.right, data);

		return it;
		
	}

	public void preOrder()
	{
		printPreOrder(root);
	}
	
	private void printPreOrder(Node it) {
		
		if(it != null)
		{
			System.out.print(it);
			printPreOrder(it.left);
			printPreOrder(it.right);
		}
	}
	
	public void inOrder()
	{
		printInOrder(root);
	}
	
	private void printInOrder(Node it) {
		
		if(it != null)
		{
			printInOrder(it.left);
			System.out.print(it);
			printInOrder(it.right);
		}
	}

	public String toString() {
		return "";
	}

	public int getMinValue() {
		
		if(root == null)
			return -1;
		
		Node it = root;
		while(it.left != null)
		{
			it = it.left;
		}
		return it.data;
	}

	public int getMaxValue() {
		if(root == null)
			return -1;
		
		Node it = root;
		while(it.right != null)
		{
			it = it.right;
		}
		return it.data;
	}
	
	
	public void delete(int value)
	{
		root = deleteNode(root, value);
	}

	private Node deleteNode(Node it, int value) 
	{
		if(it == null)
			return it;
		
		if(value < it.data)
			it.left = deleteNode(it.left, value);
		else if(value > it.data)
			it.right = deleteNode(it.right, value);
		else
		{
			if(it.left != null && it.right == null)
			{
				Node tmp = it.left;
				it.left = null;
				return tmp;
			}
			else if(it.left == null && it.right != null)
			{
				Node tmp = it.right;
				it.right = null;
				return tmp;
			}
			else if(it.left == null && it.right == null)
			{
				return null;
			}
			else 
			{
				int smallValue = getMinValue(it.right);
				it.data = smallValue;
				
				it.right = deleteNode(it.right, smallValue);
			}
			
		}
		return it;
	}

	private int getMinValue(Node it) {
				
		while(it.left != null)
		{
			it = it.left;
		}
		return it.data;
	}
}
