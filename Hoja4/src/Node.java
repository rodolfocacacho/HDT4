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
public class Node<E> {
    
    public Node(){
        
    }
    
    protected E value;
    protected Node<E> next;
    
    public void setValue(E value){
        this.value = value;
    }
    
    public E getValue(){
        return value;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
    public Node<E> getNext(){
        return next;
    }
}
