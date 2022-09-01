package test;

import java.util.Scanner;

public class AreaOFAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area Of Circle");
		System.out.println("2.Area Of Rectangle");
		System.out.println("3.Area Of Triangle");
		System.out.println("4.Area Of Square");
        System.out.println("Enter Your choice..");
        int ch = sc.nextInt();
        
        switch(ch)
        {
        case 1:
        	System.out.println("Enter the radius:");
        	float r = sc.nextFloat();
        	float area = ((r*r)*3.14f);
        	System.out.println("Area of Circle:" +area);
            break; 
        case 2:
        	System.out.println("Enter the length and width:");
        	float l = sc.nextFloat();
        	float b = sc.nextFloat();
        	System.out.println("Area Of Rectangle:"+(l*b));
        	break; 
        case 3:
        	System.out.println("Enter the length and hight:");
        	float l1 = sc.nextFloat();
        	float h = sc.nextFloat();
        	System.out.println("Area Of Tringle:"+((l1*h)/2));
        	break; 
        case 4:
        	System.out.println("Enter the side:");
        	float s = sc.nextFloat();
        	System.out.println("Area of Square:"+(s*s));
        	break; 
       default:
    	   System.out.println("Enter Wrong choice.....");
        }
	}

}
