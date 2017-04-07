/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Bilal
 */
public class OffreStage {

    private int id_offre;
    private String libelleOffre;
    private String descriptionOffre;
    private String domaineOffre;
    private String debutOffre;
    private String dureeOffre;
    private String chemin_offre;
    private int valide;
   // private int id_entreprise;
    private String nom_entreprise;
    private  String email_entreprise;
    private  String ville_entreprise;

    public OffreStage() {

    }

    public OffreStage(int id_offre, String libelleOffre, String descriptionOffre,
            String domaineOffre, String debutOffre, String dureeOffre, String cheminOffre, int valide,
             String nom_entreprise, String email_entreprise, String ville_entreprise) {
        this.id_offre = id_offre;
        this.libelleOffre = libelleOffre;
        this.descriptionOffre = descriptionOffre;
        this.domaineOffre = domaineOffre;
        this.debutOffre = debutOffre;
        this.dureeOffre = dureeOffre;
        this.chemin_offre = cheminOffre;
        this.valide = 0;
        //this.id_entreprise = id_entreprise;
        this.nom_entreprise = nom_entreprise;
        this.email_entreprise = email_entreprise;
        this.ville_entreprise = ville_entreprise;

    }
    public OffreStage(String nom_entreprise,String villle_stage, String email){//deuxieme constructeur pour recuperer nom entreprise vill et email
    this.nom_entreprise = nom_entreprise;
    this.ville_entreprise = villle_stage;
    this.email_entreprise = email;
    
    }

    public String getChemin_offre() {
        return chemin_offre;
    }

    public void setChemin_offre(String chemin_offre) {

        this.chemin_offre = chemin_offre;
    }

    public int getId_offre() {
        return id_offre;
    }

    public String getDebutOffre() {
        return debutOffre;
    }

    public void setDebutOffre(String débutOffre) {
        this.debutOffre = débutOffre;
    }

    public String getNom_entreprise() {
        return nom_entreprise;
    }

    public void setNom_entreprise(String nom_entreprise) {
        this.nom_entreprise = nom_entreprise;
    }

    public String getContact_entreprise() {
        return email_entreprise;
    }

    public void setContact_entreprise(String contact_entreprise) {
        this.email_entreprise = contact_entreprise;
    }

    public String getVille_entreprise() {
        return ville_entreprise;
    }

    public void setVille_entreprise(String ville_entreprise) {
        this.ville_entreprise = ville_entreprise;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public String getLibelleOffre() {
        return libelleOffre;
    }

    public void setLibelleOffre(String libelleOffre) {
        this.libelleOffre = libelleOffre;
    }

    public String getDescriptionOffre() {
        return descriptionOffre;
    }

    public void setDescriptifOffre(String descriptifOffre) {
        this.descriptionOffre = descriptifOffre;
    }

    public String getDomaineOffre() {
        return domaineOffre;
    }

    public void setDomaineOffre(String domaineOffre) {
        this.domaineOffre = domaineOffre;
    }

    public String getDureeOffre() {
        return dureeOffre;
    }

    public void setDureeOffre(String dureeOffre) {
        this.dureeOffre = dureeOffre;
    }

    public int isValide() {
        return valide;
    }

    public void setValide(int valide) {
        this.valide = valide;
    }

    @Override
    public String toString() {
        return "\n" + "- libelle de l'offre :" + libelleOffre + "\n" + "- descricrption de l'offre :" + descriptionOffre + "\n" + "- domaine de l'offre : "
                + domaineOffre + "\n" + "- début de l'offre: " + debutOffre + "\n" + "- durée de l'offre :"
                + dureeOffre + " " + "\n" + "- valide :" + valide;
    }

}
//débutOffre.format(new Date())
