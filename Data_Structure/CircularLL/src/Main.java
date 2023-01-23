
public class Main {

	public static void main(String[] args) {

		CircularLinkedList linkedList =  new CircularLinkedList();

		for (int i = 1; i <= 1; i++) {
			linkedList.append(i*1);
			System.out.println(linkedList);
		}
		
		linkedList.deleteByPos(7);
		//System.out.println(linkedList);
		
		linkedList.reverse();
		System.out.println(linkedList);
		
	}

}
