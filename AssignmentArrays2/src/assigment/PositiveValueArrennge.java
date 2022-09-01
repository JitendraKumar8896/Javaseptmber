package assigment;

import java.util.Arrays;

public class PositiveValueArrennge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int array[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
	       System.out.println("Original array : "+Arrays.toString(array)); 
	       int j,temp,arr_size;

	        arr_size = array.length;
	        for (int i = 0; i <arr_size; i++){
	            j = i;  
	            
	         
	         
	            while ((j > 0) && (array[j] >0) && (array[j-1] < 0)){
	                  temp = array[j];
	                  array[j] = array[j-1];
	                  array[j-1] = temp;
	                  j--;
	            }
	        }
	       System.out.println("New array : "+Arrays.toString(array)); 

	}

}
