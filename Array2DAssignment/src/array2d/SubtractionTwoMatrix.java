package array2d;

import java.util.Scanner;

public class SubtractionTwoMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows and column: ");
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[rows][col];
        int b[][] = new int[rows][col];
        int sub[][] = new int[rows][col];
        int i,j;
        System.out.println("Enter First Matrix:");
        for(i =0 ;i<rows; i++)
        {
        	for(j=0; j<rows; j++)
        	{
        		a[i][j] = sc.nextInt();
        	}
        }
        System.out.println("Enter second Matrix:");
        for(i =0 ;i<rows; i++)
        {
        	for(j=0; j<rows; j++)
        	{
        		b[i][j] = sc.nextInt();
        	}
        }
        System.out.println("First Matrix is...");
        for(i =0; i<rows; i++)
        {
        	for(j =0; j<col; j++)
        	{
        		System.out.print(a[i][j]+" ");
            }
        	System.out.println();
        }
        System.out.println("Second Matrix is...");
        for(i =0; i<rows; i++)
        {
        	for(j =0; j<col; j++)
        	{
        		System.out.print(b[i][j]+" ");
            }
        	System.out.println();
        }
       
        for(i =0; i<rows; i++)
        {
        	for(j =0; j<col; j++)
        	{
        		sub[i][j] = a[i][j]-b[i][j];
            }
        	
        }
        System.out.println("Subtract Matrix is.....");
        for(i =0; i< rows; i++)
        {
        	for(j =0; j<col; j++)
        	{
        		System.out.print(sub[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
