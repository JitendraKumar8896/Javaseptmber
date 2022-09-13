package divisible;

import java.util.Scanner;

public class DivisibleNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A number:");
		int number = sc.nextInt();
		if((number % 2 == 0) && (number % 4 == 0))
		{
			System.out.println("Number Is divisble by 5 and 11 :"  +number);
		}
		else
		{
			System.out.println("Number  Is not divisible by  5 and 11 :"  +number);
		}

	}

}
