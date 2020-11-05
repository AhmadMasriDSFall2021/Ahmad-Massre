package AssignmentLab;
import java.util.Scanner;
public class NewMain {
    public static boolean isAscending(int[] IncreasingA){
      
        for(int i=0;i<IncreasingA.length-1;i++)
        {
            if(IncreasingA[i]>IncreasingA[i+1])
                return false;
            
        }
                return true;
    
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = 5;
        int[] A= new int[size];
        for(int j=0;j<size;j++){
            System.out.println("enter an integer\n");
            A[j] = s.nextInt();
            
        }
       if(isAscending(A) == true)
           System.out.println("The array is in Ascending order");
        else
           System.out.println("The array is in Disascending order");
           
        
    }
    
}
