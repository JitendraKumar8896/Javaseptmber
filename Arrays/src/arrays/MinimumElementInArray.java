package arrays;

public class MinimumElementInArray {

	void minimum(int a[]) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (min > a[j])
					min = a[j];

			}

		}
		System.out.println("minimum element in Array:" + min);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, -1, 5, -5, 9, 5, 7, 5, 8 };
		MinimumElementInArray obj = new MinimumElementInArray();
		obj.minimum(a);

	}

}
