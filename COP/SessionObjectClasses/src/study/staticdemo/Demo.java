package study.staticdemo;

public class Demo {
	
	int n;
	static int c=0;
	Demo()
	{
		n=10;
		c++;
	}
	Demo(int n)
	{
		this.n=n;
		c++;
	}
	public static void showCount()
	{
		System.out.println("\nNumber of objects are :"+c);
	}
	
	
	
	
	
	
	

}
