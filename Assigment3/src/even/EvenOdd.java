package even;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		int num = sc.nextInt();
		if(num % 2 == 0)
		{
			System.out.println(num + " Is even number");
		}
		else
		{
			System.out.println(num + " Is odd number");
		}

	}

}
