
public class TestPerson {

	public static void main(String[] args) {
		Person p=new Person();
		Person p1=new Person(11,"rrr","222222");
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p1.getMobile());
		System.out.println(p.getMobile());

	}

}
