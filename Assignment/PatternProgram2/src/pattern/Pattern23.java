package pattern;

public class Pattern23 {

	public static void main(String[] args) {
      int alpha = 65;
      int rows =5;
      for(int i=1; i<= rows; i++)
      {
    	  for(int j=rows; j > i; j--)
    	  {
    		  System.out.print(" ");
    	  }
    		  int temp =1;
    		  for(int k =1; k <= i; k++)
    		  {
    			  System.out.print((char) (alpha - 1 + temp)+ " ");
    			  temp = temp *(i -k) /(k);
    		  }
    		  System.out.println( );
      }

	}

}
