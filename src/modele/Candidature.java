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
public class Candidature {
    private int id_offre;
    private int id_etudiant;
    private String nom_entreprise ;

    public Candidature(int id_offre, int id_etudiant, String nom_entreprise) {
        this.id_offre = id_offre;
        this.id_etudiant = id_etudiant;
        this.nom_entreprise = nom_entreprise;
    }

    public int getId_offre() {
        return id_offre;
    }

    public int getId_etudiant() {
        return id_etudiant;
    }

    public String getNom_entreprise() {
        return nom_entreprise;
    }
    
}
