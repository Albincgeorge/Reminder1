/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
        
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Radeon
 */
public class dbconnect {
Connection con=null;
public static java.sql.Connection dbconnector()
    {
    try
    {Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reminder","root","");
    return con;
    }
    catch (Exception e)
    {
        e.printStackTrace();
        
        return null;
    }
    }  
}
