public class StudentTest {

	public static void main(String[] args) {

		// create an instance of UnderGraduateStudent called Owen
		// using second constrctor to pass in parameters:
		UnderGraduateStudent Owen = new UnderGraduateStudent(1, 88, 93);

		// get ID:
		System.out.println("Owen's ID is: " + Owen.getId());

		// get midterm exam:
		System.out.println("Owen's midterm exam is: " + Owen.getMidtermExam());

		// get final exam:
		System.out.println("Owen's final exam is: " + Owen.getFinalExam());

		// call calcAvg() method to calculate average grades:
		System.out.println("Owen's average is: " + Owen.calcAvg());

		// call getLetterGrade() to get letter grade:
		System.out.println("Owen's letter grade is: " + Owen.getLetterGrade());

		System.out.println("***************************");

		// create an instance of GraduateStudent called Jenny
		// using parameterless constructor:
		GraduateStudent Jenny = new GraduateStudent();

		// set ID:
		Jenny.setId(6);

		// get ID:
		System.out.println("Jenny's ID is: " + Jenny.getId());

		// set midterm exam:
		Jenny.setMidtermExam(98);

		// get midterm exam:
		System.out.println("Jenny's midterm exam is: " + Jenny.getMidtermExam());

		// set final exam:
		Jenny.setFinalExam(100);

		// get final exam:
		System.out.println("Jenny's final exam is: " + Jenny.getFinalExam());

		// call calcAvg() method to calculate average grades:
		System.out.println("Jenny's average is: " + Jenny.calcAvg());

		// call getLetterGrade() to get letter grade:
		System.out.println("Jenny's letter grade is: " + Jenny.getLetterGrade());

	}

}