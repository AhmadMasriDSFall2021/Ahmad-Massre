package list;
public class TestLinkedList {
    public static void main(String[] args) {
       LinkedList l1 = new LinkedList();
       l1.add("Ahmad");
       l1.add("hasan");
       l1.add("said");
       
       LinkedList l2 = new LinkedList();
       l2.add("Mohammad");
       l2.add("random");
       
        System.out.println("LinkedList1:\n"+l1+"\n"+"LinkedList2:\n"+l2+"\n");
        
        LinkedList merge = LinkedList.merge(l1, l2);
        System.out.println("Merged List:\n"+merge+"\n");
        
        l2.replace(1, "George");
        

    }
    
}
