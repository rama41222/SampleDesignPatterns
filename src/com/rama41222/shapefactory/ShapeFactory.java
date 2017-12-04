/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.shapefactory;

import com.rama41222.colorfactory.Color;
import com.rama41222.factory.abstractfactory.AbstractFactory;

/**
 *
 * @author Rama41222
 */
public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        } else if (shape.equalsIgnoreCase("Circle")) {
            return new Circle(); 
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
