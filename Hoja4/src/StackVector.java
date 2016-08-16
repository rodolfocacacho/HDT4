
import java.util.Vector;

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
public class StackVector<E> extends AbstractStack implements IStack<E>{
    private Vector<E> pila;
    public StackVector(){
        pila = new Vector<E>();
        count = 0;
    }
    /**
     *
     * @param e element tipo E
     */
    @Override
    public void push(E e){
        pila.add(e); //Agrega en ultima posicion
        count++; //sumarle 1 al contador para saber cuantos elementos se tienen
    }
    /**
     *
     * @return E ultimo elemento reduciendo size en 1
     */
    @Override
    public E pop(){
        if (count == 0)
            return null;
        count--; //restarle 1 al contador
        return pila.remove(count);
    }
    /**
     *
     * @return E ultimo elemento
     */
    @Override
    public E getLast(){
        return pila.get(count-1); //obtiene el elemento en la utlima posicion del vector
    }
}
