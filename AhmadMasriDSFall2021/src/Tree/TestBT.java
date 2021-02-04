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
public class TestBT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         BinaryNode N1 = new BinaryNode(3);
  
        BinaryTree T = new BinaryTree(N1);
        

        BinaryNode N2 = new BinaryNode(2);
        BinaryNode N3 = new BinaryNode(1);
    
        N1.setLeft(N2); // sub-root(Left sub-tree)
        N1.setRight(N3); // sub=root(Right sub-tree)
        
        BinaryNode N4 = new BinaryNode(4);
        BinaryNode N5 = new BinaryNode(5);
        BinaryNode N6 = new BinaryNode(6);
        BinaryNode N7 = new BinaryNode(7);
        
        N2.setLeft(N4);
        N2.setRight(N5);
        N3.setLeft(N6);
        N4.setRight(N7);
        T.printInOrder();
        System.out.println(T.countOdd()+" odd numbers");
        System.out.println(T.countEven()+" even numbers");
        System.out.println(T.countLeaves()+" Leave numbers");
        BinaryNode t = T.cloneTree();
        t.printPreOrder();
        
        
    }
    
}
