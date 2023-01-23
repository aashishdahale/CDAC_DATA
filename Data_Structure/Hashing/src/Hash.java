
public class Hash {

	private String [] names;

	public Hash(int size) {
		names = new String[size];
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

		if(names[hashValue] == null)
		{
			names[hashValue] = new String(input);
			System.out.println("input String="+ input + "; got hashValue=" + hashValue + " and added at index=" + hashValue);
		}
		else
		{
			int x = (hashValue+1)%names.length;
			int count=0;
			while(true)
			{
				if(names[x] == null)
				{
					names[x] = new String(input);
					System.out.println("input String="+ input + "; got hashValue=" + hashValue + " and added at index=" + x);
					break;
				}
				x = (++x % names.length);
				count++;

				if(count == names.length)
				{
					System.out.println("Full");
					break;
				}
			}
		}
	}


	public int search(String inputStr) {

		int retValue=-1;
		int hashValue = getHashValue(inputStr);
		System.out.println("SEARCH : Input " + inputStr + ", index=" + hashValue);
		if(names[hashValue] != null && names[hashValue].equals(inputStr))
		{
			System.out.println("Input " + inputStr + " found at index=" + hashValue);
			retValue=hashValue;
		}
		else
		{
			int x = hashValue+1;
			int count=0;
			while(true)
			{
				if(	names[x] != null &&
					names[x].equals(inputStr) )
				{
					System.out.println("Input " + inputStr + " found at index=" + x);
					retValue = x;
					break;
				}

				x = (++x % names.length);
				count++;

				if(count == names.length)
				{
					System.out.println("Not Found");
					retValue=-1;
					break;
				}
			}
		}
		return retValue;
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
			str += names[i] + ", ";
		}

		return str;
	}

}
