/**
 * @author Thomas de Borst 
 * Id: 1004302
 * 
 */

/**
 * Class for testing implementation of FList
 */

public class FListTest {

	// Main Method to test the Linked List.
	public static FList testList = new FList();

	public static void main(String[] args) {

		// Add some values for testing as well as testing the functionality of the add
		// method.

		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);

		// Call test methods

		testHas();
		testRemoveDump();
		testLength();
		testIsEmpty();
	}

	/**
	 * testHas() tests functionality of the has() method. The following tests both
	 * outcomes of the boolean has() method. That being whether the list contains
	 * the given value or not.
	 */
	public static void testHas() {

		// Test if list contains the value 2 (Expected result: true)
		testList.has(2);
		// Test if list contains the value 8 (Expected result: false)
		testList.has(8);

		System.out.println("Test 1 completed");
		System.out.println("...");
		System.out.println("");
	}

	/**
	 * testRemoveDump() tests functionality of the remove and dump methods. The test
	 * first tries remove() with a value known to be in the list and then with a
	 * value known to not be in the list
	 * 
	 * Finally the dump() method is tested to check removal was successful
	 */

	public static void testRemoveDump() {
		// Test if remove method removes the value given
		// Remove the value 2
		testList.remove(2);
		// Remove a value not present
		testList.remove(9);
		// Print the list to test removal
		testList.dump();

		System.out.println("Test 2 completed");
		System.out.println("...");
		System.out.println("");
	}

	/**
	 * testLength() tests the functionality of the length() method. length() is
	 * first called to check the initial length and then called again after an
	 * addition is made with the add() method. Finally, dump() is called to verify
	 * the length is being given accurately.
	 */

	public static void testLength() {
		// Test length method
		System.out.println("List is " + testList.length() + " nodes in length");

		// Add a node to test length method after size change
		testList.add(2);
		System.out.println("List is " + testList.length() + " nodes in length");
		testList.dump();

		System.out.println("Test 3 completed");
		System.out.println("...");
		System.out.println("");
	}

	/**
	 * Tests the functionality of isEmpty() First isEmpty is called on a populated
	 * list to give the expected false result. Then we loop through the list to
	 * remove each node before calling isEmpty once more for an expected true
	 * result.
	 */

	public static void testIsEmpty() {
		// Test isEmpty method.
		System.out.println(testList.isEmpty()); // Expected false

		// Empty list
		int i = 5;
		while (testList.isEmpty() == false) {
			testList.remove(i);
			i--;
		}
		// Test isEmpty method again.
		System.out.println(testList.isEmpty()); // Expected true

		System.out.println("Test 4 completed");
		System.out.println("...");
		System.out.println("");
	}

}
