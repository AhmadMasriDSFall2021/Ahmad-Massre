
package MergeandConcat;
public class LinkedListTest {

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object newElement = null;
        LinkedList instance = new LinkedList();
        instance.add(newElement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of replace method, of class LinkedList.
     */
    @Test
    public void testReplace() {
        System.out.println("replace");
        Object oldElement = null;
        Object newElement = null;
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.replace(oldElement, newElement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
