/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.observer;

/**
 *
 * @author Rama41222
 */
public class ObserverTwo implements Observable {

    public ObserverTwo(Subject s) {
        s.add(this);
    }

    @Override
    public void update(String value) {
        System.out.println("Value update observed by observer 2 as : " + value+" : <= Intercepted Enemy transmission");
    }
    
}
