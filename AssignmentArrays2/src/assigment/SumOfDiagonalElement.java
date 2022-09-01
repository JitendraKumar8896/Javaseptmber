package assigment;

import java.util.Scanner;

public class SumOfDiagonalElement {

	public static void main(String[] args) {
     int i, j, rows, columns, sum = 0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\n Enter Rows and Columns :  ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		
		int[][]arr = new int[rows][columns];
		
		System.out.println("\n  Enter the Items :  ");
		for(i = 0; i < rows; i++) 
		{
			for(j = 0; j < columns; j++) 
			{
				arr[i][j] = sc.nextInt();
			}		
		}
	
		for(i = 0; i < arr.length ; i++)
		{
			System.out.format("\nThe Item at " + i + "," + i +" position = " + arr[i][i]);
			sum = sum + arr[i][i];
		}
	System.out.println("\nThe Sum of the Matrix Diagonal Items = " + sum);


	}

}
