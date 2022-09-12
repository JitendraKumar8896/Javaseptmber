package assignment;

import java.util.Scanner;

public class CopyString {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter String:");
	    
	    String str = sc.nextLine();
	    System.out.println("Before Copy String: "+ str);
        
	    System.out.print("Copying String...\n");
	      
	    StringBuffer strCopy = new StringBuffer(str);
	      
	    System.out.print("String Copied Successfully..!!\n");      
	    System.out.print("After Copied String is :" + strCopy);
	}

}
