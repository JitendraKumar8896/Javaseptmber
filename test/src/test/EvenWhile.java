package test;

import java.util.Scanner;

public class EvenWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit:");
		int limit = sc.nextInt();
		int c =1;
		int sum = 0; 
		int sum1 = 0;
		while(c<=limit)
		{
			
			if(c%2==0) 
			{	
				sum = sum+c;
			}
			else
			{
				sum1 = sum1+c;
			}
			
			    
		c++;	
		}
		System.out.println("sum:"+sum);
		System.out.println("sum1:"+sum1);

	}

}
