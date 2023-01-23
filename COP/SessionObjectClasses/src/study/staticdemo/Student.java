package study.staticdemo;

public class Student {

	private int rollNo;
	private String name;
	private float per;
	private static String collegeName="IET";
	//non static
	public String getcollgeName()
	{
		return collegeName;
	}
	//static
	public static void show()
	{
		System.out.println(collegeName);
	}
	
	public Student() //no-args or paramaterless constructor
	{
		rollNo=1;
		name="Ashish";
		per=70.56f;
	}
	//1,"Meera",76.67f,d1
	public Student(int r,String n,float p)
	{
		rollNo=r;
		this.name=n;
		this.per=p;
		
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
		collegeName="Institute of Emerging technolgies";
		String str="\nrollNo :"+rollNo+"Name :"
				+ ""+name+"Per"+per+" college name "+collegeName;
		return str;
	}
	
}
