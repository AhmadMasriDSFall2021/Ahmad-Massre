package list;
public class LinkedList implements List {
    private class Node {

        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
            
        }

        public void setNext(Node next) {
            this.next = next;
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
    
    public Node getHead(){
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

    public Object remove() { // Remove Tail
        if(this.isEmpty())
        {
            throw new RuntimeException("list is empty");
        }
        Node current = head;
        while(this.isEmpty()==false){ // while(head!=null)
          if(current.next == null){
              current = null;
          }
          current = current.next;
        }
        return current.next.value;
    } 
    @Override
    public boolean remove(Object element) { // Remove the node which is = to the element(from the middle)
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
    public Node getTailNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch tail.");
        }
        //initialize
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public static LinkedList merge(LinkedList list1, LinkedList list2) {
        
        if (list1.isEmpty()) // if(list1 == null)
        {
            return list2;
        }
        if (list2 == null) { // if(list2.isEmpty())
            return list1;
        }
        if(list1 == null && list2 == null){ // if(list1.isEmpty() && list2.isEmpty())
            throw new RuntimeException("No list found");
        }
      
        LinkedList merged = list1;
        merged.getTailNode().setNext(list2.getHead());

        return merged; 
    }
    public Node reverse(Node node){
     Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
   public boolean search(Object element){
       Node current = head;
       while(current != null){
           if(current.value.equals(element)){
               return true;
           }
           current = current.next;
       }
       return false;
   }
    public void replace(int index, Object newElement){
       Node current = head;
       int counter = 0;
       while(current!=null){
           if(counter == index){
              current.value = newElement;
           }
           counter++;
           current=current.next;
       }
       throw new RuntimeException("Index not found");
   }
   
    
    
  }
