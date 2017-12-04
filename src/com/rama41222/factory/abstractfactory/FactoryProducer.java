/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.factory.abstractfactory;
import com.rama41222.colorfactory.ColorFactory;
import com.rama41222.shapefactory.ShapeFactory;

/**
 *
 * @author Rama41222
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory == null) {
            return null;
        } else if (factory.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (factory.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
