public class Cat implements Speaker {
	public void speak() {
		System.out.println("Meow");
	}

	public void announce(String str) {
		System.out.println("Cat announces: ");
		System.out.println(str);
	}
}