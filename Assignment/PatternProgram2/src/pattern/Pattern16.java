package pattern;

public class Pattern16 {

	public static void main(String[] args) {
		int rows =5;
		for(int i = rows; i>=1;i--)
		{
			for(int j = rows; j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		
		System.out.println("=============================================");
		for(char i = 'E'; i>='A';i--)
		{
			for(char j = 'E'; j>= i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
