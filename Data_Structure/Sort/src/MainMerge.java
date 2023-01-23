
public class MainMerge {


	public static void main(String[] args) {

		int arr [] = new int[] {-1,-2,0, 4,5,6, 1,2};
		printMe(arr);
		merge(arr, 3, 5, 7);
		printMe(arr);
	}

	public static void printMe(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
	
	private static void merge(int[] crr, int l, int m, int h) {

		int [] arr = new int[m-l      +1];
		int [] brr = new int[h- (m+1) +1];
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


}
