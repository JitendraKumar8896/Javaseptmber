package strings;

import java.util.Scanner;

public class WithoutUsingMethod {
	
	public static void main(String[] args) {
		
		  String st; int i;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter any string which is to be converted to lowercase");
		  st=sc.nextLine(); 
		  char str[]=st.toCharArray(); 
		  for(i=0;i<str.length;i++) 
		  {
		  if(str[i]>='A' && str[i]<='Z')
		  {
			  str[i]=(char)((int)str[i]+32); 
			  }
		  }
		  System.out.println("The string in lowercase is");
		  for(i=0;i<str.length;i++)
		       System.out.print(str[i]);
		 	
		
			/*
			 * int i; char c[]; Scanner sc=new Scanner(System.in);
			 * 
			 * System.out.println("Enter the string"); String s1=sc.nextLine();
			 * 
			 * char[] ch = s1.toCharArray();
			 * System.out.print("Uppercase("+s1+")--------->"); for(i=0;i<s1.length();i++) {
			 * 
			 * if(ch[i]>=97 && ch[i]<=122 ) { ch[i]-=32; }
			 * 
			 * }
			 * 
			 * System.out.println(ch);
			 */
		  
		 	}

}
