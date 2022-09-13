package pattern;

import java.util.Scanner;

public class ClassPattern {
	

	public static void main(String[] args) {
		int alphabet = 65;
		int rows = 5;
		
		for (int i = rows; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print((char) (alphabet + j - 1) + " ");
			}
			System.out.println();
		}
		for (int i = 2; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print((char) (alphabet + j - 1) + " ");
			}
			System.out.println();
		}
	   
		
	}
}		
		