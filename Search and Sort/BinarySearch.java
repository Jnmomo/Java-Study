/*
Demonstrate Binary Search:
need to be a sorted array
*/

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 11 };
		int key = 6;

		System.out.println(binarySearch(arr, key));
	}

	public static boolean binarySearch(int[] arr, int key) {
		boolean return_value = false;
		int size = arr.length;
		int low = 0;
		int high = size - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				return_value = true;
			}
			if (arr[mid] < key) {
				low = mid + 1;
			} else
				high = mid - 1;
		}

		return return_value;
	}
}