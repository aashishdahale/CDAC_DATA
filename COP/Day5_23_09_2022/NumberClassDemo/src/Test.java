
public class Test {

	public static void main(String[] args) {
		Number n1=new Number(5);  //5
		Number n2=new Number(20);  //20
			//n1.getN()+n2.getN();
		
		add(n1,n2);
	}
	
	public static void add(Number n1,Number n2)
	{
		int sum=n1.getN()+n2.getN();
		System.out.println("sum is :"+sum);
		
	}

}
