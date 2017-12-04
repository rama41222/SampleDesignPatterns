/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.factory.abstractfactory;

import com.rama41222.factory.colorfactory.Color;
import com.rama41222.factory.shapefactory.Shape;

/**
 *
 * @author Rama41222
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
