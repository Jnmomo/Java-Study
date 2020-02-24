public class Mom implements Speaker {
	public void speak() {
		System.out.println("Hey");
	}

	public void announce(String str) {
		System.out.println("Mom announces: ");
		System.out.println(str);
	}
}