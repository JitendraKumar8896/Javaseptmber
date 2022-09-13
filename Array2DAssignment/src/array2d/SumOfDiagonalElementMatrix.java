package array2d;

import java.util.Scanner;

public class SumOfDiagonalElementMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row and Column Size:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int [row][col];
		int i,j,sum=0;
		System.out.println("Enter Row and Column:");
		for(i =0; i< row; i++)
		{
			for(j =0; j<col; j++)
			{
				arr[i][j] = sc.nextInt();
     		}
		}
		for(i =0; i<row; i++)
		{
			for(j =0; j<col; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(i =0; i< row; i++)
		{
			for(j = 0;j<col;j++)
			{
				
				
				if(i == j)
				{
				    	
					sum = sum+arr[i][j];
					System.out.print("\n "+arr[i][j]);
				}
			}
		
		}
		System.out.println("\nSum of Diagonal Matrix:"+sum);

	}

}
