package maximum;

import java.util.Scanner;

public class ThreeNUmberOfMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third nuber:");
        int num3 = sc.nextInt();
        
        if(num1 >= num2 && num1 >=num3)
        {
        	System.out.println(num1 + " first is the maximum number.");
        }
        else if(num2 >= num1 && num2 >=num3)
        {
        	System.out.println(num2 + " second is the maximum number.");
        }
        else
        {
        	System.out.println(num3 + " third is the maximum number");
        }
	}

}
