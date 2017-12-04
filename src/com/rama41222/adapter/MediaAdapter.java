/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.adapter;

/**
 *
 * @author Rama41222
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer amp;
    
    public void getPlayer(String type){
        if(type.equalsIgnoreCase("Advanced")) {
            this.amp = new MXPlayer();
        }
    }
    @Override
    public void play(String type) {
       amp.play();
    }
    
}
