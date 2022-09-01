package arrays;

public class SearchElementAndFindItsIndexs {

	static void searchAndFindIndex(int a[], int search) {
		int count = 0;
		System.out.println("enter serach element is: " + search);

		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				count++;
				System.out.println("element found at index:" + i);
			}

		}
		System.out.println("Element " + search + " repeated " + count + " times ");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int search = 25;
		int a[] = { 25, 25, 1, 24, 11, 25, 11, 25, 45 };
		// SearchElementAndFindItsIndexs obj = new SearchElementAndFindItsIndexs();
		// obj.searchAndFindIndex(a, search);
		searchAndFindIndex(a, search);

	}

}
