package pattern;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {

		int alphabet = 65;
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter row:");
		int rows = sc.nextInt();
		
		for (int i = 1; i <= rows; i++) 
         { 
             for (int j = rows; j >= i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print((char) (alphabet + k - 1) + " ");
			}
			System.out.println();
		}


	}

}
