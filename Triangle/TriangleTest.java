// Given 3 triangles, decide their type and calculate perimeter

public class TriangleTest {

	public static void main(String[] args) {

		Triangle t1 = new Triangle();
		int t1Perimeter;

		t1.side1 = 6;
		t1.side2 = 6;
		t1.side3 = 6;
		System.out.println("t1: " + t1.side1 + " " + t1.side2 + " " + t1.side3);

		if (t1.isScalene())
			System.out.println("t1 is a scalene triangle.");
		else
			System.out.println("t1 is not a scalene triangle.");

		if (t1.isIsosceles())
			System.out.println("t1 is an isosceles triangle.");
		else
			System.out.println("t1 is not an isosceles triangle.");

		if (t1.isEquilateral())
			System.out.println("t1 is an equilateral triangle.");
		else
			System.out.println("t1 is not an equilateral triangle.");

		t1Perimeter = t1.calculatePerimeter();
		System.out.println("The perimeter of t1 is " + t1Perimeter);

		System.out.println();

		Triangle t2 = new Triangle();
		int t2Perimeter;

		t2.side1 = 3;
		t2.side2 = 4;
		t2.side3 = 3;
		System.out.println("t2: " + t2.side1 + " " + t2.side2 + " " + t2.side3);

		if (t2.isScalene())
			System.out.println("t2 is a scalene triangle.");
		else
			System.out.println("t2 is not a scalene triangle.");

		if (t2.isIsosceles())
			System.out.println("t2 is an isosceles triangle.");
		else
			System.out.println("t2 is not an isosceles triangle.");

		if (t2.isEquilateral())
			System.out.println("t2 is an equilateral triangle.");
		else
			System.out.println("t2 is not an equilateral triangle.");

		t2Perimeter = t2.calculatePerimeter();
		System.out.println("The perimeter of t2 is " + t2Perimeter);

		System.out.println();

		Triangle t3 = new Triangle();
		int t3Perimeter;

		t3.side1 = 6;
		t3.side2 = 4;
		t3.side3 = 8;
		System.out.println("t3: " + t3.side1 + " " + t3.side2 + " " + t3.side3);

		if (t3.isScalene())
			System.out.println("t3 is a scalene triangle.");
		else
			System.out.println("t3 is not a scalene triangle.");

		if (t3.isIsosceles())
			System.out.println("t3 is an isosceles triangle.");
		else
			System.out.println("t3 is not an isosceles triangle.");

		if (t3.isEquilateral())
			System.out.println("t3 is an equilateral triangle.");
		else
			System.out.println("t3 is not an equilateral triangle.");

		t3Perimeter = t3.calculatePerimeter();
		System.out.println("The perimeter of t3 is " + t3Perimeter);

		System.out.println();
	}

}