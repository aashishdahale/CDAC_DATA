
public class Hash {

	private LinkedList [] names;

	public Hash(int size) {

		names = new LinkedList[size];
		for (int i = 0; i < names.length; i++) {
			names[i] = new LinkedList();
		}
	}


	private int getHashValue(String str) {

		int asciiSum=0;

		for (int i = 0; i < str.length(); i++) {
			asciiSum += str.charAt(i);
		}

		return (asciiSum % names.length);
	}


	public void add(String input) {

		int hashValue = getHashValue(input);
		System.out.println("ADD : Input " + input + ", hash:" + hashValue);

		names[hashValue].append(input);	

	}


	public int search(String inputStr) {

		int hashValue = getHashValue(inputStr);
		System.out.println("SEARCH : Input " + inputStr + ", index=" + hashValue);

		if(names[hashValue].search(inputStr))
			System.out.println("SEARCH : Found" );
		else
			System.out.println("SEARCH : not found..");
		return hashValue;
	}


	public void delete(String inputStr) {

		int index = search(inputStr);
		if(index != -1)
		{
			names[index] = null;
		}
		else
		{
			System.out.println("Not Found");
		}

	}


	public String toString() {
		String str = "";

		for (int i = 0; i < names.length; i++) {
			str += names[i] + "\n";
		}

		return str;
	}

}
