
public class Date {

private int day,month,year;

public Date()
{
	day=23;
	month=9;
	year=2022;
}

public Date(int day,int month,int year)
{
	this.day=day;
	this.month=month;
	this.year=year;
}
public String toString()
{
	String str=" "+day+"-"+month+"-"+year;
	return str;
}






}


