import java.util.Scanner;

public class GradesTest {

	public static void main(String[] args) {

		// prompt user to input the number of grades:

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of grades to input: ");
		int num = scan.nextInt();

		// create an array called grades with length of user input:

		int[] grades = new int[num];

		// assign values to array elements according to user input
		// check if input values are in range:

		for (int i = 0; i < grades.length; i++) {
			System.out.println("Enter grade " + (i + 1));
			grades[i] = scan.nextInt();
			if (grades[i] < 0 || grades[i] > 100) {
				System.out.println("Input value is not in range, please input again");
				i -= 1;
			}
		}
		System.out.println();

		// create an instance of Grades class and pass in array grades
		// using second constructor:

		Grades g = new Grades(grades);

		// get the value of grades and print:

		int[] myG = g.getValues();
		System.out.println("The grades are: ");
		for (int i = 0; i < myG.length; i++)
			System.out.print(grades[i] + " ");
		System.out.println();

		int high = g.highest();
		System.out.println("The highest grade is " + high);
		System.out.println();

		int low = g.lowest();
		System.out.println("The lowest grade is " + low);
		System.out.println();

		int number = g.numOfGrades();
		System.out.println("The number of grades is " + number);
		System.out.println();

		double avg = g.average();
		System.out.println("The average of grades is " + avg);
		System.out.println();

		// prompt the user to input the failing grade:

		System.out.println("Enter the failing grade value: ");
		int grade = scan.nextInt();

		// return the number of grades in the array that are less than input:

		int numOfFail = g.numOfFailingGrades(grade);
		System.out.println("The number of failing grades is " + numOfFail);
		System.out.println();

		// print the histogram:

		g.histogram();

	}

}