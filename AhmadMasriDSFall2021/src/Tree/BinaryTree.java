/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author ahmad
 * @param <T>
 */
public class BinaryTree<T> {
 private BinaryNode Root;
	
	public BinaryTree()
	{
		Root = null;
	}
	
    public BinaryTree( T rootValue )
    {
        Root = new BinaryNode( rootValue, null, null );
    }
    
	public BinaryTree(BinaryNode theRoot)
	{
		Root = theRoot;
	}

    public BinaryNode getRoot( )
    {
        return Root;
    }
    
    public void makeEmpty( )
    {
        Root = null;
    }

    public boolean isEmpty( )
    {
        return Root == null;
    }

    public void printPreOrder( ) // N L R
    {
      if( Root != null )
          printPreOrder(Root);   // Method 1
       // Root.printPreOrder( ); // Method 2
    }
   
    // Method 1 - recursive helper
    private void printPreOrder(BinaryNode cn)
    {
       System.out.println(cn.getElement().toString());
       
       if(cn.getLeft() != null)
    	   printPreOrder(cn.getLeft());
       
       if(cn.getRight() != null)
    	   printPreOrder(cn.getRight());
    }

    public void printInOrder( )
    {
        if( Root != null )
        	printInOrder(Root); // Method 1
          	// Root.printInOrder( );  // Method 2
    }
    
    // Method 1 - recursive helper
    private void printInOrder(BinaryNode CR) // L N R
    {
    	if (CR.getLeft() != null)
    		printInOrder(CR.getLeft());
    		
    	System.out.println(CR.getElement().toString());
    	
    	if (CR.getRight() != null)
    		printInOrder(CR.getRight());	
    }

    public void printPostOrder( )
    {
      if( Root != null )
          printPostOrder(Root);   // Method 1
       // Root.printPostOrder( ); // Method 2
    }

    // Method 1 - recursive helper
    private void printPostOrder(BinaryNode cn) // RECURSION HELPER
    {      
       if(cn.getLeft() != null)
    	   printPreOrder(cn.getLeft());
       
       if(cn.getRight() != null)
    	   printPreOrder(cn.getRight());
       
       System.out.println(cn.getElement().toString());
    }
    
    public void PrintLevelOrder() // Using a Queue
    {    	
    	if (Root == null)
    		System.out.println("Tree is empty");
    	else
    	{
        /*
            LinkedQueue<BinaryNode> q = new LinkedQueue<BinaryNode>();
            q.Enqueue(Root);    
        	
        	BinaryNode n;
    		while (! q.isEmpty())
    		{
    			n = q.getFront();
    			// add its left to the q
    			if (n.getLeft() != null)
    				q.Enqueue(n.getLeft());
    			
    			// add its right to the q
    			if (n.getRight() != null)
    				q.Enqueue(n.getRight());
    			
    			// print the value of the node
    			System.out.println(n.getElement().toString());		
    			
    			// remove the node from the q
    			q.Dequeue();
    		}
        */
    	}
    }
    
    public int Size( )
    {
    	return Size(Root);  // Method 1
        // return Root.Size( );  // Method 2
    }

    // Method 1 - recursive helper
    private int Size( BinaryNode currentRoot )
    {
        if( currentRoot == null )
            return 0;
        else
            return 1 + Size( currentRoot.getLeft() ) + Size( currentRoot.getRight() );
    }  
    
     public boolean contains(T item) {
        if (Root == null) {
            return false;
        }

        return contains(Root,item);
    }
     private boolean contains(BinaryNode cn,T item){
          if(item == cn.getElement())
            return true;
          else {
            if(cn.getLeft() != null)
                return contains(cn.getLeft(),item);
             if(cn.getRight() != null)
                return contains(cn.getRight(),item);
        }     
        return false;
     }
      public int count(T item) {
          int count=0;
        if (Root == null) {
            return 0;
        }

        return count(Root,item);
    }
      private int count(BinaryNode cn,T item){
         
          if(cn == null)
            return 0;
         
          else 
              if(cn.getElement() == item)
                  return count(cn.getLeft(),item) + 1 + count(cn.getRight(),item);
          else  
            return count(cn.getLeft(),item) + count(cn.getRight(),item);
     }
     public T getPathTo(T item){
          if(Root == null)
              return null;
          return getPathTo(Root,item);
      }
      private T getPathTo(BinaryNode cn, T item){
          if(cn.getLeft() != null)
                return getPathTo(cn.getLeft(),item);
          return getPathTo(cn.getRight(),item);
              
    
      }  
     public int getMin() {
        if (Root == null) {
            throw new RuntimeException("Tree is empty.");
        } else {
            return getMin(Root);
        }
    }
      private int getMin(BinaryNode N){
          int min = (int )N.getElement();
          int minL,minR;
          
          
          if(N.getLeft()!=null){
            
              minL = getMin(N.getLeft());
              if(min>minL)
                  min = minL;
             
          }
           if(N.getRight()!=null){
              
              minR = getMin(N.getRight());
              if(min>minR)
                  min = minR;
              
          }
          return min;
      }
     
      public int getMax() {
        if (Root == null) {
            throw new RuntimeException("Tree is empty.");
        } else {
            return getMax(Root);
        }
    }
      private int getMax(BinaryNode N){
          int min = (int )N.getElement();
          int minL,minR;
          
          
          if(N.getLeft()!=null){
            
              minL = getMax(N.getLeft());
              if(min<minL)
                  min = minL;
             
          }
           if(N.getRight()!=null){
              
              minR = getMax(N.getRight());
              if(min<minR)
                  min = minR;
              
          }
          return min;
      }
      public int countOdd(){
          return countOdd(Root);
      }
      private int countOdd(BinaryNode n){
          if(n == null)
              return 0;
          else
              if((int)n.getElement() %2 != 0 )
                  return countOdd( n.getLeft()) + 1 + countOdd( n.getRight());
          return countOdd( n.getLeft()) + countOdd( n.getRight());
      }
      public int countEven(){
          return countEven(Root);
      }
      private int countEven(BinaryNode n){
          if(n == null)
              return 0;
          else
              if((int)n.getElement()%2 == 0)
                 return countEven(n.getLeft()) + 1 + countEven(n.getRight());
          return countEven(n.getLeft()) + countEven(n.getRight());
      }
      public int countLeaves(){
          if(Root == null)
              return 0;
          return countLeaves(Root);
      }
      private int countLeaves(BinaryNode n){
          if(n.getLeft()!= null && n.getRight() != null)
              return countLeaves(n.getLeft()) + countLeaves(n.getRight());
          
          return 1;
      }
       public BinaryNode cloneTree(){
        return cloneTree(Root);
    }
       private BinaryNode cloneTree(BinaryNode n){
        if(n == null)
            return n;
        BinaryNode t = n; 
        t.setLeft(cloneTree(t.getLeft()));
        t.setRight(cloneTree(t.getRight()));
        t.setElement(t.getElement());
        return t;
    }
       public BinaryNode mirrorTree()
       {
           return mirrorTree(Root);
       }
       private BinaryNode mirrorTree(BinaryNode n){
           if(n==null)
               return n;
           BinaryNode t = n;
           t.setElement(n.getElement());
           t.setLeft(mirrorTree(n.getRight()));
           t.setRight(mirrorTree(n.getLeft()));
           
           return t;
           
       }
       public int countOneChildNodes(){
           return countOneChildNodes(Root);
       }
       private int countOneChildNodes(BinaryNode n){
           int count = 0;
            if(n!=null){
               if (n.getLeft() == null && n.getRight() != null ) {
                  count++;
               countOneChildNodes(n.getLeft());
               }
               if(n.getLeft() != null && n.getRight() == null )
                   count++;
               countOneChildNodes(n.getRight());
            }
            return count;
            
      
   }
}



