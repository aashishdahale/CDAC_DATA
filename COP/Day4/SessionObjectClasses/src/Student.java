
public class Student {
	
	private int rollNo;
	private String name;
	private float per;
	
	Student()
	{
		rollNo=1;
		name="Ashish";
		per=70.56f;
	}
	
	public void setValues(int r,String nm,float p)
	{
		rollNo=r; 
		name=nm;
		per=p;	
	}
	public void setPer(float p)
	{
		per=p;
	}
	public void setName(String s)
	{
		name=s;
	}
	public void setRollNo(int r)
	{
		rollNo=r;
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
				+ ""+name+"Per"+per;
		return str;
	}
	
	
	
	
	
	
	public void display()
	{
		System.out.println("\nrollNo :"+rollNo+"Name :"+name+"Per"+per);
	}

}
