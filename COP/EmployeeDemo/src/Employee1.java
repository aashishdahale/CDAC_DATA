
public class Employee1 {
	private int empId;
	private String name;
	private float salary;
	private Date DOB;
	
public Employee1()
{
		
		this.empId = 45;
		this.name = "hhhhh";
		this.salary = 6578.f;
		this.DOB=new Date();
}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Employee1(int empId, String name, float salary, Date dOB) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", name=" + name + ", salary=" + salary + ", DOB=" + DOB + "]";
	}
	
	
}
