/**
 * @author RodolfoCyReneO
 */
import java.util.*;


public class StackVector extends AbstractStack{
    
    private Vector<Object> pila;
    
    public StackVector(){
        pila = new Vector<Object>();
    }
    
    public int size(){
        return pila.size();
    }
    
    public void push(Object e){
        pila.add(e);
    }
    
    public Object pop (){
        Object e = pila.lastElement();
        pila.removeElementAt(pila.size()-1);
        return e;
    }
    
    public boolean isEmpty(){
        return pila.isEmpty();
    }

}