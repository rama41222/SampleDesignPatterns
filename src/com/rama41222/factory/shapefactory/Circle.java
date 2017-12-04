/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.factory.shapefactory;

/**
 *
 * @author Rama41222
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init() {
        System.out.println("Init a Circle"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void erase() {
        System.out.println("Erase a circle"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
