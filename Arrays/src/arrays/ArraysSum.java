package arrays;

import java.util.Scanner;

public class ArraysSum {

 	public static void main(String[] args) {
 		int size;  
 		int sum1 =0;
 		Scanner sc=new Scanner(System.in);  
 		System.out.print("Enter The Size of Arrays : ");  
 		 
 		 size =sc.nextInt();  
 		
 		int[] arr = new int[10];  
 		System.out.println("Enter the elements of the array: ");  
 		for(int i=0; i<size; i++)  
 		{  
 	  
 		arr[i]=sc.nextInt();  
 		}  
 		System.out.println("Array elements are: ");  
 		
 		for (int i=0; i<size; i++)   
 		{  
 		 if(arr[i]%2==0)
 		 {
 			 System.out.println(arr[i]);
 			 sum1 =sum1+arr[i];
 		 }
 		 
 		}  
 		 System.out.println("Even nummber Addition:"+sum1);
      
	}

}
