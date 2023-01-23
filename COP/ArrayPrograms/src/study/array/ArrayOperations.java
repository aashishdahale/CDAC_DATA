package study.array;

public class ArrayOperations {

	public static void search(int arr[],int ele)
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("\nelement is found in the array at position :"+(i+1));
				break;
			}
		}
		if(i==arr.length)
			System.out.println("ele not found in the array");
	}
	
	public static void sortarray(int arr[])
	{
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
	}
	
	public static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	
	
	
	
}
