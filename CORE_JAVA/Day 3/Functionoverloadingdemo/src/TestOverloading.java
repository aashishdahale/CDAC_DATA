
public class TestOverloading {
	public int add(int i,int j) {
		System.out.println("int function called");
		return i+j;
	}
	
	public int add(int x,int y,int z) {
		return x+y+z;
	}
	
	public float add(float i,float j) {
		System.out.println("float function called");
		return i+j;
	}
	/*public int add(Integer i,Integer j) {
		System.out.println("Integer function called");
		return i+j;
	}*/
	
	public static void main(String[] args) {
		TestOverloading ob=new TestOverloading();
		ob.add(10,20);  ///int
		ob.add(23.6f, 34.67f); //float
		ob.add(23l, 45l);
		ob.add(new Integer(10),new Integer(20));
	}

}
