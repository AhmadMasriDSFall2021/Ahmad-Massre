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
public class BSTNode
{
	private int Element;
	private BSTNode Left,  Right;
//	public boolean isLeaf;
	
	public BSTNode(int value)
	{
		Element = value;
	}
	
	public int getElement()
	{
		return Element;
	}

    public void setElement(int Element) {
        this.Element = Element;
    }
        
	
	public BSTNode getLeft()
	{
		return Left;
	}
	
	// exceptional; used for BST.Remove
	public void setLeft(BSTNode newLeft) 
	{
		if ((Left == null) && (newLeft.getElement() < this.Element))
			Left = newLeft;
		
		
	}

	public BSTNode getRight()
	{
		return Right;
	}

    public void setRight(BSTNode newRight) {
        if((Right == null) && (Right.getElement() > this.Element))
            Right = newRight;  
    }
        
		
    public boolean Add(int value) 
    { 
        if (value == this.Element) // Duplicate value
        {
        	// System.out.println("Duplicate value");
        	return false;
        }
        else if (value < this.Element) 
        { 
              if (Left == null) 
              { 
            	  Left = new BSTNode(value);
            	  return true;
              } 
              else 
            	  return Left.Add(value);
        } 
        else // if (value > this.Element) 
        { 
              if (Right == null) 
              { 
            	  Right = new BSTNode(value); 
                  return true; 
              } 
              else 
            	  return Right.Add(value); 
        } 
        
        // return false; 
	} 
    
    public boolean Remove(int value, BSTNode parent) 
    { 
        if (value < this.Element) 
        { 
              if (Left != null) 
                    return Left.Remove(value, this); 
              else 
                    return false; 
        }
        else if (value > this.Element) 
        { 
              if (Right != null) 
                    return Right.Remove(value, this); 
              else 
                    return false; 
        }
        else 
        { 
        	if (Left != null && Right != null) 
            { 
        		this.Element = Right.FindMin(); 
        		Right.Remove(this.Element, this); 
            } 
        	else if (parent.Left == this) 
        	{ 
        		 parent.Left = (Left != null) ? Left : Right;
//        		if (Left != null)
//        			parent.Left = Left;
//        		else parent.Left = Right;
        	}
        	else if (parent.Right == this) 
        	{ 
        		 parent.Right = (Left != null) ? Left : Right; 
//        		if (Left != null)
//        			parent.Right = Left;
//        		else parent.Right = Right;
            } 
            return true; 
        } 
	}
    public int FindMin()
    { 
    	if (Left == null) 
              return Element; 
        else 
              return Left.FindMin(); 
    }
        
	// Print tree rooted at current node using preorder traversal
    public void printPreOrder( )
    {
        System.out.println( Element );       // Node
        if( Left != null )
            Left.printPreOrder( );           // Left
        if( Right != null )
            Right.printPreOrder( );          // Right
    }

    // Print tree rooted at current node using inorder traversal
    public void printInOrder( )
    {
        if( Left != null )
        	Left.printInOrder( );            // Left
        System.out.println( Element );       // Node
        if( Right != null )
            Right.printInOrder( );           // Right
    }
    
    // Print tree rooted at current node using postorder traversal
    public void printPostOrder( )
    {
        if( Left != null )
            Left.printPostOrder( );          // Left
        if( Right != null )
            Right.printPostOrder( );         // Right
        System.out.println( Element );       // Node
    }

    public boolean isLeaf()
    {
    	return (Left==null && Right==null);
    }
    
    // Return the size of the binary tree rooted at t.
    public int Size()
    {
    	return Size(this);
    }

    // Recursive helper for Size() operation
    private int Size( BSTNode currentRoot )
    {
        if( currentRoot == null )
            return 0;
        else
            return 1 + Size( currentRoot.getLeft() ) + Size( currentRoot.getRight() );
    }
    
    // Return the height of the binary tree rooted at t.
    public int Height()
    {
    	return Height(this);
    }
    
    // Recursive helper for Height() operation
    private int Height( BSTNode currentRoot )
    {
        if( currentRoot == null )
            return -1;
        else
            return 1 + Math.max( 
            		Height( currentRoot.getLeft() ), 
            		Height( currentRoot.getRight() ) 
            		);
    }
    
    public int getMax()
    { 
    	if (Right == null) 
              return Element; 
        else 
              return Right.getMax(); 
    }
    public boolean Search(int value){
        if(value == this.Element)
            return true;
        else if(value<this.Element){
            if(Left == null)
                return false;
            else
                return Left.Search(value);
        }
        else if(value>this.Element){
            if(Right == null)
                return false;
            else
                return Right.Search(value);
        }
        return false;
            
        
    }

 }
