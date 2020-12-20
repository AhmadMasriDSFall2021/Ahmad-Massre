package Assignment2;

import Assignment2.ArrayList;


public class Stack { // Array Stack

    private ArrayList list = new ArrayList();
    
    public int size()
    {
        return list.size();
    }
    
    public void push(Object element)
    {
        list.add(element);
    }
    
    public Object pop()
    {
        return list.remove(list.size()-1);
    }
   
   
    public void print(){
        list.print();
    }
     public Stack copy()
    {
        Stack list2 = new Stack();
        for(int i=0;i<list.size();i++){
            list2.push(list.getElement(i));
        }
        return list2;
    }
    public Stack copyReverse()
     {
         Stack list2 = new Stack();
        for(int i=0;i<list.size();i++){
            list2.push(list.getElement(i-1));
        }
        return list2;
     }
       
     
}