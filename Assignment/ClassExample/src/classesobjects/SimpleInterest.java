package classesobjects;

import java.util.Scanner;

public class SimpleInterest {
	 float multiIterest(float p, float r, float t)
	 {
		 float result = p*r*t;
		 return result;
	 }
	 void calculate(float result)
	 {
		 float si = (result)/100;
		 System.out.println("Simple Interest:" +si);
		 
	 }

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float p, r,t;
		System.out.print("Enter principle :");
		p = sc.nextFloat();
		System.out.println("Enter rate:");
		r = sc.nextFloat();
		System.out.println("Enter time:");
		t = sc.nextFloat();
		
		SimpleInterest si = new SimpleInterest();
	    float result=	si.multiIterest(p, r, t);
		si.calculate(result);
		
	}

}
