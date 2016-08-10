/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivet
 */
public interface IStack<E> {

    public void push(E e);
    public E pop();
    public boolean isEmpty();
    public E getLast();
    public int size();
    public void clear();
}
