public class StackList {

	private Stack head;

	StackList() {
		head = null;
	}

	// Tests if this stack list is empty:
	public boolean empty() {
		boolean returnValue;

		if (head == null) {
			returnValue = true;
		} else {
			returnValue = false;
		}

		return returnValue;
	}

	// Pushes an item onto the top of the stack list:
	public void push(Stack s) {
		Stack current = head;

		if (head == null) {
			head = s;
		} else {
			s.next = head;
			head = s;
		}
	}

	// Returns the object on the top of the stack list without removing it:
	public Stack peek() {
		if (head == null) {
			return null;
		} else {
			return head;
		}
	}

	// Removes the object on the top of the stack list and returns that object:
	public Stack pop() {
		Stack current = head;

		if (head == null) {
			return null;
		} else {
			head = current.next;
			current.next = null;
			return current;
		}
	}

	// Returns the index position of an object in the stack list, returns -1 if not
	// found:
	public int search(Stack s) {
		int count = 0;
		Stack current = head;

		while (current.str != s.str) {
			if (current.next != null) {
				current = current.next;
				count++;
			} else {
				return -1;
			}
		}

		return count;
	}

	// Prints the stack list:
	public void print() {
		Stack current = head;

		while (current != null) {
			System.out.println(current.str);
			current = current.next;
		}
	}

}