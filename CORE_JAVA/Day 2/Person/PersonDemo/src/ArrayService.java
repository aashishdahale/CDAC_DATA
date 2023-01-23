import java.util.Scanner;
class ArrayService{
	//add 2 arrays of size 3X3
public static int[][] addArray( int[][] x, int[][] y){
  int[][] result=new int[3][3];
  for(int i=0;i<x.length;i++){
     for(int j=0;j<x[0].length;j++){
	      result[i][j]=x[i][j]+y[i][j];
	 }
  }
  return result;
  }
  
  //accept array data
  public static void acceptarray(int[][] a){
      Scanner sc =new Scanner(System.in);
      for(int i=0;i<a.length;i++){
	     for(int j=0;j<a[0].length;j++){
		    System.out.println("enter data at "+i+ "row" +j +"column");
			a[i][j]=sc.nextInt();
		 }
	  
	  
	  }
  }
  //display arra data
  public static void display(int[][] x){
    for(int i=0;i<x.length;i++){
	     for(int j=0;j<x[0].length;j++){
		     System.out.print(x[i][j] + "\t");
		 }
		 System.out.println("\n");
  }
  }
}