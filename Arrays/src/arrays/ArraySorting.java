package arrays;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		int temp;
		System.out.println("enter array elements:");
		int i;
		for(i=0;i<=size;i++) {
			a[i]=sc.nextInt();
		}
		for( i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
				
				
				
			}
		}System.out.println(a[i]);
	}

}
