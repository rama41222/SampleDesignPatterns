/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.factory.colorfactory;

import com.rama41222.factory.abstractfactory.AbstractFactory;
import com.rama41222.factory.shapefactory.Shape;

/**
 *
 * @author Rama41222
 */
public class ColorFactory extends AbstractFactory {
    public Color getColor(String color){
        if(color == null) {
            return null;
        } else if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("Blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("Green")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
