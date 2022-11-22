/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.ArrayList;

/**
 *
 * @author lopez
 * @param <T>
 */
public class Colas <T> {
    ArrayList<T> queue = new ArrayList<>();
    private int first;

    public Colas() {
    }
    
    public void enqueue(T element){
        queue.add(element);
        first++;
    }
    
    public boolean isEmpty(){
        return this.queue==null;
    }
    
    public void dequeue(){
        queue.remove(0);
        first--;
    }
    
    public int lenght(){
        return this.first;
    }
    
    @Override
    
    public String toString(){
        String estado = "";
        
        for (T dato : queue) {
            estado += dato + " <-- " + " " ;             
        }
        return estado;
    }
    
   
    
}
