package pattern;

public class MockTestPattern {

	public static void main(String[] args) {
		int rows = 4;
		char ch = 'a';
		for(int i = 1; i<=rows ; i++)
		{
			for(int j =1; j<=i;j++)
			{
				System.out.print(ch+ " ");
			}
			System.out.println();
			ch++;
		 }
			ch--;
			for(int i =rows-1; i>=1; i--)
			{
				ch--;
				
				for(int j = 1; j<=i; j++)
				{
					System.out.print(ch + " ");
				}
				System.out.println();
			}

	}

}
