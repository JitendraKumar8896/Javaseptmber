package assigment;

import java.util.Scanner;

public class AverageElement {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Of Size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        double sum=0;
        
        System.out.println("Enter Arrays of Element:");
        for(int i =0; i<size; i++)
        {
        	arr[i] = sc.nextInt();
        }
        System.out.println("Element of Arrays:");
        for(int i=0;i<size;i++)
        {
     	 
     	   sum = sum+arr[i];
     	   
        } 
        double average = sum / size;
	    System.out.println("The average is "+average);
        
	}

}
