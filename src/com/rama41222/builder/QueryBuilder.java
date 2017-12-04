/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.builder;

/**
 *
 * @author Rama41222
 */
public class QueryBuilder {
      protected Query query;
      private String queryString = "";
      
      public QueryBuilder(){
      }

      public Query build(){
          return new Query(queryString);
      }
      
      public QueryBuilder Select(String word){
          if(word.equalsIgnoreCase("*")) {
              this.queryString = this.queryString + " Select "+ word;
              return this;
          }
          return null;
      }
      
      public QueryBuilder From(String word){
          if(word.equalsIgnoreCase("Employee")) {
              this.queryString = this.queryString + " From " + word;
              return this;
          }
          return null;
      }
}
