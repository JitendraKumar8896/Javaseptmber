package assigment;
import java.util.Scanner;

public class Question1Array {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Size of Arrays:");
	   int size = sc.nextInt();
       int arr[] = new int[size];
       System.out.println("Enter array Elements...");
       for(int i= 0;i<size;i++)
       {
    	   arr[i] = sc.nextInt();
       }
       System.out.println("Element of Arrays:");
       for(int i=0;i<size;i++)
       {
    	   System.out.print(" "+arr[i]);
       }
	}

}
