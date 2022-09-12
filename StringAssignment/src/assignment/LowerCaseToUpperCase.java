package assignment;

import java.util.Scanner;

public class LowerCaseToUpperCase {
  
	public static void main(String[] args) {
	 	
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter String here:");
		String str = sc.nextLine();
		System.out.println("String Before conversion:"+ str); 
		StringBuffer newstr = new StringBuffer(str);
		for(int i =0; i< str.length(); i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		
		System.out.println("String After Conversion:"+ newstr);
	}

}
