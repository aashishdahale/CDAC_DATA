class AddNumbers2{
   public static void main(String args[]){
   if(args.length>0){
      int result=0;
	  for(int i=0;i<args.length;i++){
	     result=result+Integer.parseInt(args[i]);
	  }
	  System.out.println("Answer : "+result);
	}
	else{
	  System.out.println("pls enter minimum 2 commandline arguments");
	} 
   }
}