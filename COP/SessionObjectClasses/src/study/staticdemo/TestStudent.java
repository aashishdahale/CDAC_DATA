package study.staticdemo;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*StudentW stud1=new StudentW();
		StudentW stud2=new StudentW(12,"aaa",89.56f,"IET2");
		System.out.println(stud1+" \n"+stud2);
		*/
		Student stud1=new Student();
		Student stud2=new Student(12,"aaa",89.56f);
		System.out.println(stud1.getcollgeName());
		System.out.println(stud2.getcollgeName());
		
		Student.show();
	
		
		
		
		
		
		
		
		
		
	}

}
