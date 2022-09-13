package strings;

import java.util.Scanner;

public class CharFrequency {
    
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Sentence..");
	String str = sc.nextLine();
	System.out.println("Enter a character to find in sentence :");
	char character = sc.next().charAt(0);
	
    char ch1[] = str.toCharArray();
    int cnt = 0;
    System.out.println(character + " Is present at index number :");
    	
    for(int i=0; i< ch1.length; i++)
    {
    	if(ch1[i] == character)
    	{
    		cnt++;
    		System.out.print(i+ " ");
    	}
    }
    System.out.println("And it occured :"+ cnt +" times");
	}

}
