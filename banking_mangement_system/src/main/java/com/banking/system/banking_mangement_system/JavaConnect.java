package com.banking.system.banking_mangement_system;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class JavaConnect {
    public static Connection ConnectDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            // Corrected database path with escaped backslashes
            String dbPath = "jdbc:sqlite:C:\\git\\java\\banking_mangement_system\\banking_mangement_system\\bank.db";
            Connection conn = DriverManager.getConnection(dbPath);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
