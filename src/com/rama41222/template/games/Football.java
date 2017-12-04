package com.rama41222.template.games;


import com.rama41222.template.engine.Game;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rama41222
 */
public class Football extends Game {

    @Override
    public void initialize() {
        System.out.println("Football initialized"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void startPlay() {
        System.out.println("Football session created"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endPlay() {
        System.out.println("Football Session ended"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
