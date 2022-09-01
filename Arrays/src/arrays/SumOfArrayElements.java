package arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("enter array elements");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println("sum of array elements");
		System.out.println(sum);

	}

}
