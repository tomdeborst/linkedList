/**
 * @author Thomas de Borst 
 * Id: 1004302
 * 
 */

/**
 * Class for a Linked List
 */

public class FList {

	// Head of linked list.
	FNode head;

	/**
	 * Class for a node within a Linked List(FList)
	 */
	static class FNode {
		public float data;
		public FNode next;

		// Constructor
		FNode(float x) {
			data = x;
			next = null;
		}
	}

	// Main Method to create a Linked List.

	public static void main(String[] args) {
		// Create empty linked list.
		FList list = new FList();
	}

	/**
	 * Method to add data to the head of the list
	 * 
	 * @param the value, as a float, to be added to the list
	 */
	public void add(float x) {
		FNode newNode = new FNode(x);
		newNode.next = null;

		// If the list is empty then new node becomes the head node.
		if (this.head == null) {
			this.head = newNode;
		} else {
			// Else find the last node and insert new node.
			FNode last = this.head;
			while (last.next != null) {
				last = last.next;
			}

			// Insert new node at last position.
			last.next = newNode;
		}

	}

	/**
	 * Method to print out contents of the list
	 */
	public void dump() {
		FNode current = this.head;

		System.out.println("FList: ");

		// Loop through list and print each node's data on a separate line.
		while (current != null) {
			// Print current node.
			System.out.println(current.data);

			// Move to next node.
			current = current.next;
		}
	}

	/**
	 * Method for returning linked list length
	 * 
	 * @returns length of list as type int
	 */

	public int length() {
		FNode current = this.head;
		int count = 0;
		// Loop through linked list and increment count variable for each node.
		while (current != null) {
			// Count current node.
			count++;
			// Move to next node.
			current = current.next;

		}
		return count;
	}

	/**
	 * Method for checking if linked list is empty
	 * 
	 * @returns boolean to represent empty(true) or not empty(false)
	 */
	public boolean isEmpty() {

		// Uses length method for check. If length is 0 return true.

		if (this.length() == 0)
			return true;
		// Else list has at least 1 node, return false.
		else
			return false;
	}

	/**
	 * Method to find a node populated with the value X and remove it from the list
	 * 
	 * @param Takes a variable of type float and removes the node that matches said
	 *              variable
	 */

	public void remove(float x) {

		if (head == null) {
			throw new RuntimeException("List is currently empty");
		}
		FNode current = this.head, prev = null;
		// if value is found in the head node
		if (current != null && current.data == x) {
			this.head = current.next; // new head node

			// Display deletion message
			System.out.println(x + " value found within list, node deleted");

		} else {
			// If not found in head node value is searched for in each node following
			while (current != null && current.data != x) {
				// If value not found proceed through list, keeping track of previous node
				prev = current;
				current = current.next;

			}
			// Value should be present at current node
			if (current != null) {
				// remove node from linked list by linking previous to next.
				prev.next = current.next;

				// Display deletion message
				System.out.println(x + " value found within list, node deleted");
			}
		}
		// Value is not present within list
		if (current == null) {
			// Display not found message
			System.out.println(x + " value not found within list");

		}
	}

	/**
	 * Method to find a node with the given variable
	 * 
	 * @param Takes a variable of type float and loops through the list looking for
	 *              said variable.
	 */

	public void has(float x) {

		FNode current = this.head, prev = null;
		boolean hasValue;
		// if value is found in the head node
		if (current != null && current.data == x) {
			this.head = current.next;

			hasValue = true;
			// Display message
			System.out.println(x + " value found within list");

		}
		// If not found in head node value is searched for in each node following
		while (current != null && current.data != x) {
			// If value not found proceed through list, keeping track of previous node
			prev = current;
			current = current.next;
		}
		// Value should be present at current node
		if (current != null) {
			// remove node from linked list by linking previous to next.
			hasValue = true;
			// Display message
			System.out.println(x + " value found within list");
		}

		// Value is not present within list
		if (current == null) {
			// Display not found message
			System.out.println(x + " value not found within list");

		}
	}

}
