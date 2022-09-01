package assigment;
import java.util.Scanner;
public class SymetricsMatrix {

	public static void main(String[] args) {

		int i, j, rows, columns, count = 1;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" Enter Rows and Columns :  ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		
		int[][] arr = new int[rows][columns];
		int[][] trans_arr = new int[rows][columns];
		
		System.out.println(" Please Enter the Sparse Matrix Items :  ");
		for(i = 0; i < rows; i++) 
		{
			for(j = 0; j < columns; j++) 
			{
				arr[i][j] = sc.nextInt();
			}		
		}
		
		for(i = 0; i < arr.length ; i++)
		{
			for(j = 0; j < arr[0].length; j++)
			{
				trans_arr[j][i] = arr[i][j];
			}
		}
		
		System.out.println("\nAfter Transposing Matrix Items are :");
		for(i = 0; i < trans_arr.length ; i++)
		{
			for(j = 0; j < trans_arr[0].length; j++)
			{
				System.out.print(" "+trans_arr[i][j]);
			}
			System.out.print("\n");
		}
		
		for(i = 0; i < arr.length ; i++)
		{
			for(j = 0; j < arr[0].length; j++)
			{
				if(arr[i][j] != trans_arr[i][j])
				{
					count++;
					break;
				}
				
			}
		}
		
		if(count == 1) {
			System.out.println("\nIt is a Symmetric Matrix");
		}
		else {
			System.out.println("\nIt is Not Symmetric matrix ");
		}
	}
		
}
