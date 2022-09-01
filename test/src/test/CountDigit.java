package test;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Digits");
     int n = sc.nextInt();
     int count =0,b;
       while(n!=0)
       {
    	   b= n%10;
    	   count++;
    	   n = n/10;
       }
       System.out.println("Total Number Of digit:" +count);
	}

}
