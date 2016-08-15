/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivet
 */
public abstract class AbstractStack{
    protected int count;
    
    public int size(){
        return count;
    }
    
    public boolean isEmpty(){
        return count == 0; //true si vacia, false si no
    }
}
