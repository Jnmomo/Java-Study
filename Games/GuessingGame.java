import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		int input = 0;

		System.out.println("Welcome to the Hi-Lo Guessing Game");

		while (input != -1) {

			Random myRandomNumber = new Random();
			int myTwoDigitNumber = Math.abs(myRandomNumber.nextInt() % 100);

			System.out.println("Please take a guess or enter -1 to exit: ");

			Scanner scan = new Scanner(System.in);
			input = scan.nextInt();

			if (input != -1) {
				for (int i = 1; i > -1; i++) {

					if (input < myTwoDigitNumber) {
						System.out.println("Too low!");
						System.out.println("Please try again: ");
						input = scan.nextInt();
					} else if (input > myTwoDigitNumber) {
						System.out.println("Too high!");
						System.out.println("Please try again: ");
						input = scan.nextInt();
					} else {
						System.out.println("Correct! It took you " + i + " guesses.");
						break;
					}

				}
			}

		}

		System.out.println("Thank you for playing!");

	}

}
