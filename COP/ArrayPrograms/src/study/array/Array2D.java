package study.array;

public class Array2D {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		//System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
					arr[i][j]=i+10;
			}
		}
		display(arr);
		
		
		
		

	}
	public static void display(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println("");
		}
	}

}
