package pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print( "Please Enter Row:");
        int ro = sc.nextInt();

        for(int i=1;i<=ro;i++)
	    {
	    	for(int j =ro-1; j >= i;j--)
	    	{
	    		System.out.print(" ");
	    	} 
	    	for (int k =1; k <=i;k++)
	    	{
	    		System.out.print(i+" ");
	    	}
	    	System.out.println();
	    }
	}

}
