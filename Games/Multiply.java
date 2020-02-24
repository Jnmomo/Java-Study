import java.util.*;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Random myRandomNumber = new Random();
		int myOneDigitNumber1 = Math.abs(myRandomNumber.nextInt() % 10);
		int myOneDigitNumber2 = Math.abs(myRandomNumber.nextInt() % 10);
		int Answer;
		int Input = 0;

		while (Input != -1) {
			System.out.println("How much is " + myOneDigitNumber1 + " times " + myOneDigitNumber2 + "?");
			Input = scan.nextInt();
			Answer = myOneDigitNumber1 * myOneDigitNumber2;

			if (Input == Answer) {
				System.out.println("Very Good!");
				myOneDigitNumber1 = Math.abs(myRandomNumber.nextInt() % 10);
				myOneDigitNumber2 = Math.abs(myRandomNumber.nextInt() % 10);
			}
			if (Input != Answer && Input != -1)
				System.out.println("No. Please try again.");
		}

		if (Input == -1)
			System.out.println("Thank you. You have exited.");

	}

}