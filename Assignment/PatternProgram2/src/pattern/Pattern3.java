package pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print( "Please Enter Row:");
        int ro = sc.nextInt();
        for(int i = 1; i <= ro; i++)	
        {
        	for(int j = 1; j <= i; j++)
        	{
        		System.out.print("* ");
        	}
        	
        	System.out.println();
        }

	}

}
