/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.banking.system.banking_mangement_system;

/**
 *
 * @author raben
 */
import java.sql.*;
import javax.swing.JOptionPane;
        
public class JavaConnect {
    Connection conn= null;
    public  static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:\"C:\\git\\java\\banking_mangement_system\\banking_mangement_system\\bank.sqlite\"");
            return conn;
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
