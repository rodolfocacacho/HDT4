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
public class DoubleNode<E> extends Node<E>{
    
    public DoubleNode(){
        
    }
    
    private Node<E> prev;
    
    public void setPrev(Node<E> prev){
        this.prev = prev;
    }
    
    public Node<E> getPrev(){
        return prev;
    }
}
