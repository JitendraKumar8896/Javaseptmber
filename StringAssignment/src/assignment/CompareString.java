package assignment;

public class CompareString {
	public static int  stringCompare(String str1, String str2)
	{
		int length1 = str1.length();
		int length2 = str2.length();
		int min_length = Math.min(length1, length2);
		for(int i=0; i < min_length; i++)
		{
			int char1 = (int)str1.charAt(i);
			int char2 = (int)str2.charAt(i);
			if(char1 != char2)
			{
				return char1 - char2;
			}
		}
       if(length1 != length2)
       {
    	   return length1 - length2;
       }
       else
       {
    	   return 0;
       }
		
	}

	public static void main(String[] args) {
		
     String str1 = new String("Java Program");
     System.out.println("String First:"+str1);
     
     String str2 = new String("Java");
     System.out.println("String Second:"+str2);
     
     System.out.println("String Comparison:"+stringCompare(str1, str2));
	}

}
