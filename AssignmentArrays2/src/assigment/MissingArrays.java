package assigment;

import java.util.Scanner;

public class MissingArrays {

	public static void main(String[] args) {
//		int arr[] = {1, 2, 3, 4, 6, 7};
//		int n = 6;
//		System.out.println("Arrays Is:");
//		for(int i=0; i< arr.length;i++) {
//		  System.out.print(arr[i]+" ");
//		} 
//		  int sum=(n+1)*(n+2)/2;   
//	      for(int i=0;i<n;i++)
//	      {
//	          sum=sum-arr[i]; 
//	      }
//	      System.out.println("\n Missing Element is: "+sum);
		
		  Scanner sc=new Scanner(System.in);

	      int n;    
	      System.out.print("Enter the Size of Element: ");
	      n=sc.nextInt();     

	      int arr[]=new int[n];  
	      System.out.println("Enter the elements of the array: ");
	      for(int i=0; i<n ;i++)     
	      {
	          arr[i]=sc.nextInt();
	      }
	      
	      int sum=(n+1)*(n+2)/2;   
	      for(int i=0;i<n;i++)
	      {
	          sum=sum-arr[i]; 
	      }
	      System.out.println("Missing Element is :"+sum);  
	   
	}

}
