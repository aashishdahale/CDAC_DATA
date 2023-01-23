class CmdlineArgumentDemo{
    public static void main(String[] args){
	   /* System.out.println("Hello "+args[0]);
		System.out.println("Hello "+args[1]);
		System.out.println("Hello "+args[2]);*/
		if(args.length==0){
			System.out.println("pls enetr commandline arguments");
		}
		else{
			for(int i=0;i<args.length;i++){
				System.out.println(args[i]);
			}
		}
	}
}