package strings;

public class CheckVowelConsonent3 {
	public static void countType(String str)
	{
		int vowels =0, consonant =0 , spacialChar = 0, digit=0;
		
		for(int i =0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			{
				ch = Character.toLowerCase(ch);
				if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowels++;
				else
					consonant++;
			}
			else if(ch >= '0' && ch <= '9')
				digit++;
			else
				spacialChar++;
		}
		
		System.out.println("Vowels:"+vowels);
		System.out.println("Consonant:"+consonant);
		System.out.println("Digits:"+digit);
		System.out.println("Spacial Character :"+ spacialChar);
		
	}

	public static void main(String[] args) {
		String s = "@Jitendra Kumar #8896";
		countType(s);
	}

}
