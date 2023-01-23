
public class Sort {

	public static void selection(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j])
					//if(arr[i] < arr[j])
				{
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}			
		}
	}

	public static void insertion(int [] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for (int j = i+1; j>0; j--) 
			{
				if(arr[j] < arr[j-1])
				{
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
				else
					break;
			}
		}
	}

	public static void bubble(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length-1; j++) 
			{
				if(arr[j+1] < arr[j])
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

	public static void quick(int [] arr)
	{
		quickSort(arr, 0, arr.length-1);
	}

	private static void quickSort(int[] arr, int low, int high) {

		if(low < high)
		{
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}

	private static int partition(int []arr, int low, int high)
	{
		int i=low-1;
		int p= high;

		for (int j = low; j < high; j++) {

			if(arr[j] < arr[p])
			{
				i++;
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
		}
		i++;
		int tmp = arr[p];
		arr[p] = arr[i];
		arr[i] = tmp;
		return i;
	}

	public static void mergeSort(int[] crr, int l, int h)
	{
		if(l<h)
		{
			int m = (l+h)/2;
			System.out.println("l=" + l + ", m="+ m + ", h=" + h );
			mergeSort(crr, l, m);
			mergeSort(crr, m+1, h);
			merge(crr, l, m, h);
			printMe(crr);
		}
	}

	private static void merge(int[] crr, int l, int m, int h) {

		int n1 = m-l      +1;
		int n2 = h- (m+1) +1;
		
		int [] arr = new int[n1];
		int [] brr = new int[n2];

		int x=l;
		for(int i=0; i<arr.length; i++)
			arr[i] = crr[x++];

		for(int i=0; i<brr.length; i++)
			brr[i] = crr[x++];

		//------------------------------

		int i=0,j=0,k=l;

		while(i<arr.length && j<brr.length)
		{
			if(arr[i] < brr[j])
			{
				crr[k] = arr[i];
				k++;
				i++;
			}
			else
			{
				crr[k] = brr[j];
				k++;
				j++;
			}
		}

		while(i<arr.length)
		{
			crr[k] = arr[i];
			k++;
			i++;
		}

		while(j<brr.length)
		{
			crr[k] = brr[j];
			k++;
			j++;
		}
	}

	public static void printMe(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

		System.out.println();
	}






}
