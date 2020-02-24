// Calculate earnings of 2 different ways

import java.util.Scanner;

public class Wage {

	public static void main(String[] args) {

		System.out.println("*******************************************************");
		System.out.println("\t\t\tMenu");
		System.out.println("*******************************************************");
		System.out.println("1\tCalculate earnings at $10.00/hr.");
		System.out.println("2\tCalculate earnings at $.10 doubled each hour.");
		System.out.println("3\tExit.");
		System.out.println("*******************************************************");

		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		int hour;
		double wage;

		while (choice != 3) {
			if (choice != 1 && choice != 2) {
				System.out.println("Please make a valid choice: ");
				choice = scan.nextInt();
			}
			if (choice == 1) {
				System.out.println("How many hours?");
				hour = scan.nextInt();
				wage = 10 * hour;
				System.out.println("You will earn $" + wage);
				System.out.println("Please enter another choice or enter 3 to exit: ");
				choice = scan.nextInt();
			}
			if (choice == 2) {
				System.out.println("How many hours?");
				hour = scan.nextInt();
				double Power = Math.pow(2, hour);
				wage = (Power - 1) * 0.1;
				System.out.println("You will earn $" + wage);
				System.out.println("Please enter another choice or enter 3 to exit: ");
				choice = scan.nextInt();
			}
		}
		System.out.println("Thank you. You have exited.");

	}

}