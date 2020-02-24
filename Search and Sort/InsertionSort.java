/*
Insertion Sort - Descending
Compare and swap
*/

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 6, 1, 3 };
		insertionSort(arr);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void insertionSort(int[] arr) {
		int temp;

		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] > arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}
}