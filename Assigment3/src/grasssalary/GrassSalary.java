package grasssalary;

import java.util.Scanner;

public class GrassSalary {

	public static void main(String[] args) {
		float basic_salary;

		  Scanner sc=new Scanner(System.in);

		  System.out.print("Enter Basic Salary Of Employee: ");
		  basic_salary=sc.nextFloat();
          
		 if(basic_salary<=10000)
		 {
			 double da = 0.5*basic_salary;
			  double hra = 0.125*basic_salary;
			 double GrossPayment = (basic_salary) + da + hra;

			  System.out.println("Gross Salary Of Employee: "+GrossPayment);
		 }
		 else if(basic_salary>10000 && basic_salary >= 20000)
		 {
			 double da = 0.8*basic_salary;
			 double hra = 0.5*basic_salary;
			 double GrossPayment = (basic_salary) + da + hra;

			  System.out.println("Gross Salary Of Employee: "+GrossPayment);

		 }
		 else if(basic_salary > 20000 && basic_salary >= 30000)
		 {
			 double da = 0.9*basic_salary;
			 double hra = 0.12*basic_salary;
			 double GrossPayment = (basic_salary) + da + hra;

			  System.out.println("Gross Salary Of Employee: "+GrossPayment);

		 }

		 else
		 {
		   System.out.println("Invailid salary"); 
		 }

	}

}
