/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Bilal
 */
public class Connecter {

    Connection con;
    

    public static Connection Connecter() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Testo", "root", "");
            return con;
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
        
        
    
    }
}
    
        
    



