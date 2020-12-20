package Assignment2;
public class NewMain {
    public static void main(String[] args) {
  
        Stack S = new Stack();
        S.push(1);
        S.push(3);
        S.push(5);
        S.print();
        Stack S2 = S.copyReverse();
        S2.print();
        S2.pop();
        S2.print();
      
    }
    
}
