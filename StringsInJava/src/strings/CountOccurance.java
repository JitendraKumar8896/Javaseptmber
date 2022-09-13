package strings;

import java.util.Scanner;

public class CountOccurance {
	
	static final int MAX_CHAR = 256; 
	static void getOccuringChar(String str) 
	{
		int count[] = new int[MAX_CHAR];  
		for(int i =0; i< str.length(); i++)
		{
			count[str.charAt(i)]++;  
		}
		char ch[] = new char[str.length()]; 
		for(int i =0; i< str.length(); i++)
		{
			ch[i] = str.charAt(i);  
			int find = 0;  
			for(int j=0; j<=i; j++)
			{
				if(str.charAt(i) == ch[j])
					find++;
			}
			if(find == 1)
				System.out.println( str.charAt(i)+"  --> " + count[str.charAt(i)]);
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String str = sc.nextLine();
		getOccuringChar(str);
		

	}

}
