
public class Main {

	
	public static void main(String[] args) {
		
		CircularQueue queue = new CircularQueue(5);
		
		queue.insert(10);
		queue.insert(10);
		queue.insert(10);
		queue.insert(10);
		queue.insert(20);
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.insert(30);
		
		CircularQueue cqueue = new CircularQueue(queue);
		
		System.out.println(queue);
		
		//System.out.println(queue);
	}
}
