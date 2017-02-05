/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpncalc;

/**
 *
 * @author Mikkel
 */
public class ArrayStack<T> {

    public T[] data = null;
    private int top = -1;

    public ArrayStack() {
        data = (T[])new Object[1];
    }
    
    public void push(T element){
        data[++top] = element;
        T[] dest;
        if(top == data.length -1) {
            dest = (T[])new Object[data.length*2];
            System.arraycopy(data, 0, dest, 0, data.length);
            data = dest;
        }
        
    }
    
    public T pop(){
        T d = data[top];
        System.arraycopy(data, 0, data, 0, top);
        top--;
        return d;
        
    }
    
    public boolean isEmpty(){
        if(data.length == 0){
            return true;
        }
        return false;
    }
}
