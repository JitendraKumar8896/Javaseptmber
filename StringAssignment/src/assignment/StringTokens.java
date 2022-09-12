package assignment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokens {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
  	
	    System.out.print("Please enter a string with multiple words : ");
	    String str = sc.nextLine();
	    
	    StringTokenizer tokenizer = new StringTokenizer(str, "$");

        while(tokenizer.hasMoreTokens())
        {
           // System.out.print(tokenizer.countTokens());
            System.out.println(tokenizer.nextToken());
        }


	}

}
