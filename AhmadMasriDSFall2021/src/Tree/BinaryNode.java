/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

public class BinaryNode <T> {
    private T Element;
	private BinaryNode Left,  Right;
//	public boolean isLeaf;
		
	public BinaryNode(T value)
	{
		this(value, null, null);
	}
	
	public BinaryNode(T value, BinaryNode newLeft, BinaryNode newRight)
	{
		Element = value;
		Left = newLeft;
		Right = newRight;
	}
	
	public T getElement()
	{
		return Element;
	}
	
	public void setElement(T value)
	{
		Element = value;
	}
	
	public BinaryNode getLeft()
	{
		return Left;
	}
	
	public void setLeft(BinaryNode newNode)
	{
		Left = newNode;
	}
	
	public void setLeft(int newValue)
	{
		BinaryNode l = new BinaryNode(newValue);
		Left = l;
	}
	
	public BinaryNode getRight()
	{
		return Right;
	}
	
	public void setRight(BinaryNode newNode)
	{
		Right = newNode;
	}
	
	public void setRight(int newValue)
	{
		BinaryNode r = new BinaryNode(newValue);
		Right = r;
	}
	
	// Method 2 - Print tree rooted at current node using preorder traversal
    public void printPreOrder( )
    {
        System.out.println( Element.toString() );       // Node
        if( Left != null )
            Left.printPreOrder( );           // Left
        if( Right != null )
            Right.printPreOrder( );          // Right
    }

    // Method 2 - Print tree rooted at current node using inorder traversal
    public void printInOrder( )
    {
        if( Left != null )
        	Left.printInOrder( );            // Left    
        
        System.out.println( Element.toString() );       // Node
        
        if( Right != null )
            Right.printInOrder( );           // Right
    }

    // Method 2 - Print tree rooted at current node using postorder traversal
    public void printPostOrder( )
    {
        if( Left != null )
            Left.printPostOrder( );          // Left
        if( Right != null )
            Right.printPostOrder( );         // Right
        System.out.println( Element.toString() );       // Node
    }

    public boolean isLeaf()
    {
    	return (Left==null && Right==null);
    }

    // Method 2 - Return the size of the binary tree rooted at t
    public int Size()
    {
    	int s=1;
  	
    	if(Left!= null)
    		s+= Left.Size();
  	
    	if(Right!= null)
    		s+= Right.Size();
  	
    	return s;
    }


   
    
}
