package study.staticdemo;

public class StudentW {

	private int rollNo;
	private String name;
	private float per;
	private String collegeName="IET";
	
	public StudentW() //no-args or paramaterless constructor
	{
		rollNo=1;
		name="Ashish";
		per=70.56f;
		collegeName="IET1";
	}
	//1,"Meera",76.67f,d1
	public StudentW(int r,String n,float p,String c)
	{
		rollNo=r;
		this.name=n;
		this.per=p;
		collegeName=c;
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
				+ ""+name+"Per"+per+" college name "+collegeName;
		return str;
	}
	
}

