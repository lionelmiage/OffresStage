/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bdd.Connecter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modele.Entreprise;
import static modele.Entreprise.adVille;
import static modele.Entreprise.email;
import static modele.Entreprise.nomEntreprise;
import modele.OffreStage;


public class AdminCreerOffre extends javax.swing.JFrame {
    Connection con = null;       // variable connexion
    PreparedStatement pr = null;    // preparateur de la requete SQL 
    ResultSet rs = null;             //  variable ou on stock les resultats 
                

    public AdminCreerOffre() { // construvteur 
        con = Connecter.Connecter();    // la connexion
        initComponents();
        lesEntreprises();    // 
    }

    public void listeOffre() {
        try {
            String sql = "SELECT * FROM Offre";
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();

            while (rs.next()) {
                
                String nom_entr =rs.getString("nom_entreprise");
                 String ville = rs.getString("adresse_ville_entreprise");
               String email =  rs.getString("email_entreprise");
            }

        } catch (Exception e) {
        }
    }

    public void montrerEntreprise(int index) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boutonEnvoyerOffre = new javax.swing.JButton();
        boutonAnnulerOffre = new javax.swing.JButton();
        comboAdmin = new javax.swing.JComboBox();
        comboDomaine = new javax.swing.JComboBox();
        txtDateOffre = new javax.swing.JTextField();
        txtCheminStockage = new javax.swing.JTextField();
        txtLibelle = new javax.swing.JTextField();
        txtDureeOffre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescriptionOffre = new javax.swing.JTextArea();

        jTextField3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREER UNE OFFRE");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nom de l'entreprise");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Libellé de l'offre");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Domaine de l'offre");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Description de l'offre");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Durée");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Chemin de staockage de l'offre de stage");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date de début su stage");

        boutonEnvoyerOffre.setText("Envoyer");
        boutonEnvoyerOffre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonEnvoyerOffreActionPerformed(evt);
            }
        });

        boutonAnnulerOffre.setText("Annuler");
        boutonAnnulerOffre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAnnulerOffreActionPerformed(evt);
            }
        });

        comboAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAdminActionPerformed(evt);
            }
        });

        comboDomaine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Développement", "Réseaux", "Objets connectés", "Big Data", "Management", "Comptabilité", "E-Marketing", "Data Analyse", " " }));

        txtLibelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibelleActionPerformed(evt);
            }
        });

        txtDescriptionOffre.setColumns(20);
        txtDescriptionOffre.setRows(5);
        jScrollPane1.setViewportView(txtDescriptionOffre);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtCheminStockage, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(boutonEnvoyerOffre)
                                .addGap(97, 97, 97)
                                .addComponent(boutonAnnulerOffre))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDateOffre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDureeOffre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(29, 29, 29)
                                    .addComponent(txtLibelle, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLibelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDateOffre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDureeOffre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCheminStockage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonEnvoyerOffre)
                    .addComponent(boutonAnnulerOffre))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAdminActionPerformed

    }//GEN-LAST:event_comboAdminActionPerformed

    private void boutonEnvoyerOffreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonEnvoyerOffreActionPerformed

        try {
            int index = 0;
            String email = lesEntreprises().get(index).getEmail();

            String ville = lesEntreprises().get(index).getAdVille();

            String sql = "INSERT INTO Offre "
                    + "(libelle_offre,"//1
                    + "description_offre,"//2
                    + "domaine_offre,"//3
                    + "date_debut_offre,"//4
                    + "duree_offre,"//5
                    + "chemin_offre,"//6
                    + "nom_entreprise,"//7
                    + "email_entreprise,"//8
                    + "adresse_ville_entreprise)"//9
                    + " VALUES(?,?,?,?,?,?,?,?,?)";

            pr = con.prepareStatement(sql);

            pr.setString(1, txtLibelle.getText());
            pr.setString(2, txtDescriptionOffre.getText());
            pr.setString(3, comboDomaine.getSelectedItem().toString());
            pr.setString(4, txtDateOffre.getText());
            pr.setString(5, txtDureeOffre.getText());
            pr.setString(6, txtCheminStockage.getText());
            String nom = comboAdmin.getSelectedItem().toString();
            pr.setString(7, nom);
            pr.setString(8, email);
            pr.setString(9, ville);
            pr.executeUpdate();

            JOptionPane.showMessageDialog(null, "L'offre a été ajoutée avec succès !");
              this.setVisible(false);
              new GestionDesOffres().setVisible(true);
            pr.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        

    }//GEN-LAST:event_boutonEnvoyerOffreActionPerformed

    private void txtLibelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibelleActionPerformed

    private void boutonAnnulerOffreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAnnulerOffreActionPerformed
        this.setVisible(false);
        new GestionDesOffres().setVisible(true);
    }//GEN-LAST:event_boutonAnnulerOffreActionPerformed

    public List<Entreprise> lesEntreprises() {

        try {

            String sql = "select * FROM Entreprise";
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            List<Entreprise> lesEntreprises = new ArrayList<Entreprise>();
            Entreprise e;
            while (rs.next()) {

                e = new Entreprise(
                                                        
                        rs.getString("nom_entreprise"),
                        rs.getString("adresse_ville_entreprise"),
                        rs.getString("adresse_rue_entreprise"),
                        rs.getString("adresse_code_postal_entreprise"),
                        rs.getString("tel_entreprise"),
                        rs.getString("email_entreprise"),
                        rs.getString("secteur_activite"));

                lesEntreprises.add(e);

                String nom = rs.getString("nom_entreprise");
                // nom de la combo
                comboAdmin.addItem(nom);

            }
            return lesEntreprises;

        } catch (Exception e) {
            return null;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCreerOffre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAnnulerOffre;
    private javax.swing.JButton boutonEnvoyerOffre;
    private javax.swing.JComboBox comboAdmin;
    private javax.swing.JComboBox comboDomaine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtCheminStockage;
    private javax.swing.JTextField txtDateOffre;
    private javax.swing.JTextArea txtDescriptionOffre;
    private javax.swing.JTextField txtDureeOffre;
    private javax.swing.JTextField txtLibelle;
    // End of variables declaration//GEN-END:variables
}
