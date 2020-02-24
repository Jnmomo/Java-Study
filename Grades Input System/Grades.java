class Grades {

	private int[] values;

	Grades() {
		values = null;
	}

	Grades(int[] myArray) {
		values = myArray;
	}

	public void setValues(int[] myArray) {
		values = myArray;
	}

	public int[] getValues() {
		return values;
	}

	public int highest() {
		int max = values[0];
		for (int i = 0; i < values.length; i++) {
			if (max < values[i])
				max = values[i];
		}
		return max;
	}

	public int lowest() {
		int min = values[0];
		for (int i = 0; i < values.length; i++) {
			if (min > values[i])
				min = values[i];
		}
		return min;
	}

	public int numOfGrades() {
		return values.length;
	}

	public double average() {
		int sum = 0;
		double avg;
		for (int i = 0; i < values.length; i++)
			sum += values[i];

		avg = sum / values.length;
		return avg;
	}

	public int numOfFailingGrades(int gradeValue) {
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] < gradeValue)
				count++;
		}
		return count;
	}

	public void histogram() {
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int countF = 0;

		for (int i = 0; i < values.length; i++) {
			if (values[i] >= 90)
				countA++;
			else if (values[i] >= 80)
				countB++;
			else if (values[i] >= 70)
				countC++;
			else if (values[i] >= 60)
				countD++;
			else
				countF++;
		}

		System.out.print("90 - 100 | ");
		for (int i = 1; i <= countA; i++)
			System.out.print("*");

		System.out.print("\n");

		System.out.print("80 - 89  | ");
		for (int i = 1; i <= countB; i++)
			System.out.print("*");
		System.out.print("\n");

		System.out.print("70 - 79  | ");
		for (int i = 1; i <= countC; i++)
			System.out.print("*");
		System.out.print("\n");

		System.out.print("60 - 69  | ");
		for (int i = 1; i <= countD; i++)
			System.out.print("*");
		System.out.print("\n");

		System.out.print("< 60     | ");
		for (int i = 1; i <= countF; i++)
			System.out.print("*");
	}

}
