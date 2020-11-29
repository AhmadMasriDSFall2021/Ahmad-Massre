package Assignment2;
public class NewMain {
    public static void main(String[] args) {
      
        ArrayList a1 = new ArrayList();
        a1.add("Ali");
        a1.add("Mohammad");
        a1.add("Mohammad");
        System.out.println(a1);
        System.out.println("Count = " + a1.countOccurrences(a1));
       
        LinkedList l1 = new LinkedList();
        l1.add("Ali");
        l1.add("Mohammad");
        l1.add("Ahmad");
        l1.print();
        l1.getPrevious("Mohammad");
        l1.print();
        
    }
    
}
