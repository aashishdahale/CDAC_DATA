import java.util.Scanner;
import java.util.stream.Stream;

public class TestLoops {
	public static int factorial(int num) {
		int f=1;
		for(int i=1;i<=num;i++) {
			f*=i;
		}
		return f;
	}
	
	public static void displayall(Integer[] arr) {
		/*for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		//java 1.7
		/*for(int n:arr) { //{12,34,1,2,3,4,5};
			System.out.println(n);
		}*/
		//java 1.8
		Stream.of(arr).forEach((x)->System.out.println(x));
		
	}
	public static int adddigits(int num) {
		int sum=0;
		while(num>0) {
			int d=num%10;
			sum+=d;
			num=num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do {
			
		System.out.println("1.factorial\n2. display all\n3. adition of digits\n4. exit");
		System.out.println("Choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enetr number");
			int num=sc.nextInt();
			System.out.println("factorial : "+factorial(num));
			break;
		case 2:
			Integer[] arr= {12,34,1,2,3,4,5};
			displayall(arr);
			break;
		case 3:
			System.out.println("enetr number");
			num=sc.nextInt();
			int s=adddigits(num);
		case 4:
			System.out.println("Thank you for using our app.......");
			//System.exit(0);
		}
		}while(choice!=4);

	}

}
