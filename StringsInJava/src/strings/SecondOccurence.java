package strings;

public class SecondOccurence {
	
	public static char get2ndOccurance(String str)
	{
		int ch[] = new int[256];
		int i;
		for(i =0; i <str.length(); i++)
		{
			(ch[str.charAt(i)])++;
		}
		int c_first =0 , c_second = 0;
		for(i=0; i< 256; i++)
		{
			if(ch[i] > ch[c_first])
			{
			  c_second = c_first;
			  c_first = i;
			}
			else if(ch[i] > ch[c_second] && ch[i] != ch[c_first])
				c_second = i;
		}
		return (char)c_second;
	}

	public static void main(String[] args) {
		String str = "Success";
		System.out.println("Given String Is:"+str);
		
		char res = get2ndOccurance(str);
		if(res != '\0')
			System.out.println("second occurrence of a character:"+res);
		else
			System.out.println("No second occurrence of a character");
	}

}
