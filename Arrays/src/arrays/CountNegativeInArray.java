package arrays;

import java.util.Scanner;

public class CountNegativeInArray {

	void countNegativeArray(int a[], int size) {
		int count = 0;
		for (int i = 0; i < size; i++) {

			if (a[i] < 0) {
				count++;
			}

		}
		System.out.println("no of negative numbers:" + count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountNegativeInArray a1 = new CountNegativeInArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter array elememts:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		a1.countNegativeArray(a, size);

	}

}
