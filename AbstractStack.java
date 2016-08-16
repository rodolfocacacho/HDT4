/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivet
 */
public abstract class AbstractStack implements IStack{
    
    /**
     *
     * @param e
     */
    @Override
    public void push(Object e){
        
    }

    /**
     *
     * @return lastObjectInStack
     */
    @Override
    public Object pop(){
        
        return null;
    }

    /**
     *
     * @return vectorStatus
     */
    @Override
    public boolean isEmpty(){
        
        return false;
    }

    /**
     *
     * @return vectorSize
     */
    @Override
    public int size(){
        
        return 0;
    }

}