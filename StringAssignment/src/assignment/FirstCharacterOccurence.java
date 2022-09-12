package assignment;

import java.util.Scanner;

public class FirstCharacterOccurence {
   public static void firstChar(String str, char ch)
   {
	  int i=0, flag=0;
	  while(i < str.length())
	  {
		  if(str.charAt(i)==ch)
		  {
			  flag++;
		      break;
		  }
		  i++;
		  if(flag == 0)
		  {
			  System.out.println("\nSorry! We haven't found the Character");
		  }
		  else
		  {
			  System.out.println("\nThe First Character Occurrence of %c at %d position"+ch+ i);
						
		  }
	  }
   }

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter String :");
		String str = sc.nextLine();
		
		System.out.println("Enter the String to find first char occur=");
        char ch = sc.next().charAt(0);		
        firstChar(str,ch);		

	}

}
