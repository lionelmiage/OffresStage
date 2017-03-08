/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Bilal
 */
public class OffreStage {

    private String libelleOffre;
    private String descriptifOffre;
    private String domaineOffre;
    private SimpleDateFormat débutOffre;
    private String dureeOffre;
    private boolean valide;

    public OffreStage() {

    }

    public OffreStage(String libelleOffre, String descriptifOffre, String domaineOffre,String dureeOffre, boolean valide) {
        this.libelleOffre = libelleOffre;
        this.descriptifOffre = descriptifOffre;
        this.domaineOffre = domaineOffre;
        this.dureeOffre = dureeOffre;
        this.débutOffre = new SimpleDateFormat("dd/mm/yy hh:mm");
        this.valide = false;
    }

    public String getLibelleOffre() {
        return libelleOffre;
    }

    public void setLibelleOffre(String libelleOffre) {
        this.libelleOffre = libelleOffre;
    }

    public String getDescriptifOffre() {
        return descriptifOffre;
    }

    public void setDescriptifOffre(String descriptifOffre) {
        this.descriptifOffre = descriptifOffre;
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

    public boolean isValide() {
        return valide;
    }

    public void setValide(boolean valide) {
        this.valide = valide;
    }

    @Override
    public String toString() {
        return "\n"+"- libelle de l'offre :"+libelleOffre + "\n"+"- descricrption de l'offre :"+descriptifOffre+ "\n"+"- domaine de l'offre : "
                + domaineOffre +"\n"+"- début de l'offre: " +débutOffre.format(new Date())+"\n"+ "- durée de l'offre :"
                + dureeOffre+" "+"\n"+"- valide :"+ valide;
    }

}
