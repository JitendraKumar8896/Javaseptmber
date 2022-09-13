package strings;

public class StringConvertor {

	public static void main(String[] args) {
		String s = "Java is a programing language";
		int cnt =0;
		char ch[] = s.toCharArray();
		for(int i=0; i<s.length(); i++)
		{
			cnt = 1;
			char c = ch[i];
			for(int j=i+1; j < ch.length;j++)
			{
				if(ch[j] == c)
				{
					cnt++;
					ch[j] = '0';
				}
			}
			if(ch[i]!='0')
				System.out.println(c+" "+cnt);
		}

	}

}
