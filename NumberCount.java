// Ask user to input number from 0 to 50 and count occurrences of each number input

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {

		// since we only count the occurrences of 0 to 50, we need
		// an array of 51 elements:
		int[] array = new int[51];
		int input = -100;

		Scanner scan = new Scanner(System.in);

		// prompt user to input number, if the input number in range
		// increment the element with same index as input
		// eg: if input is 1, increment the array element with index of 1
		// if the input is not in range, keep asking the user to input
		// at the same time decrement counter i until user input is valid
		// if user input is -1, break out of loop
		while (input != -1) {
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter a value between 0 and 50 [ -1 to end ]: ");
				input = scan.nextInt();

				if (input >= 0 && input <= 50) {
					array[input]++;
				} else if (input < -1 || input > 50) {
					System.out.println("Input value is not in range, please input again");
					i -= 1;
				} else
					break;
			}

		}

		// display the output when user entered -1 to end:
		System.out.println("Input finished.");
		for (int i = 0; i <= 50; i++) {
			if (array[i] != 0)
				System.out.println("The value of " + i + " has " + array[i] + " occurrences.");
		}

	}

}