package Assignment2;
public class NewMain {
    public static void main(String[] args) {
       LinkedList l1 = new LinkedList();
       l1.add("Ahmad"); // index 0 
       l1.add("Hasan"); // index 1
       l1.add("said"); // index 2
       l1.print();
       l1.replace(1, "Ali"); // replace node of index 1
       l1.replace(2, "masri"); // replace node of index 2
       l1.print();
       l1.insert(0, "Mohammad");
       l1.print();
       
        
        
    }
    
}
