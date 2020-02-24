class Triangle {

	int side1;
	int side2;
	int side3;

	boolean isScalene() {
		boolean return_value;

		if (side1 != side2 && side1 != side3 && side2 != side3)
			return_value = true;
		else
			return_value = false;

		return return_value;
	}

	boolean isIsosceles() {
		boolean return_value;

		if (side1 == side2 && side1 != side3 && side2 != side3)
			return_value = true;
		else if (side1 == side3 && side1 != side2 && side2 != side3)
			return_value = true;
		else if (side2 == side3 && side1 != side2 && side1 != side3)
			return_value = true;
		else
			return_value = false;

		return return_value;
	}

	boolean isEquilateral() {
		boolean return_value;

		if (side1 == side2 && side1 == side3 && side2 == side3)
			return_value = true;
		else
			return_value = false;

		return return_value;
	}

	int calculatePerimeter() {
		int perimeter = side1 + side2 + side3;
		return perimeter;
	}

}