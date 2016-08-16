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
public interface IList<E> {
    public void addFirst(E e); //Push
    public E removeFirst(); //Pop
    public E getFirst(); //get
}
