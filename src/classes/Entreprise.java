/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Bilal
 */
public class Entreprise {

    private List<OffreStage> lesOffres = new LinkedList<OffreStage>();
    private String nomEntreprise;
    private String adVille;
    private String adRue;
    private String CodePostal;
    private String tel;
    private String email;
    private String secteur;

    public Entreprise() {

    }

    public Entreprise(String nomEntreprise, String adVille, String adRue, String CodePostal, String tel, String email, String secteur) {
        this.nomEntreprise = nomEntreprise;
        this.adVille = adVille;
        this.adRue = adRue;
        this.CodePostal = CodePostal;
        this.tel = tel;
        this.email = email;
        this.secteur = secteur;
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
        return   "\n"+ " nom de l'Entreprise :" + 
                nomEntreprise +"\n"+  "- Ville :" + adVille +"\n"+ "- Rue : " + adRue +"\n"+ "- Code postal :" + 
                CodePostal +"\n"+ "- Tel :" + tel +"\n"+ "- Email : " + email +"\n"+ "- Secteur :" + secteur ;
    }

}
