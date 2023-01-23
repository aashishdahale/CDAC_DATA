public class Student
{
	private int rollNo;
	private String name;
	private float per;
	
	public Student()
	{
		System.out.println("\nI am in no argument constructor!!!!");
		
		rollNo=23;
		name="neha";
		per=67.54f;
		
	}
	public void setValues()
	{
		rollNo=1;
		name="Ashish";
		per=71.56f;
	
	}
	public void display()
	{
		System.out.println("Roll No :"+rollNo+" Name:"+name+" Per:"+per);
	}
	
	
}
class TestStudent
{
	public static void main(String[] args)
	{
		Student stud1=new Student();
	
		stud1.display();
		
		stud1.setValues();
		
		stud1.display();
		
		Student stud2=new Student();
		
		stud2.display();
		
		
	}
}