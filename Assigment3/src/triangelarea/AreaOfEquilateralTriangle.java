package triangelarea;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
     
		 Scanner ob = new Scanner(System.in);
         System.out.print("Enter the side of the Triangle:");
         double side= ob.nextDouble();
         double  area=(Math.sqrt(3)/4)*(side*side);
         System.out.println("Area of Triangle is: " + area); 
	}

}
