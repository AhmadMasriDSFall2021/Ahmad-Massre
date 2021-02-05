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
public class BST {

    private BSTNode Root;

    public BST() {
        Root = null;
    }

    public BST(int value) {
        Root = new BSTNode(value);
    }

    public BST(BSTNode theRoot) {
        Root = theRoot;
    }

    public BSTNode getRoot() {
        return Root;
    }

    public void makeEmpty() {
        Root = null;
    }

    public boolean isEmpty() {
        return Root == null;
    }
   

    public boolean Search(int value) {
        if (Root == null) {
            return false;
        }

        return Root.Search(value);
    }

    public void printPreOrder() {
        if (Root != null) {
            Root.printPreOrder();
        }
    }
    private void printPreOrder(BinaryNode cn)
    {
       System.out.println(cn.getElement().toString());
       
       if(cn.getLeft() != null)
    	   printPreOrder(cn.getLeft());
       
       if(cn.getRight() != null)
    	   printPreOrder(cn.getRight());
    }

    public void printInOrder() {
        if (Root != null) {
            Root.printInOrder();
        }
    }

    public void printPostOrder() {
        if (Root != null) {
            Root.printPostOrder();
        }
    }
    

    public int Size() {
        return Root.Size();
    }

    public int Height() {
        return Root.Height();
    }
    public boolean Add(int value){
        if(Root == null){
            Root = new BSTNode(value);
            return true;
        }
        return Root.Add(value);
    }
    public void DoubleValues(BST t){
        if(t.getRoot() == null)
            return;
        DoubleValues(Root);
    }
    
    private void DoubleValues(BSTNode n){
        if(n.getRight()!=null)
            DoubleValues(n.getRight());
        
        System.out.println(n.getElement()*2);
        
        if(n.getLeft()!=null)
            DoubleValues(n.getLeft());
        
    }
    public int getLevelOf(int value){
        if(Root == null)
            return 0;
        return getLevelOf(Root,value);
        
    }
    private int getLevelOf(BSTNode n,int value){
        if(n.getElement() == value)
            return 1;
        else {
            if(value<n.getElement())
                    return 1 + getLevelOf(n.getLeft(),value);
            return 1 + getLevelOf(n.getRight(),value);  
        }
        
    }
    public int SumOfLeaves(){
        if(Root == null)
            return 0;
        return SumOfLeaves(Root);
    }
    private int SumOfLeaves(BSTNode n){
        if(n.getLeft() != null && n.getRight()!=null)
            return 1 + SumOfLeaves(n.getLeft()) + SumOfLeaves(n.getRight());
        else{
            return n.getElement();
        }
    }
    public int getMin(){
        if(Root == null)
            return 0;
        return getMin(Root);
    }
    private int getMin(BSTNode n){
        int min = (int)n.getElement();
        int minL = getMin(n.getLeft());
        if(n.getLeft()!=null)
            return minL;
        return min;
    }
    public boolean Remove(int value) {
        if (Root == null) {
            return false;
        } else {
            if (Root.getElement() == value) {
                BSTNode auxRoot = new BSTNode(0);
                auxRoot.setLeft(Root);
                boolean result = Root.Remove(value, auxRoot);
                Root = auxRoot.getLeft();
                return result;
            } else {
                return Root.Remove(value, null);
            }
        }
    }

    public int isBST(){
        return isBST(Root);
    }
    private int isBST(BSTNode n){
        if(n==null)
          return 1;
        else {
         if(n.getLeft()!=null && n.getRight()!=null)   
           if(isBST(n.getLeft())<n.getElement())
               return 1;
         if(n.getRight()!=null)   
           if(isBST(n.getRight())>n.getElement())
               return 1;
         return 0;
            
        }
                

    }
     public void RemoveOdd(){
         RemoveOdd(Root);
     }
     private void RemoveOdd(BSTNode n){
         if(n.getElement()%2 !=0)
            Remove(n.getElement());
         if(n.getLeft()!=null)
             RemoveOdd(n.getLeft());
         if(n.getRight()!=null)
             RemoveOdd(n.getRight());      
     } 
     public int getMax(){
         if(Root == null){
             return 0;
         }
         return Root.getMax();
     }
     private int getMax(BinaryNode n){
         int max = (int) n.getElement();
         int maxR = getMax(n.getRight());
         if(n.getRight()!=null)
             return maxR;
         return max;
        
		
	} 
     public static void PrintArraySortedUsingBST(SLL list){
         BST t = new BST();
          SLL cn;
          while(cn != null){
              t.Add(cn.getNode());
          }
          t.printInOrder();
     }
    
    
   
    
    
        
 }
    
    

    
   



