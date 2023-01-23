
public class GenericFunctions<T,U> {
	public  void add(T i,T j){
		System.out.println(i+","+j);
	}
	
	public  void test(T i,U j){
		System.out.println(i+","+j);
	}
	
	public int addition(int x,int y,int...arr) {
		int s= x+y;
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
		GenericFunctions<Integer,String> ob=new GenericFunctions<>();
		ob.add(12, 34);
		GenericFunctions<String,String>ob1=new GenericFunctions<>();
		ob1.add("xyz","Hello");
		ob.addition(12, 34);
		ob.addition(1, 2, 3,4,5,6,7);
		int i=34;
		i=i%4;
		i%=4;
	}

}
