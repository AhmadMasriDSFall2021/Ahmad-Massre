/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author ahmad
 */
public class TestQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.print();
        ArrayQueue q2 = new ArrayQueue();
        q2.print();
    }
    
}
