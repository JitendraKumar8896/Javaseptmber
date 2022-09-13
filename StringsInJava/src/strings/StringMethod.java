package strings;

public class StringMethod {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Language";
		String s3 = "java";
		String s4 = "Java";
		String s5 = "Core";
		System.out.println(s1 == s5);
		System.out.println(s2.length());
		
		int a=10;    
	    s4=String.valueOf(a);    
		System.out.println("Value Of A:"+s4+10);  
		
		System.out.println("CompareTo IgnoreCase:"+s1.compareTo(s3));//ASCII Value Compare
		
		System.out.println("Index Of:"+s2.indexOf('a'));
		
		System.out.println("Trime Value:"+s2.trim());
		
		System.out.println("Start with :"+s5.startsWith("Co"));
		
		System.out.println("Ends with:"+s2.endsWith("age"));
		
		System.out.println("Last index of:"+ s2.lastIndexOf('a'));
		
		System.out.println("contains:"+s2.contains("gs"));
		
		System.out.println("Replace:"+s2.replace('n', 'N')+" "+ s2.replace("age", "AGE"));
		
		System.out.println("cseracah from index:"+s2.indexOf('a', 5));
		
		System.out.println("Substing :"+ s2.substring(3));
		
		System.out.println("Substring 2 inputs:"+s2.substring(2, 6));
		
		System.out.println(s5.toUpperCase());
		
		System.out.println(s5.toLowerCase());
		
		System.out.println("Charat:"+s2.charAt(4));

	}

}
