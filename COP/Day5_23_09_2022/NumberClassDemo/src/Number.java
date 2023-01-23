
public class Number {
	private int n;
	public Number() {
		n=10;
	}
	public Number(int n)
	{
		this.n=n;
	}
	public void setN(int n) {
	this.n=n;
	}
	public int getN()
	{
		return n;
	}
	public String toString()
	{
		String str="number ="+n;
		
		return str;
		
	}
}
