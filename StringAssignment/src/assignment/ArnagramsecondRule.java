package assignment;

import java.util.Scanner;

public class ArnagramsecondRule {
	public static boolean checkAnagram(String s1, String s2)
	{
		
		char[] arr1 = s1.replaceAll("\\s", "").toCharArray();
		char[] arr2 = s2.replaceAll("\\s", "").toCharArray();

		if (arr1.length != arr2.length)
			return false;
		
		int[] value = new int[26];
		for (int i = 0; i < arr1.length; i++)
		{
			
			value[arr1[i] - 97]++;
			
			value[arr2[i] - 97]--;
		}
		
		for (int i = 0; i < 26; i++)
			if (value[i] != 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Getting the input string from the user
		System.out.print("Enter the First String : ");
		String s1 = sc.nextLine();

		System.out.print("Enter the second String : ");
		String s2 = sc.nextLine();

		if (checkAnagram(s1, s2))
			System.out.println(s1 + " and " + s2 + " are Anagrams");
		else
			System.out.println(s1 + " and " + s2 + " are NOT Anagrams");

		sc.close();

	}

}
