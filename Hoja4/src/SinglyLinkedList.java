/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivet
 * @param <E>
 */
public class SinglyLinkedList<E> extends AbstractStack implements IList<E> {
    
    private Node<E> head;
    private Node<E> temp;
    private E val;
    
    public SinglyLinkedList(){
        head = null;
        temp = null;
        val = null;
        count = 0;
    }

    /**
     *
     * @param e
     */
    @Override
    public void addFirst(E e) {
        temp = head;
        head = new Node();
        head.setValue(e);
        head.setNext(temp);
        count++;
    }
    @Override
    public E removeFirst() {
        val = head.getValue();
        head = head.getNext();
        count--;
        return val;
        
    }
    @Override
    public E getFirst() {
        val = head.getValue();
        return val;
    }
    
}
