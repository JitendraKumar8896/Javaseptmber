package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print( "Please Enter Row:");
        int ch = sc.next().charAt(0);
        for(char i = 'a'; i <= ch; i++)	
        {
        	for(char j = 'a'; j <= i; j++)
        	{
        		System.out.print(j+" ");
        	}
        	
        	System.out.println();
        }

	}

}
