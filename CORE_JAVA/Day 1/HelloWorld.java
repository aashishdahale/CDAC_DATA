import java.util.Scanner;

class HelloWorld{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		System.out.println("enter string without space");
		String nm=sc.next();
		sc.nextLine();
		System.out.println("enetr STring with spaces");
		String nm1=sc.nextLine();
		System.out.println("Hello World!!");
		System.out.println("Id: "+a+" Name: "+nm+"3 rd String: "+nm1);
	}

}