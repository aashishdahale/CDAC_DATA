package study.demo;

public class Student {

	int rollno;
	int age;
	float per;
	public Student()
	{
		rollno=1;
		age=23;
		per=76.54f;
		System.out.println("In no args of student");
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", per=" + per + "]";
	}
	public Student(int rollno, int age, float per) {
		
		this.rollno = rollno;
		this.age = age;
		this.per = per;
	}
	
}
