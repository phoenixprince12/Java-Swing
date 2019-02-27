package javaproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author The Phoenix
 */
import java.sql.*;
import javax.swing.*;
public class scdb {

    Connection conn=null;
    public static Connection java_scdb(){
        
        try{
            Class.forName("org.json.JDBC");
            Connection conn =DriverManager.getConnection("C:\\Users\\abc\\Desktop\\Final Java Project\\Know The Best\\Schooldb.json");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}