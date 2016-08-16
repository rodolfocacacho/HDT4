import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RodolfoC
 */
public class StackArray extends AbstractStack{
    private ArrayList<Object> pila;
    
    public StackArray(){
    pila = new ArrayList<Object>();
    }
    
    public int size(){
        return pila.size();
    }
    
    public boolean isEmpty(){
        return pila.isEmpty();
    }
    
    public Object pop(){
        Object e = pila.get(pila.size()-1);
        pila.remove(pila.size()-1);
        return e;
    }
    
    public void push(Object e){
        pila.add(e);
    } 
}

