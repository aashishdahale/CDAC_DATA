
public class Student {
	
	private int rollNo;
	private String name;
	private float per;
	private Date DOB;
	
	public Student() //no-args or paramaterless constructor
	{
		rollNo=1;
		name="Ashish";
		per=70.56f;
	}
	//1,"Meera",76.67f,d1
	public Student(int r,String n,float p,Date DOB)
	{
		rollNo=r;
		this.name=n;
		this.per=p;
		this.DOB=DOB;
	}
	
	public void setValues(int rollNo,String name,float per)
	{
		TestStudent1 ts=new TestStudent1();
		this.rollNo=rollNo;
		this.name=name;
		this.per=per;	
	}
	public void setPer(float per)
	{
		this.per=per;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setRollNo(int r)
	{
		this.rollNo=r;
	}
	
	public float getPer()
	{
		return per;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public String toString()
	{
		String str="\nrollNo :"+rollNo+"Name :"
				+ ""+name+"Per"+per+" "+DOB;
		return str;
	}
	
	/*public void comparePer(float p1,float p2)
	{
		if(p1>p2)
			System.out.println("stud1 per is max");
		else
			System.out.println("stud2 is max");
	}*/						
	public void comparePer(Student s1,Student s2)
	{
		if(s1.getPer()>s2.getPer())
		{
			System.out.println("stud1 per is max");
		}
		else
		{
			System.out.println("stud2 per is max");
		}
	}
	
	
	
	
	public void display()
	{
		System.out.println("\nrollNo :"+rollNo+"Name :"+name+"Per"+per);
	}

}
