package test;

public class Test {

	public static void main(String[] args) {
		
     String s1 ="Java";
     String s2 ="guides";
    
	 System.out.println("Before Swapping two strings:");
	 System.out.println(" s1 => " +s1);
	 System.out.println(" s2 => " +s2);
	 	/*
	 String temp;
	 temp = s1;
	 s1 = s2;
	 s2 = temp;
	 System.out.println("After Swapping two strings:");
	 System.out.println(" s1 =>" +s1);
	 System.out.println("s2 =>" +s2); 
	  */
 
	 s1 = s1 +s2;
	 s2 = s1.substring(0, s1.length() - s2.length());
	 
	 s1 = s1.substring(s2.length());
	 System.out.println("After Swapping two strings:");
	 System.out.println(" s1 => " +s1);
	 System.out.println(" s2 => " +s2); 
	 
	 
	}

}
