/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.template.games;

import com.rama41222.template.engine.Game;

/**
 *
 * @author Rama41222
 */
public class Cricket extends Game{
    
    @Override
    public void initialize() {
        System.out.println("Cricket initialized");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket session started");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket session stopped"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
