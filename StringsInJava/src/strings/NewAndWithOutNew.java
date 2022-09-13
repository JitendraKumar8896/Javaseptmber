package strings;

public class NewAndWithOutNew {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String str = new String ("Programming Language");
		String str2 = new String ("Python");
		
		System.out.println("String using literal....... ");
        System.out.println(s1 == s2);
        System.out.println("---------------------------");
        
        System.out.println("String using new ....... ");
        System.out.println(str == str2);
        System.out.println("---------------------------");
	}

}
