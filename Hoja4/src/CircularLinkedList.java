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
public class CircularLinkedList<E> extends AbstractStack implements IList<E> {
    private Node<E> head;
    private Node<E> tail;
    private Node<E> temp;
    private E val;
    
    public CircularLinkedList(){
        head = null;
        tail = null;
        temp = null;
        val = null;
        count = 0;
    }
    @Override
    public void addFirst(E e) {
        count++;
        temp = head;
        head = new Node();
        head.setValue(e);
        head.setNext(temp);
        if (count == 1)
            tail = head;
        tail.setNext(head);
    }
    @Override
    public E removeFirst() {
        if (head == null)
            return null;
        val = head.getValue();
        head = head.getNext();
        count--;
        tail.setNext(head);
        return val;
    }
    @Override
    public E getFirst() {
        val = head.getValue();
        return val;
    }
    
}
