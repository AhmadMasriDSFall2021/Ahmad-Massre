package Assignment2;

import Assignment2.ArrayList;

public class Queue {
    
    private ArrayList list = new ArrayList();
    
     public int size()
    {
        return list.size();
    }
     
    public void enqueue(Object element)
    {
        list.add(element);
    }
    public Object dequeue()
    {
        return list.remove(list.size());
    }
    public void print(){
        list.print();
    }
    
}
