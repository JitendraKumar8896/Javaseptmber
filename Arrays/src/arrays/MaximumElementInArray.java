package arrays;

public class MaximumElementInArray {

	void maximumElement(int a[]) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (max < a[j])
					max = a[j];

			}

		}

		System.out.println("Maximum element in Array:" + max);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 58, 2, 4, 4554, 2, 5, 4 };

		MaximumElementInArray obj = new MaximumElementInArray();
		obj.maximumElement(a);

	}
}