/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.shapefactory;

/**
 *
 * @author Rama41222
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void init() {
        System.out.println("Init a rectangle");
    }

    @Override
    public void erase() {
        System.out.println("Erase a rectangle");
    }
    
}
