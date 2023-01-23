class Book
{
	private int bid;
	private String aname;
	private float price;
	
	public Book()
	{
		bid=313;
		aname="chetan bhagat";
		price=560.67f;
	
	}
	public void assignValues()
	{
			bid=356;
		aname="APJ abdul kalam";
		price=670.67f;
	}
	public void display()
	{
		System.out.println("\nBook id :"+bid+"Name :"+aname+"Price:"+price);
	}
}

class TestBook
{
	public static void main(String [] args)
	{
		Book b1=new Book();
		b1.display();
		b1.assignValues();
		b1.display();
	}


}