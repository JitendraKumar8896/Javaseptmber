package constructor;

import java.util.Scanner;

public class OverloadMethods {
	 public void compare(int a, int b) {
	        
	        if (a > b) {
	            System.out.println("First Is Grater:"+a);
	        }
	        else {
	            System.out.println("Second Is Grater:"+b);
	        }
	        
	    }
	    
	    public void compare(char a, char b) {
	        int x = (int)a;
	        int y = (int)b;
	        
	        if (x > y) {
	            System.out.println("First Character Is Grater:"+a);
	        }
	        else {
	            System.out.println("Second Character Is Grater:"+b);
	        }
	        
	    }
	    public void compare(String a, String b) {
	        
	        int l1 = a.length();
	        int l2 = b.length();
	        
	        if (l1 > l2) {
	            System.out.println("First String Is Grater:"+a);
	        }
	        else {
	            System.out.println("Second String Is Grater:"+b);
	        }

	    }
	    

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		OverloadMethods obj = new OverloadMethods();
        
        System.out.print("Enter first integer: ");
        int n1 = in.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = in.nextInt();
        obj.compare(n1, n2);
        
        System.out.print("Enter first character: ");
        char c1 = in.next().charAt(0);
        System.out.print("Enter second character: ");
        char c2 = in.next().charAt(0);
        in.nextLine();
        obj.compare(c1, c2);
        
        System.out.print("Enter first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter second string: ");
        String s2 = in.nextLine();
        obj.compare(s1, s2);

	}

}
