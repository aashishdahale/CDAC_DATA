
public class Main {

	public static void main(String[] args) {
		
		BST bst = new BST();
		
		bst.insert(10);
		bst.insert(13);
		//bst.insert(-552);
		//bst.insert(-1);
		//bst.insert(12);
		//bst.insert(94);
		//bst.insert(6);
		//bst.insert(77);
		
		bst.preOrder();
		System.out.println();
		bst.inOrder();
		System.out.println();
		//System.out.println(bst.getMinValue());
		//System.out.println(bst.getMaxValue());
		bst.delete(10);
		bst.inOrder();
		System.out.println();
		
		
	}
	
}
