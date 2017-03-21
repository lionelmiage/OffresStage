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
    PreparedStatement  pstmt;

    public Connecter() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.err.println(e);
//afficher l'erreur
        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/offreStage", "root", "root");

        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    Connection obtenirConnexion() {
        return con;
    }

}
