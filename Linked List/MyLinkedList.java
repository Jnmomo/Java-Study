class MyLinkedList {
	private Node head;

	MyLinkedList() {
		head = null;
	}

	public void addNode(Node n) {
		// add a Node to end of the LinkedList
		Node current = head;

		if (head == null) {
			head = n;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = n;
		}

	}

	public void printList() {
		// print each element in the LinkedList
		Node current = head;
		int count = 0;

		while (current != null) {
			System.out.println(count + " " + current.name);
			current = current.next;
			count++;
		}

	}

	public void insertBefore(int index, Node n) {
		// adds Node n before index value
		Node current = head;

		if (head == null) {
			head = n;
		} else if (index == 0) {
			n.next = head;
			head = n;
		} else {
			int count = 0;
			while (count < index - 1) {
				current = current.next;
				count++;
			}
			n.next = current.next;
			current.next = n;
		}
	}

	public void insertAfter(int index, Node n) {
		// adds Node n after index value
		Node current = head;

		if (head == null) {
			head = n;
		} else {
			int count = 0;
			while (count < index) {
				current = current.next;
				count++;
			}
			n.next = current.next;
			current.next = n;
		}
	}

	public int indexOf(String str) {
		// returns index of where String str is at. Returns -1 if String str is not in
		// LinkedList
		int count = 0;
		Node current = head;

		while (current.name != str) {
			if (current.next != null) {
				current = current.next;
				count++;
			} else {
				return -1;
			}
		}

		return count;
	}

	public void removeNodeAt(int index) {
		// removes Node at index value
		Node current = head;
		Node previous = head;

		if (head != null) {
			if (index == 0) {
				head = current.next;
				current.next = null;
			} else {
				int count = 0;
				while (count < index) {
					previous = current; // index - 1
					current = current.next; // index
					count++;
				}
				previous.next = current.next;
				current.next = null;
			}
		}
	}

}