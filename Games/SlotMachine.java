import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

	public static void main(String[] args) {

		int input = 0;

		Random myRandomNumber = new Random();
		int myOneDigitNumber1 = Math.abs(myRandomNumber.nextInt() % 10);
		int myOneDigitNumber2 = Math.abs(myRandomNumber.nextInt() % 10);
		int myOneDigitNumber3 = Math.abs(myRandomNumber.nextInt() % 10);

		System.out.println("Welcome to the Slot Machine Game. Enter 1 to start or enter -1 to exit.");

		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();

		while (input != -1) {

			if (myOneDigitNumber1 == myOneDigitNumber2 && myOneDigitNumber2 == myOneDigitNumber3) {

				System.out.println(myOneDigitNumber1 + "\t" + myOneDigitNumber2 + "\t" + myOneDigitNumber3);
				System.out.println("Winner!");
				System.out.println("Enter 1 for a new set of numbers or enter -1 to exit: ");
				myOneDigitNumber1 = Math.abs(myRandomNumber.nextInt() % 10);
				myOneDigitNumber2 = Math.abs(myRandomNumber.nextInt() % 10);
				myOneDigitNumber3 = Math.abs(myRandomNumber.nextInt() % 10);
				input = scan.nextInt();

			} else if (myOneDigitNumber1 == myOneDigitNumber2 || myOneDigitNumber1 == myOneDigitNumber3
					|| myOneDigitNumber2 == myOneDigitNumber3) {

				System.out.println(myOneDigitNumber1 + "\t" + myOneDigitNumber2 + "\t" + myOneDigitNumber3);
				System.out.println("Not bad!");
				System.out.println("Enter 1 for a new set of numbers or enter -1 to exit: ");
				myOneDigitNumber1 = Math.abs(myRandomNumber.nextInt() % 10);
				myOneDigitNumber2 = Math.abs(myRandomNumber.nextInt() % 10);
				myOneDigitNumber3 = Math.abs(myRandomNumber.nextInt() % 10);
				input = scan.nextInt();

			} else {

				System.out.println(myOneDigitNumber1 + "\t" + myOneDigitNumber2 + "\t" + myOneDigitNumber3);
				System.out.println("Bad luck. Try again!");
				System.out.println("Enter 1 for a new set of numbers or enter -1 to exit: ");
				myOneDigitNumber1 = Math.abs(myRandomNumber.nextInt() % 10);
				myOneDigitNumber2 = Math.abs(myRandomNumber.nextInt() % 10);
				myOneDigitNumber3 = Math.abs(myRandomNumber.nextInt() % 10);
				input = scan.nextInt();
			}

		}

		System.out.println("Thank you for playing!");

	}

}
