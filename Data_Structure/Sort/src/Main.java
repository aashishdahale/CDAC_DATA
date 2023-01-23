import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//int [] arr = new int[100000];
		//populate(arr);
		
		int [] arr = new int[] {100, 10,-6,3,4,5,6,-1, 45, 67, 3};
		
		Sort.printMe(arr);
		Sort.mergeSort(arr, 0, arr.length-1);
		
		Sort.printMe(arr);
		
		
	}

	private static void populate(int[] arr) {
		
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt();
		}
			
	}
	
}

