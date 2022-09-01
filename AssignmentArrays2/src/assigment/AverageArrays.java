package assigment;

public class AverageArrays {

	public static void main(String[] args) {
		int n = 6;
	    int arr[] = {1,2,1,1,5,1};
	    //using double as average can be in decimal.
	    double sum = 0;
	    for (int i = 0; i < n; i++) {
	      sum += (double) arr[i];
	    }
	    double average = sum / n;
	    System.out.println("The average is "+average);

	}

}
