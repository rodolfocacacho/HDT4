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
public interface IStack<E> {

    public void push(Object e);
    public Object pop();
    public boolean isEmpty();
    public int size();
}
