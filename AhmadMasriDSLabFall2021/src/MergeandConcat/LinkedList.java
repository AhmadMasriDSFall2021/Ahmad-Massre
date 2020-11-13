package MergeandConcat;

public class LinkedList implements List {
    
    private class Node {

        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        
    }

    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
    

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
     Object currentNode = oldElement;
     while(currentNode!=null){
            newElement = currentNode;
            
     }
     return true;
    }
    public Object merge(LinkedList a2){
        this.getTail().setNext(a2.getHead());
        Node currentNode = this.getHead();
        Object mList = new Node(this.getHead());
         
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
                mList.add(currentNode);
                
            }
            Node head2 = a2.getHead();
            currentNode.setNext(new Node(head2));
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
                mList.add(currentNode);}
        return mList;
        
    }

     
          
    }
