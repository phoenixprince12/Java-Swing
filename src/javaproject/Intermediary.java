package javaproject;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The Phoenix
 */
public class Intermediary {
    ArrayList names,naac,collid,city;
    
    public Intermediary() {
    names = new ArrayList();
    naac = new ArrayList();
    
    collid = new ArrayList();
    city = new ArrayList();
}
    //Accessor method to get the names
    public ArrayList  getNamesList(){
        return names;
    }
    
    //Accessor method to get the price
   public ArrayList  getNAACList(){
        return naac;
    }
   
   //Accessor method to get the roomNum
   public ArrayList  getSCHOOLID(){
        return collid;
    }
   
   //Accessor method to get the roomHall
   public ArrayList  getCity(){
        return city;
    }

    
}
    

