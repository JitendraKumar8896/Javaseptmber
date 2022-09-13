package pattern;

public class Pattern21 {

	public static void main(String[] args) {
		char temp = 'A';
		for(char i = 'A'; i<= 'E';i++)
		{
			for(char j = 'A';j<=i;j++)
			{
				System.out.print(temp+" ");
				temp ++;
			}
			System.out.println();
		}

	}

}
