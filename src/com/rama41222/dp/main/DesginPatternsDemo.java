/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.dp.main;


import com.rama41222.adapter.AudioOnlyPlayer;
import com.rama41222.adapter.MediaPlayer;
import com.rama41222.builder.Query;
import com.rama41222.builder.QueryBuilder;
import com.rama41222.factory.abstractfactory.AbstractFactory;
import com.rama41222.factory.abstractfactory.FactoryProducer;
import com.rama41222.factory.shapefactory.Shape;
import com.rama41222.factory.shapefactory.ShapeFactory;
import com.rama41222.template.games.Football;
import com.rama41222.template.games.Cricket;
import com.rama41222.singleton.DatabaseManager;

/**
 *
 * @author Rama41222
 */
public class DesginPatternsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Template Method 
        
        Cricket cricket = new Cricket();
        cricket.initialize();
        cricket.startPlay();
        cricket.endPlay();
        
        Football fb = new Football();
        fb.initialize();
        fb.startPlay();
        fb.endPlay();
  
        // Singleton
        DatabaseManager dbm = DatabaseManager.getInstance();
        dbm.connectToMongoDev();
        dbm.connectToMongoProd();
        
        //Factory
        ShapeFactory fact = new ShapeFactory();
        Shape shapeCirc = fact.getShape("Circle");
        shapeCirc.init();
        shapeCirc.draw();
        shapeCirc.erase();
        Shape shapeRect = fact.getShape("Rectangle");
        shapeRect.init();
        shapeRect.draw();
        shapeRect.erase();
        
        //Abstract Factory
        
        AbstractFactory shapeFactory =  FactoryProducer.getFactory("Shape");
        Shape rect = shapeFactory.getShape("Rectangle");
        rect.init();
        rect.draw();
        rect.erase();
        
        //builder pattern
        QueryBuilder sql = new QueryBuilder();
        Query q = sql.Select("*").From("Employee").build();
        System.out.println(q.getQuery());
       
        //Adapter pattern
        AudioOnlyPlayer mp = new AudioOnlyPlayer();
        mp.play("Audio");
        mp.play("Advanced");
    }
    
}
