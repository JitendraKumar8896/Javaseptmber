package test;

import java.util.Scanner;

public class ForLoopExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int limit = sc.nextInt();
		int i, product=1,product1=1;
		for(i=1; i<=limit;i++)
		{
			if(i%2==0)
			{
				
		        product = product*i ;
		        
			} 
			else
			{
				product1 =product1*i;
			}
			
		}
		System.out.println("Even Product:"+ product);
		System.out.println("Odd Product:"+ product1);
		
		/*
		 int multi = 1;
		 for(int j = 1;j<=limit;j++)
		 {
			 multi = multi*j;
		 }
		 
		 System.out.println("Multiplication:"+multi); 
		  */
      System.out.println("Done");
	}

}
