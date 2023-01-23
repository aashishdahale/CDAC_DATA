
public class Queue {


	private int [] arr;
	private int F;
	private int R;


	public Queue() {
		arr = new int[5];
		F=R=-1;
	}

	public Queue(int size) {
		arr = new int[size];
		F=R=-1;
	}

	void insert(int value)
	{
		//Queue FULL condition
		if(R != arr.length-1)
		{
			R=R+1;
			arr[R] = value;

			//check for 1st value
			if(F==-1)
			{
				F=F+1;
			}
		}
		else
		{
			System.out.println("Queue is Full!");
		}
	}

	int remove()
	{
		int retValue = 0;

		//Queue EMPTY condition
		if(F != -1)
		{
			retValue = arr[F];

			//check for last element
			if(F==R)
				F=R=-1;
			else
				F=F+1;
		}
		else
		{
			System.out.println("Queue is Empty!");
		}
		return retValue; 
	}

	public String toString() {

		String str= "";

		if (F == -1)
		{
			str = "Queue is Empty";
		}
		else {
			for (int i = F; (i <= R); i++) {
				str += arr[i] + ", ";
			}
		}
		return str;
	}

}
