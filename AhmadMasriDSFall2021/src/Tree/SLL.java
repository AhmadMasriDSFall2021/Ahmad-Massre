
package Tree;




public class SLL {
    

    private SLLNode head;

    public SLL() {
        this.head = null;
    }

    public SLL(SLLNode head) {
        this.head = head;
    }

    public SLL(Object nodeValue) {
        this.head = new SLLNode(nodeValue);
    }

    
    public int size() {
        if (isEmpty()) {
            return 0;
            //you can also check here if head.getNext() == null to return 1
            //but it's not necessary as it will be checked in the loop
        } else {
            SLLNode currentNode = this.head;
            int count = 0;
            while (currentNode != null) {
                currentNode = currentNode.getNext();
                count++;
            }
            return count;
        }
    }

    
    public boolean isEmpty() {
        return this.head == null;
        //similar to
//        if(this.head == null){
//            return false;
//        } else {
//            return true;
//        }
    }

    //clear linked list
    public void makeEmpty() {
        this.head = null;
    }

    public SLLNode getHeadNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch head.");
        } else {
            return this.head;
        }
    }

    public Object getHeadValue() {
        return this.getHeadNode().getValue();
    }

    public SLLNode getTailNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch tail.");
        }
        //initialize
        SLLNode currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public Object getTailValue() {
        return this.getTailNode().getValue();
    }

    //remove initial conditions
    public SLLNode getNode(int index) {
        //no need since we are throwing default exception after while loop
//        if (index < 0 || index >= size()) {
//            throw new ArrayIndexOutOfBoundsException();
//        } else if (isEmpty()) {
//            throw new RuntimeException("Cannot fetch node, list is empty!");
//        } else {

        SLLNode currentNode = this.head;
        int i = 0;
        while (currentNode != null) {
            if (i == index) {
                return currentNode;
            }
            i++;
            currentNode = currentNode.getNext();
        }
        throw new RuntimeException("Object at given index is not found!");
//        }
    }

    
    public Object get(int index) {
        return this.getNode(index).getValue();
    }

    //similar to contain method
    
    public int indexOf(Object element) {
        SLLNode currentNode = this.head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getValue().equals(element)) {
                return index;
            }
            index++;
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    
    public void add(Object newElement) {
        if (head == null) { //or if(isEmpty())
            head = new SLLNode(newElement);
        } else {
            SLLNode currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new SLLNode(newElement));
        }
    }
    
    //removes the last element of the linked list
    
    public void remove() {
        if (isEmpty()) { //OR if this.head == null //OR if size == 0
            throw new RuntimeException("List is empty.");
        } else if (this.head.getNext() == null) { //OR if size ==1
            this.makeEmpty();
        } else {
            SLLNode tailNode = this.getTailNode();

            SLLNode currentNode = head;
            while (!currentNode.getNext().equals(tailNode)) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
        }
    }

    
    public Object remove(int index) {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        } else {
            if (index == 0) {
                return this.removeHead();
            } else {
                SLLNode nodeAtIndex = this.getNode(index);
                SLLNode currentNode = this.head;
                //traversing the linked list to find the node at given index
                while (!currentNode.getNext().equals(nodeAtIndex)) {
                    currentNode = currentNode.getNext();
                }

                currentNode.setNext(nodeAtIndex.getNext());
                return nodeAtIndex.getValue();
            }
        }
    }

    public Object removeHead() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty. Cannot remove head");
        } else {
            SLLNode nodeToDelete = this.head;
            if (this.head.getNext() == null) {
                this.makeEmpty();
            } else {
                SLLNode secondNode = this.head.getNext();
                this.head = secondNode;
            }
            return nodeToDelete.getValue();
        }
    }

    
    public Object remove(Object element) {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        } else {
            int indexOfElementToRemove = this.indexOf(element);
            return this.remove(indexOfElementToRemove);
        }
    }

    public static SLL merge(SLL list1, SLL list2) {
        //list1: 1 => 2 => 3
        //list2: 4 => 5 => 6
        //list3: 1 => 2 => 3 => 4 => 5 => 6
        if (list1.isEmpty()) //if list1.head == null
        {
            return list2;
        }
        if (list2.isEmpty()) {
            return list1;
        }

        if (list1.isEmpty() && list2.isEmpty()) {
            throw new RuntimeException();
        }

        //first way
//        SLL mergedList1 = new SLL();
//
//        Node head1 = list1.head; //or list1.getHeadNode();
//        Node head2 = list2.head; //or list2.getHeadNode();
//
//        Node tail1 = list1.getTailNode();
////        Node tail2 = list2.getTailNode(); I didn't use it
//
//        mergedList1.head = head1;
//        tail1.setNext(head2);
        //second way
        SLL mergedList2 = list1;
        mergedList2.getTailNode().setNext(list2.head);

        return mergedList2; //or uncomment first way, comment second way, and return mergedList1 to test first way;
    }

    
    public void print() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            SLLNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " --> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("");
        }
    }
}
