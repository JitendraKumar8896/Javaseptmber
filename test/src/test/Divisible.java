package test;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int s = sc.nextInt();
        if((s % 3 == 0) && (s % 8==0))
        {
        	System.out.println("It is divisible by 3 and 8 :"+ s);
        }
        else {		
        	System.out.println("It is not divisible " +s);
        }
	}

}
