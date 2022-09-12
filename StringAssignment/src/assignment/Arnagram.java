package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Arnagram {
	static void isAnagram(String s1, String s2 )
	{
		String spc1 = s1.replaceAll("\\s", "");
		String spc2 = s2.replaceAll("\\s", "");
		boolean status = true;
		
		if(spc1.length() != spc2.length())
        {
           
 
            status = false;
        }
        else
        {
            
 
            char[] s1Array = spc1.toLowerCase().toCharArray();
 
            char[] s2Array = spc2.toLowerCase().toCharArray();
 
           //Sorting both s1Array and s2Array
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            //Checking whether s1Array and s2Array are equal
 
            status = Arrays.equals(s1Array, s2Array);
        }
		
		 if(status)
	        {
	            System.out.println(s1+" and "+s2+" are anagrams");
	        }
	        else
	        {
	            System.out.println(s1+" and "+s2+" are not anagrams");
	        }
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String :");
		String s2 = sc.nextLine();
		isAnagram(s1,s2);
		
		
	}

}
