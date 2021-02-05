/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;



/**
 *
 * @author ahmad
 */
public class SLLNode {
    
    private Object value;
    private SLLNode next;
    
    //Use: ALT+INSERT shortcut to populate class with constructors, getters, and setters

    public SLLNode() {
    }

    public SLLNode(Object value) {
        this.value = value;
    }

    public SLLNode(Object value, SLLNode next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + ", next=" + next + '}';
    }
}
