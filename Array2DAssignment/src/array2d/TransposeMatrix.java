package array2d;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Rows and Column:");
       int rows = sc.nextInt();
       int col = sc.nextInt();
       int arr[][] = new int[rows][col];
       int i,j;
       System.out.println("Enter Matrix: ");
       for(i =0; i<rows; i++)
       {
    	   for(j =0; j<col; j++)
    	   {
    		   arr[i][j] = sc.nextInt();
    	   }
       }
       System.out.println("\nThe  Matrix Before Transpose is...");

       
       for(i =0; i<rows; i++)
       {
    	   for(j =0; j<col; j++)
    	   {
    		   System.out.print(arr[i][j]+" ");
    	   }
    	   System.out.println( );
       }
       System.out.println("\nThe Matrix After Transpose Is...");
       for(i =0; i<col; i++)
       {
    	   for(j=0; j<rows; j++)
    	   {
    		   System.out.print(arr[j][i]+ " ");
    	   }
    	   System.out.println();
       }
	}

}
