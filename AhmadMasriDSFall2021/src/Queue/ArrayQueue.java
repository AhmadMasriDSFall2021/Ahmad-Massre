package Queue;

public class ArrayQueue implements QueueInterface {

    private Object[] array;
    private int back;

    public ArrayQueue() {
        //default values
        array = new Object[10];
        back = -1;
    }

    public ArrayQueue(int maxSize) {
        array = new Object[maxSize];
        back = -1;
    }

    @Override
    public boolean isEmpty() {
        return back + 1 == 0;
    }

    @Override
    public void makeEmpty() {
        back = -1;
    }

    public boolean isFull() {
        return back + 1 == array.length;
    }

    //similar to insertAtFront
    @Override
    public void enqueue(Object value) {
        if (isFull()) {
            expand();
        }
        //shift array forward to make space for insertion at front
        for (int i = back + 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = value;
        back++;
    }

    //similar to removeFromBack
   // @Override
    public void dequeue() {
        if (isEmpty()) {
            throw new NullPointerException("Queue is empty. No values to remove.");
        } else {
            back--;
        }
    }

    public void expand() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < back + 1; i++) {
                System.out.print(array[i] + "=> ");
            }
            System.out.println();
        }
    }
    
    public void Search(Object element){
        if(isEmpty()){
            throw new NullPointerException("Queue is empty");
        }
        for(int i= back+1;i>0;i--){
            { if(array[i].equals(element))
                System.out.println(element);}
             
             if(array[i]!=element)
                 System.out.println("element not found");
        }
       
    }
  
    public void getMax(){
         if(isEmpty()){
            throw new NullPointerException("Queue is empty");
        } 
          for(int i= back+1;i>0;i--){
              if(back>back-1){
                  back = back-1;
              }
          }
        
    }
    
 
  
    
    
   
}
