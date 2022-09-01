package division;

import java.util.Scanner;

public class DivisibleNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = sc.nextInt();
		if(n % 5 == 0)
		{
			System.out.println(n + " Is divisible by 5");	
		}
		else
		{
			
			System.out.println(n + "Is Not divisible by 5");
		}

	}

}
