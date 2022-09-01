package power;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);  
	 System.out.print("Enter x is:");
     int x = sc.nextInt();
     System.out.print("Enter y is:");
     int y = sc.nextInt();
     int result =1;
     result = (int)Math.pow(x, y);
     System.out.println("Result Is ::"+ x +"^"+ y +"=" +result );
     
	}

}
