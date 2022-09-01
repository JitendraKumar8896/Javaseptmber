package test;

import java.util.Scanner;

public class NumberSwitchEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month:");
        int month = sc.nextInt();
        switch(month)
        {
        case 1:System.out.println("31 days in  January");
        break;
        case 2:
        	System.out.println("Enter year:");
        	int year = sc.nextInt();
        	if(year % 4 == 0)
        	{
        		System.out.println("Is A leap year 29 days in  Fabuary");
        	}
        	else {
        		System.out.println("Not a leap year 28 days in Fabuary");
        	}
        	
            
        break;
        case 3:System.out.println(" 31 days in March");
        break;
        
        case 4:System.out.println("30 days in April");
        break;
        case 5:System.out.println(" 31 days in May");
        break;
        case 6:System.out.println("30 days in June");
        break;
        
        case 7:System.out.println(" 31 day in July");
        break;
        case 8:System.out.println(" 31 days in Augest");
        break;
        case 9:System.out.println(" 30 days September");
        break;
        case 10:System.out.println(" 31 days in  October");
        break;
        case 11:System.out.println(" 30 days in November");
        break;
        case 12:System.out.println(" 31 days in December");
        break;
        default:System.out.println("Invalid number");
        }
	System.out.println("Done");
	
	}

}
