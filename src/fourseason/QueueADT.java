/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourseason;
/**
 *
 * @author Supphachai
 */
interface QueueADT {

    public void enqueue(Object e) throws Exception;

    public Object dequeue() throws Exception;

    public Object front() throws Exception;

    public boolean isEmpty();

    public boolean isFull();

    public void clear();

    public int size();

}
