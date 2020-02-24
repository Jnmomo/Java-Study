// Calculate changes: purchasing amount under $100;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {

		int number;
		int quater;
		int dime;
		int nickle;
		int penny;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the purchase amount [0-100]: ");
		number = scan.nextInt();

		if (number < 0 || number > 100) {

			System.out.println("ERROR: Input value is not in range!");

		}

		else {

			int change;
			change = 100 - number;

			quater = change / 25;
			change = change % 25;

			dime = change / 10;
			change = change % 10;

			nickle = change / 5;
			change = change % 5;

			penny = change;

			System.out.println("Your change of " + (100 - number) + " cents is given as:");
			System.out.println(quater + " Quaters");
			System.out.println(dime + " Dimes");
			System.out.println(nickle + " Nickles");
			System.out.println(penny + " Pennies");

		}

	}

}
