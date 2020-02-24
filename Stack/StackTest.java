public class StackTest {

	public static void main(String[] args) {

		StackList sl = new StackList();

		Stack one = new Stack("One");
		Stack two = new Stack("Two");
		Stack three = new Stack("Three");
		Stack four = new Stack("Four");
		Stack five = new Stack("Five");
		Stack six = new Stack("Six");

		// Test push:
		sl.push(one);
		sl.push(two);
		sl.push(three);
		sl.push(four);
		sl.push(five);
		sl.push(six);

		// Test print:
		sl.print();

		// Test peek:
		System.out.println("Take a look at the top: " + sl.peek().str);

		// Test pop:
		System.out.println("Pop the one at the top: " + sl.pop().str);

		sl.print();

		// Test empty:
		System.out.println("Is the list empty? " + sl.empty());

		// Test search:
		System.out.println("Return the index of One: " + sl.search(one));
	}
}