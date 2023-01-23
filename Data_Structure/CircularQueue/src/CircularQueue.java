
public class CircularQueue {

	private int [] arr;
	private int F;
	private int R;

	public CircularQueue() {
		arr = new int[5];
		F=R=-1;
	}

	public CircularQueue(int size) {
		arr = new int[size];
		F=R=-1;
	}

	public CircularQueue(CircularQueue cqueue) {
		
		F=cqueue.F;
		R=cqueue.R;
		
		arr = new int[cqueue.arr.length];
		
		/*for (int i = 0; i < cqueue.arr.length; i++) {
			arr[i] = cqueue.arr[i];
		}*/
		
		System.arraycopy(cqueue.arr, 0, arr, 0, arr.length);
		
	}

	void insert(int value)
	{
		//Queue FULL condition
		if( (F==0 && R==arr.length-1)  ||  
				(R+1 == F))
		{
			System.out.println("Full");
		}
		else
		{
			R = (++R % arr.length);
			arr[R] = value;
			if(F==-1)
				F=F+1;
		}
	}

	int remove()
	{
		int retValue = 0;

		//check for empty
		if(F==-1)
		{
			System.out.println("Empty");
		}
		else
		{
			retValue = arr[F];
			//Check for last element
			if(F==R)
				F=R=-1;
			else
			{
				F = (++F % arr.length);
			}
		}

		return retValue; 
	}

	public String toString() {

		String str= "";

		if(F==-1)
		{
			str = "Queue is empty!";
		}
		else {
			int i = F;
			while(true)
			{
				str = str + arr[i] + ",";

				if(i == R)
					break;

				i = (++i % arr.length);
			}
		}
		return str;
	}

}
