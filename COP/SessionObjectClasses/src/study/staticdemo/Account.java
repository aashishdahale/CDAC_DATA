package study.staticdemo;

public class Account {

	private int accountNo;
	String aname;
	String accType;
	float balAmount;
	private static int ac=100;
	
	public Account()
	{
		
		accountNo=ac++;
		aname="aaaaa";
		accType="Savings";
		balAmount=5000;
	}
	public Account(String s,String t,float bal)
	{
		accountNo=ac++;
		aname=s;
		accType=t;
		balAmount=bal;
	}
	public String toString()
	{
		return accountNo+" "+aname+" ";
		
	}
	
	
	
}
