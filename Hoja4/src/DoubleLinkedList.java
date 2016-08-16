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
public class DoubleLinkedList<E> extends AbstractStack implements IList<E> {
    
    private DoubleNode<E> head;
    private DoubleNode<E> temp;
    private E val;
    
    public DoubleLinkedList(){
        head = null;
        temp = null;
        val = null;
        count = 0;
    }
    @Override
    public void addFirst(E e) {
        count++;
        temp = head;
        head = new DoubleNode();
        head.setValue(e);
        head.setNext(temp);
        temp.setPrev(head);
    }

    @Override
    public E removeFirst() {
        if (head == null)
            return null;
        val = head.getValue();
        head = head.getNext(); //ERROR AQUI NO SE PORQUE
        count--;
        return val;
    }

    @Override
    public E getFirst() {
        val = head.getValue();
        return val;
    }


    
}
