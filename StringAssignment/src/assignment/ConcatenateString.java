package assignment;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String:");
		String str = sc.nextLine();
		System.out.println("Before Concatenate.."+ str); 
		
		System.out.print("Enter any String:");
		String str2 = sc.nextLine();
		str.concat(str2);
		System.out.println("After Concatenate."+str);

	}

}
