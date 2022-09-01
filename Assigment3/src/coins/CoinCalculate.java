package coins;

import java.util.Scanner;

public class CoinCalculate {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Age:");
	   int age = sc.nextInt();
	   if(age>0)
	   {
		   int coins = age *age *age;
		   System.out.println("Meenu gets "+coins +" coins");
	   }
	   else
	   {
		   System.out.println("Invalid Age");
	   }

	}

}
