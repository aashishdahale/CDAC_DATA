package study.staticdemo;

public class TestAccount {

	public static void main(String[] args) {
		Account account1=new Account();
System.out.println(account1);

Account account2=new Account();
System.out.println(account2);


Account account3=new Account("ssss","Current",40000);

System.out.println(account3);
	}

}
