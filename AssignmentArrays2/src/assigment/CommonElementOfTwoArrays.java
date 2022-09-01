package assigment;

public class CommonElementOfTwoArrays {
	public static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	public static void printCommon(int arr1[], int arr2[])
	{
		for(int i=0; i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
	int arr1[] = {12, 23, 34, 67 ,78, 91, 56};
	int arr2[] = {39, 25, 15, 23, 55, 91, 66, 22};
	System.out.println("Arrays 1 :");
	printArray(arr1);
	System.out.println("Arrays 2");
	printArray(arr2);
	System.out.println("The Common Element Are :");
	printCommon(arr1,arr2);
	
	}

}
