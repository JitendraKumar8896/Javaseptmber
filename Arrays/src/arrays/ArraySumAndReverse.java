package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumAndReverse {

	void arraySum(int a[], int size) {
		int i;
		System.out.println("sum of array");
		int sum = 0;
		for (i = 0; i < size; i++) {

			sum = sum + a[i];

		}
		System.out.println(a[i]);
	}

	void reverse(int a[], int size) {
		System.out.println("reverse array");
		for (int i = size - 1; i >= 1; i--) {
			System.out.println(a[i]);

		}

	}

	void display1(int a[], int size) {

		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}
		
		/*
		 *32
          12
          25
          51
          322
		 * 
		 */
		
	}

	void display2(int a[], int size) {
		

		for (int aa : a) {
			System.out.println(aa);
			
			/*
			 * 2
               1
               3
               21
               212
		 */
			
			
			
			
		}
	}

	void display3(int a[], int size) {

		System.out.println(Arrays.toString(a));
		
		/*output will be like this
		 * [2, 1, 3, 5, 4]
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArraySumAndReverse obj = new ArraySumAndReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

	/*	obj.arraySum(a, size);
		obj.display1(a, size);
		obj.reverse(a, size);*/
  obj.display1(a, size);
	}

}
