package pattern;

public class Pattern11 {

	public static void main(String[] args) {
		int rows  = 5;
		for(int i = 1; i <=rows;i++)
		{
			for(int j = rows; j > i;j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= (i * 2) - 1;k++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		

	}

}
