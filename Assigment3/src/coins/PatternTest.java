package coins;

import java.util.Scanner;

public class PatternTest {

	public static void main(String[] args) {
		int rows;
		int i,j;
		int ch = 97;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows:");
		rows = sc.nextInt();
		for(i =1; i<=rows;i++)
		{
			
			for(j =1; j <= i;j++)
			{
				System.out.print((char)(ch)+" ");
			}
			ch++;
			System.out.println();
		}
		for(i = rows; i>= 1; i--)
		{
			for(j = 1; j <= i-1; j++)
			{
				System.out.print((char)(ch)+ " ");
				
			}
			ch++;
			System.out.println();
		}

	}

}
