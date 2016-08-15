
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
    public void pila(){
        pila = new Vector<>();
        count = 0;
    }
    
    /**
     *
     * @param e
     */
    @Override
    public void push(E e){
        pila.add(e); //Agrega en ultima posicion
        count++; //sumarle 1 al contador para saber cuantos elementos se tienen
    }

    /**
     *
     * @return
     */
    @Override
    public E pop(){
        E e = pila.remove(count-1); //quitar y extraer el elemento en la ultima posicion
        count--; //restarle 1 al contador
        return e;
    }

    /**
     *
     * @return
     */
    @Override
    public E getLast(){
        return pila.get(count-1); //obtiene el elemento en la utlima posicion del vector
    }
}
