/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Bilal
 */
public class Admin {
    public static String id_admin;
    public static String mdp_admin;
    public static boolean isAdmin = false;

    public Admin() {
    }

    public static String getId_admin() {
        return id_admin;
    }

    public static void setId_admin(String id_admin) {
        Admin.id_admin = id_admin;
    }

    public static String getMdp_admin() {
        return mdp_admin;
    }

    public static void setMdp_admin(String mdp_admin) {
        Admin.mdp_admin = mdp_admin;
    }
    
}
