
import java.util.List;

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
public class StackList<E> extends AbstractStack implements IStack<E>{
    private IList<E> pila;
    public StackList(int tipo){
        if(tipo == 1) {
        } else {
            pila = new SinglyLinkedList<>();
        }
        if(tipo == 2)
            pila = new DoubleLinkedList<E>();
        if(tipo == 3)
            pila = new CircularLinkedList<E>();
        count = 0;
    }
    @Override
    public void push(E e) {
        
    }

    @Override
    public E pop() {
        return ;
    }

    @Override
    public E getLast() {
        return ;
    }
}
