/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpncalc;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 *
 * @author Mikkel
 */
public class ArrayStack<T> implements Iterable<T>{

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
        T result = data[top];
        data[top] = null;
        top--;
        return result;
    }
    
    public boolean isEmpty(){
        if(data.length == 0){
            return true;
        }
        return false;
    }
    
    public T[] getData(){
        return data;
    }

    @Override
    public Iterator iterator() {
        Iterator it = new Iterator(){
            private int cursor = 0;
            
            public boolean hasNext() {
                return this.cursor < data.length && data[cursor] != null;
            }

            public T next() {
                return data[cursor++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
   
}
