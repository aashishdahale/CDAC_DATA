
public class Main {

	public static void main(String[] args) {
		
		Hash hash = new Hash(5);
		
		hash.add("Shrinivas");
		hash.add("IET");
		hash.add("CDAC");
		hash.add("System.out.println");
		hash.add("System.out");
		hash.add("Shrinivas");
		
		//hash.search("Shrinivas1");
		
		//hash.delete("iet");
		hash.delete("CDAC");
		
		System.out.println(hash);
		
	}

}
