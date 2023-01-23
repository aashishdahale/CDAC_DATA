
public class Main {

	public static void main(String[] args) {

		DLinkedList linkedList =  new DLinkedList();
		
		for (int i = 1; i <= 10; i++) {
			linkedList.append(i*1);
			System.out.println(linkedList);
		}
		
		/*linkedList.insertByPos(444, 15);
		System.out.println(linkedList);*/
		
		/**/
		
		linkedList.deleteFirst();
		System.out.println(linkedList);

		linkedList.deleteLast();
		System.out.println(linkedList);
		
		linkedList.reverse();
		System.out.println(linkedList);
		
		
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println();
		System.out.println();
		System.out.println();
		
		/*for (int i = 0; i < 100; i++) {
			linkedList.deleteFirst();
			System.out.println(linkedList);
		}*/
		
	}

}
