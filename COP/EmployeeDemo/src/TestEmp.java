import java.util.Scanner;

public class TestEmp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//calling no args constructor
		Employee emp1=new Employee();
		emp1.display();
		System.out.println("Enter salary");
		float sal=sc.nextFloat();
		emp1.setSalary(sal);
		
		//    OR
		//emp1.setSalary(sc.nextFloat());
		System.out.println(emp1);
		System.out.println("\nUpdated salary of emp1 is "+emp1.getSalary());
		
		
		
		//calling parameterized constructor
		
		String s=sc.next();
		
		int e=sc.nextInt();
		//sc.next();
		
		float sal1=sc.nextFloat();
		
		//Employee emp2=new Employee(5016,"Mrunal",5000.0f);
		Employee emp2=new Employee(e,s,sal1);
		emp2.display();
		
		
		
		
		

	}

}
