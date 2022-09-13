package pattern;

public class Pattern20 {

	public static void main(String[] args) {
		for(char i = 'E'; i>='A';i--)
		{
			for(char j = 'E'; j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
