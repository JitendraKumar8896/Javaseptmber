package assigment;

public class Replace0sAnd1Arrays {
	static int replaceZerosWithOnes(int num) {
	      if (num == 0) {
	         return 1;
	      }
	      int ans = 0, temp = 1;
	      while (num > 0) {
	         int d = num % 10;
	         if (d == 0) {
	            d = 1;
	         }
	         ans = d * temp + ans;
	         num = num / 10;
	         temp = temp * 10;
	      }
	      return ans;
	   }
	
	public static void main(String[] args) {
		
		 int n = 221700341;
		 System.out.println("Before Replacing the Number:");
		 System.out.println(n);
	      int result = replaceZerosWithOnes(n);
	      System.out.println("After replacing zeros with ones :"+ result);

	}

}
