/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;


/**
 *
 * @author ahmad
 */
public class DLLTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      DLL myList = new DLL("Bader");
//        DLL_withTail myList = new DLL_withTail("Bader");
//        DLL_withTailAndSize myList = new DLL_withTailAndSize("Bader");

        myList.insertAtBack("Chantal");
        myList.insertAtFront("George");
        myList.insertAtBack("Sirine");

        myList.print();

        System.out.println("Element at index 3 is: " + myList.get(3));

        System.out.println("George has index of: " + myList.indexOf("George"));

        System.out.println("Size of list is: " + myList.size());

        System.out.println("Removing from back.");
        myList.removeFromBack();
        myList.print();

        System.out.println("Removing from front.");
        myList.removeFromFront();
        myList.print();
    }
    
}
