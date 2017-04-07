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
public class Etudiant {
    public static int id_etudiant;
    public static String nom_etudiant;
    public static String prenom_etudiant;
    public static String date_de_naissance;
    public static String niveau_etude;
    public static String email_etudiant;
    public static String mdp_etudiant;

    public Etudiant() {
        
    }
    
    
    

    public static int getId_etudiant() {
        return id_etudiant;
    }

    public static void setId_etudiant(int id_etudiant) {
        Etudiant.id_etudiant = id_etudiant;
    }

    public static String getNom_etudiant() {
        return nom_etudiant;
    }

    public static void setNom_etudiant(String nom_etudiant) {
        Etudiant.nom_etudiant = nom_etudiant;
    }

    public static String getPrenom_etudiant() {
        return prenom_etudiant;
    }

    public static void setPrenom_etudiant(String prenom_etudiant) {
        Etudiant.prenom_etudiant = prenom_etudiant;
    }

    public static String getDate_de_naissance() {
        return date_de_naissance;
    }

    public static void setDate_de_naissance(String date_de_naissance) {
        Etudiant.date_de_naissance = date_de_naissance;
    }

    public static String getNiveau_etude() {
        return niveau_etude;
    }

    public static void setNiveau_etude(String niveau_etude) {
        Etudiant.niveau_etude = niveau_etude;
    }

    public static String getEmail_etudiant() {
        return email_etudiant;
    }

    public static void setEmail_etudiant(String email_etudiant) {
        Etudiant.email_etudiant = email_etudiant;
    }

    public static String getMdp_etudiant() {
        return mdp_etudiant;
    }

    public static void setMdp_etudiant(String mdp_etudiant) {
        Etudiant.mdp_etudiant = mdp_etudiant;
    }
    
   
}