package constructor;

import java.util.Scanner;

public class OverloadMethod22 {

	double series(double n) {
        double sum = 0,i;
        for ( i = 1; i <= n; i++) {

            sum = sum+1/i;
        }
        return sum;
    }
	 double series(double a, double n) {
	        double sum = 0;
	        int x = 1;
	        for (int i = 1; i <= n; i++) {
	            int e = x + 1;
	            double term = x / Math.pow(a, e);
	            sum += term;
	            x += 3;
	        }
	        return sum;
	    }
	
	
	public static void main(String[] args) {
		OverloadMethod22 obj = new OverloadMethod22();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Series:");
		double n = sc.nextDouble();
	    System.out.println("First series sum = " +obj.series(n));
	     
	    System.out.println("Enter number and power:");
	    double a = sc.nextDouble();
	    double e = sc.nextDouble();
	    System.out.println("Second series sum = " + obj.series(a, e));
	}

}
