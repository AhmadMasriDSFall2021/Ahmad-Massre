package MergeandConcat;
public class LinkedList implements List {
    private class Node {

        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
            
        }
    }

    private Node head;

    @Override
    public void add(Object newElement) {
        if (head == null) {
            head = new Node(newElement);
        } else {
            // go to the tail of the list, and create a new node with the newElment
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(newElement);
        }
    }
    public boolean replace(Object oldElement, Object newElement){
     if(oldElement == null){
         return false;
     }
     Node currentNode = this.oldElement;
     while(currentNode.next!=null){
            newElement = currentNode.next;
            
     }
     return true;
     }
     @Override
     public int size() {
        if (head == null) {
            return 0;
        } else {
            // head != null
            int size = 1;
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                size++;
            }
            return size;
        }
     }
    public Object get(int index){
        if(head == null){
            return 0;
        }
        Node current = head;
        int count = 0;
        while(current!=null){
           if(count == index){
               return current.value;
           }
       
        count++;
        current = current.next;
    }
        throw new RuntimeException("");
    }
    
    @Override
    public int indexOf(Object element) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.value.equals(element)) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }
 
    public boolean isEmpty(){
        if(head == null){
            return false;
        }
        else
            return true;
    }
    public void makeEmpty(){
        this.head = null;
    }
    
    public Node getHeadNode(){
        if(head == null)
        {
            throw new RuntimeException("List is empty.");
        }
        else
            return this.head;
    }
    public Object getHeadValue(){
        return this.head.value;
    }

    public Object remove() {
        if(this.isEmpty())
        {
            throw new RuntimeException("list is empty");
        }
        Node current = head;
        while(this.isEmpty()==false){
          if(current.next == null){
              current = null;
          }
          current = current.next;
        }
        return current.next.value;
    } 
    @Override
    public boolean remove(Object element) {
        Node current = head;
        Node previousNode;
        while(current != null)
        {
            if(current.value.equals(element))
            {
                previousNode = current.next;
                current = null;
                return true; 
            }
            current=current.next;
        }
        
        return false;
    }
    @Override
    public Object remove(int index) {
        
        Node current = head;
        Node oldNode;
        int counter=0;
        while(current!=null)
        {
            if(counter == index)
            {
                oldNode = current;
                return current;
                
            }
            counter++;
            current=current.next;
            
        }
         throw new RuntimeException("index "+index+" not found." );
       
    }
  }
