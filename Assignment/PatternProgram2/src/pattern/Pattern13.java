package pattern;

public class Pattern13 {

	public static void main(String[] args) {
		for(char i ='A';i<='E';i++)
		{
			for(char j = 'E';j>i;j--)
			{
				System.out.print(" ");
			}
			for(char k = 'A'; k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
