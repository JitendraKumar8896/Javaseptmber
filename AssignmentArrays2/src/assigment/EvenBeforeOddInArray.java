package assigment;

public class EvenBeforeOddInArray {
	static void integerEvenOdd(int arr[])
    {
       
        int left = 0, right = arr.length - 1;
        while (left < right)
        {
           
            while (arr[left]%2 == 0 && left < right)
                left++;
 
           
            while (arr[right]%2 == 1 && left < right)
                right--;
 
            if (left < right)
            {
              
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

	public static void main(String[] args) {
		int arr[] = {12, 34, 45, 9, 8, 90, 3};
		 System.out.println("Before Even Or Odd Converting:");
		 for(int i=0; i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
        integerEvenOdd(arr);
 
        System.out.println("\nArray after Even and  Odd integers. ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
	}

}
