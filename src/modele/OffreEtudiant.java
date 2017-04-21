/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author fz
 */
public class OffreEtudiant {
    private int idOffre;
    private String libelleOffre;
    private String descriptionOffre;
    private String domaineOffre;
    private String debutOffre;
    private String dureeOffre;
    //private String chemin_offre;a
    //private int valide;a
   // private int id_entreprise;
    private String nom_entreprise;
    private  String email_entreprise;
    private  String ville_entreprise;
    
    public OffreEtudiant() {

    }

    public OffreEtudiant( int idOffre,String libelleOffre, String descriptionOffre,
            String domaineOffre, String debutOffre, String dureeOffre,  
             String nom_entreprise, String email_entreprise, String ville_entreprise) {
        this.idOffre = idOffre;
        this.libelleOffre = libelleOffre;
        this.descriptionOffre = descriptionOffre;
        this.domaineOffre = domaineOffre;
        this.debutOffre = debutOffre;
        this.dureeOffre = dureeOffre;
        //this.id_entreprise = id_entreprise;
        this.nom_entreprise = nom_entreprise;
        this.email_entreprise = email_entreprise;
        this.ville_entreprise = ville_entreprise;

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

    public int getId_offre() {
       return idOffre; 
    }

    
}
