package pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		int alpfa = 65;
		
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter row:");
		int rows = sc.nextInt();
		for(int i=rows;i >= 1;i--)
		{
			for(int j =1;j <= i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k = i;k <= rows; k++)
			{
				System.out.print((char)(alpfa+k-1)+" ");
			}
			System.out.println();
		}
       ///second rule 
		System.out.println("============================");
		for(char l = 'J'; l>='F';l--)
		{
			for(char m = 'F';m <= l;m++)
			{
				System.out.print(" ");
			}
			
			for(char n = l; n <='J';n++)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
		

	}

}
