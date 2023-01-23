
public class Person 
{
	private int perid;
	private String pname;
	private String mobile;
	
	//default constructor
	public Person() 
	{
		this(0,null,null);
		/*this.perid=0;
		this.pname=null;
		this.mobile=null;*/
		
	}
	
	
	//parametrized constructor
	public Person(int id, String nm,String mob ) 
	{
		
		this.perid=id;
		this.pname=nm;
		this.mobile=mob;
	}
	public Person(int id) 
	{
		this.perid=id;
		this.pname=null;
		this.mobile=null;
	}
	
	/*public void setPerId(int id)
	 {
		this.perid=id;
		
	}*/
	public void setPname(String nm) 
	{
		this.pname=nm;
	}
	
	public void setMobile(String m)
	 {
		this.mobile=m;
	}
	
	public int getPerId() 
	{
		return perid;
	}
	public String getPname() 
	{
		return pname;
	}

	public String getMobile() 
	{
		return mobile;
	}
	public String toString() 
	{
		return "Id: "+this.perid +"Name: "+this.pname+"Mobile:"+this.mobile;
	}

}
