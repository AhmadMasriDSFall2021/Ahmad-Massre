package Stack;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayStack S = new ArrayStack(10);
      S.push(4);
      S.push(3);
      S.push(2);
      S.print();
      S.pop();
      S.print();
      ArrayStack S2 = new ArrayStack(10);
      S2.ReverseCopy(S);
      System.out.println(S2);
      
      
       
    }
    
}
