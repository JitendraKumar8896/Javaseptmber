package strings;

public class StringImmutable2 {

	public static void main(String[] args) {
		String s = "Python";
		
		System.out.println("proved immutable...");
		s.concat("is a programming language");
		System.out.println(s);
	}

}
