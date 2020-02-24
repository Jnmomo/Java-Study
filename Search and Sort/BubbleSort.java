/*
Demonstrate Bubble Sort - Ascending
will have length - 1 iterations
each iteration will have length - i comparisons
biggest num is pushed to the end each iteration so comparisons will be 1 less each iteration
at last the smallest num is bubbled up to the first one
*/

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 6, 9, 0, 13, 8, 92, -1 };
		bubbleSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void bubbleSort(int[] arr) {
		int temp;

		for (int i = 1; i < arr.length; i++) { // controls the number of iteration, which will be length - 1
			for (int j = 0; j < arr.length - i; j++) { // controls the comparison inside each iteration
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}