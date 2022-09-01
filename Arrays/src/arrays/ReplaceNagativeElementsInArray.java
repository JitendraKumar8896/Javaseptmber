package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceNagativeElementsInArray {

	void replaceNegatives(int a[], int size) {
		System.out.println("replace of negatice numbers:");
		
		for (int i = 0; i < size; i++) {

			if (a[i] < 0) {
				a[i] = a[i - 1] * a[i - 1];

			}
			System.out.println(Arrays.toString(a));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReplaceNagativeElementsInArray a1 = new ReplaceNagativeElementsInArray();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter array elememts:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		a1.replaceNegatives(a, size);

	}

}
