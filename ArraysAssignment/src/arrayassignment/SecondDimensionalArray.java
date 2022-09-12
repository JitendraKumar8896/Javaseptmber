package arrayassignment;

import java.util.Scanner;

public class SecondDimensionalArray {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
		System.out.println(" Enter Rows and Columns :  ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int  sum =0;
		int[][] arr = new int[r][c];
		System.out.println("Enter The Element of 2D Arrays:");
		for(int i =0; i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		
		}
		
		for(int i =0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println( );
		}
       
       for(int i =0; i<r;i++)
       {
    	   for(int j=0; j<c; j++)
    	   {
    		   sum = sum+arr[i][j];
    	   }
    	   
       }
		System.out.println("\n Sum of Matrix: "+sum);
		for(int i =0; i<r;i++)
	       {
	    	   for(int j=0; j<c; j++)
	    	   {
//	    		   if(i == j)
//	    		   {   
//	    			  //Major Diagonal  Matrix
//	    			   System.out.println(" "+arr[i][j]);
//	    		   }
	    		   // upper tringular matrix
//	    		   if(i>j)
//	    			   
//	    		   {
//	    			   System.out.print(" "+arr[i][j]); 
//	    			   System.out.println(" ");
//	    		   }
//	    		    
	    	       if(j>i)   
	    		   {
	    			   // lower tringular matrix
	    			   System.out.println(" "+arr[i][j]); 
	    		   }
	    		   
	    		  
	    	   }
	    	   
	       }
		
		
		
	}

}
