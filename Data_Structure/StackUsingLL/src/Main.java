
public class Main {

	public static void main(String[] args) {

		Stack linkedList =  new Stack();
		
		for (int i = 1; i <= 100; i++) {
			linkedList.push(i*10);
			System.out.println(linkedList);
		}
		
		for (int i = 0; i < 100; i++) {
			linkedList.pop();
			System.out.println(linkedList);
		}
		
	}

}
