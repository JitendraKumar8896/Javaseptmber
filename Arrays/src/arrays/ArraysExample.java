package arrays;

import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		int size;  
 		int  sum2=0;
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
 		 if(arr[i]%2==1)
 		 {
 			 System.out.println(arr[i]);
 			 sum2 =sum2+arr[i];
 		 }
 		  		
 		}  
 		 
 		 System.out.println("Odd nummber Addition:"+sum2);
        
	}

}
