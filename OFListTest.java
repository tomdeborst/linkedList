/**
 * @author Thomas de Borst 
 * Id: 1004302
 * 
 */

/**
 * Class for testing implementation of OFList
 */
public class OFListTest {

	public static void main(String[] args) {
		OFList testList = new OFList();

		/*
		 * This Tests the functionality of the add() method overridden in the OFList
		 * subclass of FList. If implemented correctly this add() method should add each
		 * new node into the list in order from smallest to largest.
		 * 
		 */

		// Add some values for testing intentionally out of order.
		testList.add(5);
		testList.add(2);
		testList.add(3);
		testList.add(1);
		testList.add(4);

		// Test to see if values were added to nodes in the correct order.
		testList.dump();

	}
}
