// Given a time; show updated time after 60 seconds

public class TimeTest {

	public static void main(String[] args) {

		// 1.using the default constructor:

		Time t1 = new Time();
		t1.setTime(9, 59, 48);
		System.out.println("The current time is: ");
		t1.printTime();
		t1.tick(60);
		System.out.println("After 60 seconds the time is: ");
		t1.printTime();
		System.out.println();

		Time t4 = new Time();
		t4.setTime(12, 59, 0);
		System.out.println("The current time is: ");
		t4.printTime();
		t4.tick(60);
		System.out.println("After 60 seconds the time is: ");
		t4.printTime();
		System.out.println();

		// 2.using the second construtor:

		Time t2 = new Time(23, 59, 59);
		System.out.println("The current time is: ");
		t2.printTime();
		t2.tick(60);
		System.out.println("After 60 seconds the time is: ");
		t2.printTime();
		System.out.println();

		Time t3 = new Time(17, 59, 6);
		System.out.println("The current time is: ");
		t3.printTime();
		t3.tick(60);
		System.out.println("After 60 seconds the time is: ");
		t3.printTime();
		System.out.println();
	}

}