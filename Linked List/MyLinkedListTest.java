public class MyLinkedListTest {
	public static void main(String[] args) {
		MyLinkedList m = new MyLinkedList();

		Node joe = new Node("Joe");
		Node jenny = new Node("Jenny");
		Node emma = new Node("Emma");

		m.addNode(jenny);
		m.addNode(emma);
		m.addNode(joe);

		m.printList();

		System.out.println("***************");

		m.insertBefore(0, new Node("Owen"));
		m.insertAfter(3, new Node("Jack"));
		m.insertBefore(2, new Node("Jill"));

		m.printList();

		System.out.println("***************");

		m.removeNodeAt(2);
		m.removeNodeAt(4);

		m.printList();

		System.out.println("***************");

		System.out.println(m.indexOf("Jenny"));
		System.out.println(m.indexOf("Jill"));
	}
}