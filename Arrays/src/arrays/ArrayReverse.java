package arrays;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		int size;  
 		Scanner sc=new Scanner(System.in);  
 		System.out.print("Enter The Size of Arrays : ");  
 		 
 		 size =sc.nextInt();  
 		int sum = 0;
 		int[] arr = new int[10];  
 		System.out.println("Enter the elements of the array: ");  
 		for(int i=0; i<size; i++)  
 		{  
 	  
 		arr[i]=sc.nextInt();  
 		}  
 		System.out.println("Array  Reverse are: ");  
 		
 		for (int i=size-1; i>=0; i--) 
 		{  
 			sum = sum+arr[i];
            System.out.print(arr[i]+" ");
 		}
 		//System.out.println("Addition of arrays:"+sum);
	}

}
