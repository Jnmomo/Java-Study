/*
Selection Sort - Ascending
*/

public class SelectionSort {
	public static void main(String[] args) {

		int[] arr = { 5, 1, 12, -5, 16, 2, 12, 14 };
		selectionSort(arr);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void selectionSort(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}

			temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}
}