class UnderGraduateStudent extends Student {

	UnderGraduateStudent() {
	}

	UnderGraduateStudent(int id, int midtermExam, int finalExam) {
		super.setId(id);
		super.setMidtermExam(midtermExam);
		super.setFinalExam(finalExam);
	}

	public char getLetterGrade() {
		char letterGrade;

		if (super.calcAvg() >= 90)
			letterGrade = 'A';
		else if (super.calcAvg() >= 80)
			letterGrade = 'B';
		else if (super.calcAvg() >= 70)
			letterGrade = 'C';
		else if (super.calcAvg() >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';

		return letterGrade;
	}

}