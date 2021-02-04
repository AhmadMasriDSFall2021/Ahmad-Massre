/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author ahmad
 */
public class TestBST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BST t = new BST();
        
        t.Add(40);
        t.Add(30);
        t.Add(60);
        t.Add(16);
        t.Add(35);
        t.Add(50);
        t.Add(70);
        t.Add(7);
        t.Add(32);
        t.Add(55);
        t.Add(80);
        t.printPreOrder();
        System.out.println("sum of leaves = " +t.SumOfLeaves());
        
        if(t.isBST() == 1)
            System.out.println("Binary search tree");
        if(t.isBST() == 0)
            System.out.println("not binary search tree");
        System.out.println(t.getLevelOf(50));
        System.out.println(t.SumOfLeaves());
    }
    
}
