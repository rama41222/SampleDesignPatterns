/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rama41222
 */
public class Subject{
    List <Observable> observers = new ArrayList<Observable>();
    private String value = "";
    
    public void add(Observable observer) {
        observers.add(observer);
    }
    
    public void set(String val) {
        this.value = val;
        this.notifyAllObservers();
    }
    
    public String get() {
        return this.value;
    }
   
    private void notifyAllObservers(){
        for(Observable ob : observers) {
            ob.update(this.value);
        }
    }
}
