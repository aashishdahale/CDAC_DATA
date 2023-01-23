
public class Main {

	
	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		
		queue.remove();
		System.out.println(queue);
		queue.insert(10);
		System.out.println(queue);
		queue.insert(20);
		queue.insert(30);
		queue.remove();
		queue.insert(40);
		queue.insert(40);
		queue.insert(40);
		queue.insert(40);
		System.out.println(queue);
	}
}
