
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stud1=new Student();  //no-args
		System.out.println(stud1);
		
		stud1.setPer(84.56f);
		System.out.println(stud1);
		
		
		Student stud2=new Student(16,"aaaaa",76.56f);
		stud2.display();
		
		
		
		
		
		
		
		
		
		
		/*stud1.display();  //constructor values are displayed
		stud1.setPer(87.56f);
		
		stud1.display();//updated percentage + constructor rollno and name
		
		stud1.setValues(14,"aditi", 82.45f);
		
		stud1.display();//setvalues record will be display
		*/
		//*************
		/*
		Student stud2=new Student();
		
		/*stud2.setName("Annesha");
		
		stud2.display(); // 1 Aneesha 70.56*/
		
		/*
		System.out.println("\nstud 2 Percentage is :"+stud2.getPer());
		
		System.out.println(stud1);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Student stud1=new Student();
		
		stud1.display();
		
		stud1.setValues(10,"Meera",78.45f);
		stud1.display();
		
		stud1.setValues();
		
		Student stud2=new Student();
		stud2.setValues(11,"Anisha",75.45f);
		stud2.display();
		Student stud3=new Student();
		stud3.setValues(12,"Arjun",75.45f);
		stud3.display();
		*/
	}

}
