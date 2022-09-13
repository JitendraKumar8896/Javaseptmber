package arrayassignment;

import java.util.Scanner;

public class SumOfLowerTriangular {

	public static void main(String[] args) {
		int i,j,rows,columns,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Matrix Rows and Columns: ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		int[][]arr = new int[rows][columns];
        System.out.println("Please Enter the Matrix : ");
        for(i =0; i<rows;i++)
        {
        	for(j=0;j<columns;j++)
        	{
        		arr[i][j] = sc.nextInt();
        	}
        }
        
        for(i =0;i<rows;i++)
        {
        	for(j =0;j<columns;j++)
        	{
        		
        		if(i>j)
        		{
        			sum = sum+arr[i][j];
        		}
        	}
        }
        System.out.println("\n The Sum of the Lower Triangle Matrix="+sum);
	}

}
