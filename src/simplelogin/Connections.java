/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplelogin;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Griya Salbini
 */

public class Connections {
    private static Connection mysqlconnect;
    public static Connection OpenDB(){
        String database = "jdbc:mysql://localhost:3306/simpleloginjava"; // ini adalah nama database kamu
        String user = "root";
        String password = "root";        
        //you must have a database before (MySQL database)
        // i was have database        
        if (mysqlconnect==null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlconnect = (Connection) DriverManager.getConnection(database,user,password);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Connection Failed !");
            }
        }        
        return mysqlconnect;
    }
}