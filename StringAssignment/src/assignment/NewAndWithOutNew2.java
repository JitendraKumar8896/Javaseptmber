package assignment;

public class NewAndWithOutNew2 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		
		String str1 = new String("Python is a Programming Language");
		String str2 = new String("Python is a Scripting Programming Language");
		
		String str3 = new String("Python");
		String str4 = new String("Python");
		
		System.out.println("String using literal....... ");
        System.out.println(s1 == s2);
        System.out.println("---------------------------");
        
        System.out.println("String using new ....... ");
        System.out.println(str1 == str2);
        System.out.println("---------------------------");
        
        System.out.println("String using new Same references....... ");
        System.out.println(str3 == str4);
        System.out.println("---------------------------");
        
	}

}
