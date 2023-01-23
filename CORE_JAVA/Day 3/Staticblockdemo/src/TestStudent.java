
public class TestStudent {
static {
	
	System.out.println("in staic block of testStudent");
}

	public static void main(String[] args) {
		Student s1=new Student("Raj",99,98,99);
                System.out.println(s1);

		Student s2=new Student("Rajas",99,98,99);
		System.out.println(s2);

		System.out.println("count"+Student.count);
		System.out.println("count : "+s1.count);
		System.out.println(s1 instanceof Student);
		System.out.println(s1 instanceof Object);
		
		/////bitwise operators
		int i=7,j=5;
		System.out.println(i&j); ///5
		System.out.println(i|j); ///7
		System.out.println(i>>2); //1
		System.out.println(i<<2); //28
				
		
	}

}
