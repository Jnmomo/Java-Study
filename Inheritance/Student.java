class Student {
	private int id;
	private int midtermExam;
	private int finalExam;

	Student() {
		this.id = 0;
		this.midtermExam = 0;
		this.finalExam = 0;
	}

	Student(int id, int midtermExam, int finalExam) {
		this.id = id;
		this.midtermExam = midtermExam;
		this.finalExam = finalExam;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setMidtermExam(int midtermExam) {
		this.midtermExam = midtermExam;
	}

	public int getMidtermExam() {
		return midtermExam;
	}

	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}

	public int getFinalExam() {
		return finalExam;
	}

	public double calcAvg() {
		double avg;
		avg = (midtermExam + finalExam) / 2.0;
		return avg;
	}

	public char getLetterGrade() {
		char letterGrade = ' ';

		return letterGrade;
	}

}
