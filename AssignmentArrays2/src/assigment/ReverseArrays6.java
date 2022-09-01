package assigment;

import java.util.Scanner;

public class ReverseArrays6 {
	
	public static void display(int arr[])
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Size of Arrays:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter Element Of Arrays..");
        for(int i=0; i< size;i++)
        {
        	arr[i] = sc.nextInt();
        }
        	
        System.out.println("Before Reverse:");
    	display(arr);
    	
    	for(int i=0;i<arr.length/2;i++)
    	{
    		int temp = arr[i];
    		arr[i] = arr[arr.length-i-1];
    		arr[arr.length-i-1] = temp;
    	}
    	 System.out.println("After Reverse:");
    	    display(arr);
	}

}
