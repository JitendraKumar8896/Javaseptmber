package arrays;

public class SearchElementInArray {

	void searchSpecificElement(int a[], int search) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == search) {

				System.out.println("element found:" + search);
				break;

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int search = 5;
		int a[] = { 1, 2, 5, 4, 5, 4, 9, 8, };
		SearchElementInArray obj = new SearchElementInArray();
		obj.searchSpecificElement(a, search);

	}

}
