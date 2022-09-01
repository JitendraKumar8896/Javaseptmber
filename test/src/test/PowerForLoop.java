package test;

import java.util.Scanner;

public class PowerForLoop {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter num:");
	   int num = sc.nextInt();
	   System.out.println("Enter Power:");
	   int pow = sc.nextInt();;
	   int product = 1;
	   for(int c = 1; c<=pow;c++)
	   {
		   product = product*num;
	   }
		   
	System.out.println("Product:"+ product);
      
	}

}
