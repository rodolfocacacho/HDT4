/**
 * @author RodolfoCyReneO
 */
import java.util.*;


public class StackVector extends AbstractStack{
    
    private Vector<Object> pila;
    
    public StackVector(){
        pila = new Vector<Object>();
    }
    
    @Override
    public int size(){
        return pila.size();
    }
    
    @Override
    public void push(Object e){
        pila.add(e);
    }
    
    @Override
    public Object pop (){
        Object e = pila.lastElement();
        pila.removeElementAt(pila.size()-1);
        return e;
    }
    
    @Override
    public boolean isEmpty(){
        return pila.isEmpty();
    }

}