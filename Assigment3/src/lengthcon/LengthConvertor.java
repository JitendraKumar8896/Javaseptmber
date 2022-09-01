package lengthcon;

import java.util.Scanner;

public class LengthConvertor {

	public static void main(String[] args) {
		double cm, meter, kilometer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in centimeter:");
        cm = sc.nextDouble();
        meter = cm/100.0;
        kilometer = cm/1000.0;

        System.out.println("Length in Meter = "+ meter+" m ");
        System.out.println("Length in Kilometer ="+kilometer+" km");
	}

}
