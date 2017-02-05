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
public class PathStack<T> {
    private Path<T> data = null;
    
    
    public PathStack(Path<T> path){
        this.data = path;
    }
    
    public void push(T element){
        
    }
    
    public T pop() {
        return null;
    }
    
    public boolean isEmpty(){
        return false;
    }
}
