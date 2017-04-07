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

    public static String nomEntreprise;
    public static String adVille;
    public static String adRue;
    public static String CodePostal;
    public static String tel;
    public static String email;
    public static String secteur;

    public Entreprise() {

    }

    public Entreprise( String nomEntreprise, String adVille, String adRue, String CodePostal, String tel, String email, String secteur) {
       
        Entreprise.nomEntreprise = nomEntreprise;
        Entreprise.adVille = adVille;
        Entreprise.adRue = adRue;
        Entreprise.CodePostal = CodePostal;
        Entreprise.tel = tel;
        Entreprise.email = email;
        Entreprise.secteur = secteur;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Entreprise.email = email;
    }

    public void setNomEntreprise(String nomEntreprise) {
        Entreprise.nomEntreprise = nomEntreprise;
    }

    public String getAdVille() {
        return adVille;
    }

    public void setAdVille(String adVille) {
        Entreprise.adVille = adVille;
    }

    public String getAdRue() {
        return adRue;
    }

    public void setAdRue(String adRue) {
        Entreprise.adRue = adRue;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(String CodePostal) {
        Entreprise.CodePostal = CodePostal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        Entreprise.tel = tel;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        Entreprise.secteur = secteur;
    }

    @Override
    public String toString() {
        return "\n" + " nom de l'Entreprise :"
                + nomEntreprise + "\n" + "- Ville :" + adVille + "\n" + "- Rue : " + adRue + "\n" + "- Code postal :"
                + CodePostal + "\n" + "- Tel :" + tel + "\n" + "- Email : " + email + "\n" + "- Secteur :" + secteur;
    }

}
