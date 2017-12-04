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
public class AudioOnlyPlayer implements MediaPlayer{
    MediaAdapter ma;
    @Override
    public void play(String type) {
         if(type.equalsIgnoreCase("Audio")){
            System.out.println("Playing Audio on Normal Player");
         } else if(type.equalsIgnoreCase("Advanced")){
             this.ma = new MediaAdapter();
             ma.getPlayer(type);
             ma.play(type);
         }
    }
    //
}
