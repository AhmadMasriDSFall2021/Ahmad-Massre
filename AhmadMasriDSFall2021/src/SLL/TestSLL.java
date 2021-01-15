/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLL;

/**
 *
 * @author ahmad
 */
public class TestSLL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          SLL list1 = new SLL();
        SLL list2 = new SLL();
        SLL list3 = new SLL();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.print();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.print();
        list3.union(list1, list2);
        list3.print();
        
    }
    
}
