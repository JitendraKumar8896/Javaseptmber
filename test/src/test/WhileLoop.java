package test;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit = sc.nextInt();
		int c = 1;
		while(c<=limit) {
			if(c>0)
			
				System.out.print(c+" ");
				c++;
		}	
			System.out.println("Done");
		
		

	}

}
