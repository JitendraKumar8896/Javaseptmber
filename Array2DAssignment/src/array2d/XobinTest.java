package array2d;

import java.util.Scanner;

public class XobinTest {
	static boolean isPrime(int n) {
		int c =0;
		boolean flag = false;
		for(int j =1; j < 5; j++)
		{
			for(int i =2; i < n/2; i++)
			{
				if(n % i == 0)
				{
					c++;
				}
				
			}
			if(c > 0)
				return false;
			else
				return true;
		}
		return flag = true;
	}

	public static void main(String[] args) {
		int []a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arrays Element:");
		for(int i =0; i< a.length;i++)
		{
			a[i]= sc.nextInt();
		}
        for(int  i =0; i<a.length; i++)
        {
        	if(isPrime(a[i]))
        	{
        		System.out.println(a[i]);
        	}
        }
	}

}
