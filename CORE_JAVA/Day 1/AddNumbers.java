class AddNumbers{
   public static void main(String args[]){
       if(args.length==2){
	      int c=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
		  System.out.println("Answer: "+c);
		  
	   }
	   else{
	      System.out.println("pls enter 2 commandline arguments");
	   }
   }
}