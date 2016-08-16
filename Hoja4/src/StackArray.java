
import java.util.ArrayList;

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
public class StackArray<E> extends AbstractStack implements IStack<E> {
    private ArrayList<E> pila;
    public StackArray(){
        pila = new ArrayList<>();
        count = 0;
    }
    /**
     *
     * @param e elemento tipo E
     */
    @Override
    public void push(E e){
        pila.add(e); //Agrega en ultima posicion e incrementa size en 1
        count++;
    }
    /**
     *
     * @return E elemento en la ultima posicion reduciendo size en 1
     */
    @Override
    public E pop(){
        if (count == 0)
            return null;
        count--;
        return pila.remove(count);
    }
    /**
     *
     * @return E ultimo elemento
     */
    @Override
    public E getLast(){
        return pila.get(count-1);
    }
}