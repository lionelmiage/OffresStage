/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Bilal
 */
public class Entreprise {

    public static List<OffreStage> lesOffres = new LinkedList<OffreStage>();
    public static String id;
    public static String nomEntreprise;
    public static String adVille;
    public static String adRue;
    public static String CodePostal;
    public static String tel;
    public static String email;
    public static String secteur;

    public Entreprise() {

    }

    public Entreprise(String id,String nomEntreprise, String adVille, String adRue, String CodePostal, String tel, String email, String secteur) {
        this.id =id;
        this.nomEntreprise = nomEntreprise;
        this.adVille = adVille;
        this.adRue = adRue;
        this.CodePostal = CodePostal;
        this.tel = tel;
        this.email = email;
        this.secteur = secteur;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Entreprise.id = id;
    }
    

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getAdVille() {
        return adVille;
    }

    public void setAdVille(String adVille) {
        this.adVille = adVille;
    }

    public String getAdRue() {
        return adRue;
    }

    public void setAdRue(String adRue) {
        this.adRue = adRue;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(String CodePostal) {
        this.CodePostal = CodePostal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    @Override
    public String toString() {
        return "\n" + " nom de l'Entreprise :"
                + nomEntreprise + "\n" + "- Ville :" + adVille + "\n" + "- Rue : " + adRue + "\n" + "- Code postal :"
                + CodePostal + "\n" + "- Tel :" + tel + "\n" + "- Email : " + email + "\n" + "- Secteur :" + secteur;
    }

}
