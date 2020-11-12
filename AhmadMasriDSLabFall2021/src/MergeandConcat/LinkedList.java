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
    public int merge(int i1, int i2){
        Node cn1 = head;
        Node cn2 = head;
        cn1.setNext(cn2.getValue());
        
        
        
    }
        
    }
     