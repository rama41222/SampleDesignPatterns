/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.template.engine;

/**
 *
 * @author Rama41222
 */
public abstract class Game {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();
   
    public void gameSession(){
        initialize();
        startPlay();
        endPlay();
    }
}
