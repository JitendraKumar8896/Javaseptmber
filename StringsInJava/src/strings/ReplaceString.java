package strings;

import java.util.Scanner;

public class ReplaceString {
	
	static void replaceChar(String s, char c1, char c2)
	{
		System.out.println("Old String :"+s);
		char ch[] = s.toCharArray() ;
		for(int i =0; i<ch.length; i++)
		{
			if(ch[i] == c1)
			{
				ch[i] = c2;
			}
		}
		String s1 = new String(ch);
		System.out.println("New String:"+s1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Python is a scripting Programming language";
		System.out.println("Enter a character to  replace:");
		char ch = sc.next().charAt(0);
		
		System.out.println("Enter the replacement:");
		char ch1 = sc.next().charAt(0);
		replaceChar(s, ch,ch1);

	}

}
