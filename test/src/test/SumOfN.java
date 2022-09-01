package test;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit:");
		int limit = sc.nextInt();
		int c =1;
		int sum=0;
		while(c<=limit)
		{
		sum = sum+c;
		c++;
		}
    System.out.println("Addition Is" +sum);
	}

}
