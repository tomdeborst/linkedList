/**
 * @author Thomas de Borst 
 * Id: 1004302
 * 
 */

/**
 * Class for an Ordered Linked List Is a subclass of FList
 */
public class OFList extends FList {

	/**
	 * Override method to add data to list in an ordered manner.
	 * 
	 * @param the value, as a float, to be added to the list
	 */

	public void add(float x) {

		FNode newNode = new FNode(x);
		FNode current = head;
		FNode previous = null;

		// While the current node isn't null and the value given is greater
		while (current != null && x > current.data) {
			// move through the list
			previous = current;
			current = current.next;
		}
		// If previous is null this must be the new head node
		if (previous == null) {
			head = newNode;
		} else {
			// If previous is not null and the conditions of the previous while loop are met
			// then this must be the correct insert point in the ordered list.
			previous.next = newNode;
		}
		// place the node in the list.
		newNode.next = current;
	}

}
