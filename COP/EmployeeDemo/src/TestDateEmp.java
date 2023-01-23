
public class TestDateEmp {

	public static void main(String[] args) {
	Employee1 emp1=new Employee1();
	System.out.println(emp1);
	
	Date dob=new Date(24,9,2022);
	Employee1 emp2=new Employee1(34,"aaa",50000.0f,dob);
	System.out.println(emp2);
	

	}

}
