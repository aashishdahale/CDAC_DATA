
public class MyHash {

	String [] str;
	
	public MyHash(int size) 
	{
		str = new String[size];
	}
	
	private int hashFunction(String input) 
	{
		int key = 0;
		int sum = 0;
		
		for (int i = 0; i < input.length(); i++) 
		{
			sum = sum + input.charAt(i);
		}
		
		key = sum%str.length;
		return key;
	}
	
	public void insert(String input)
	{
		int key = hashFunction(input);
		System.out.println("key=" + key);
		
		if(str[key] == null)
		{
			str[key] = input;
		}
		else
		{
			while(true)
			{
				key++;
				if( key == str.length )
					key=0;
				
				if(str[key] == null)
				{
					str[key] = input;
					break;
				}
			}
		}
		System.out.println("Inserted at key=" + key);
	}

	public void search(String input)
	{
		int key = hashFunction(input);
		
		while(true)
		{
			if(str[key].equals(input))
			{
				System.out.println("Got at " + key);
				break;
			}
			
			key++;
			if( key == str.length )
				key=0;
		}
	}
	
}
