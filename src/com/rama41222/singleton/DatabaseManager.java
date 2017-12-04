/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.singleton;

/**
 *
 * @author Rama41222
 */
public class DatabaseManager {
    private static DatabaseManager dbm = new DatabaseManager();
    
    private DatabaseManager(){}
    
    public  static DatabaseManager getInstance(){
        return dbm;
    }
    
    public Boolean connectToMongoProd(){
        System.out.println("Connected to Mongo Prod db");
        return true;
    }
    
    public Boolean connectToMongoDev(){
        System.out.println("Connected to Mongo Dev db");
        return true;
    }
}
