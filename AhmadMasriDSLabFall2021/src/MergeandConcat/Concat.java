package MergeandConcat;
import java.util.Arrays;
public class Concat {
    
    public static String concat(int [] A1,int [] A2 ){
            int s= A1.length+A2.length;
            int s1=A1.length;
            int s2=A2.length;
            int[] newArray= new int[s];
            System.arraycopy (A1, 0, s,0 , s1);
            System.arraycopy ( A2,0,newArray,s1, s2);
            return  Arrays.toString(newArray); 
    }
    public static void main(String[] args) {
        int [] M1= {2,1,6};
        int [] M2 ={0,1,5};
        
            
            
        
        System.out.println(concat(M1,M2));
    }
    
}
