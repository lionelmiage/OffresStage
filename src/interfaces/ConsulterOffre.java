/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bdd.Connecter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.Position;
import modele.Entreprise;
import static modele.Entreprise.adVille;
import static modele.Entreprise.email;
import static modele.Entreprise.nomEntreprise;
import modele.OffreStage;

/**
 *
 * @author Bilal
 */
public class ConsulterOffre extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pr = null;
    Statement st = null;

    public ConsulterOffre() {
        con = Connecter.Connecter();
        initComponents();
        montrerOffres(pos);

        //txtIdOffre.setText(String.valueOf(OffreStage.id_offre));
        //posotion de l'offre
    }
    int pos = 0;

    public List<OffreStage> lesOffres() {

        try {

            String sql = "select * FROM Offre";
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            List<OffreStage> lesOffres = new ArrayList<OffreStage>();
            OffreStage o;
           // Entreprise e;
            while (rs.next()) {
                
                o = new OffreStage(rs.getInt("id_offre"),
                        rs.getString("libelle_offre"),
                        rs.getString("description_offre"),
                        rs.getString("domaine_offre"),
                        rs.getString("date_debut_offre"),
                        rs.getString("duree_offre"),
                        rs.getString("chemin_offre"),
                        rs.getInt("valide_offre"),
                        rs.getString("nom_entreprise"),
                        rs.getString("email_entreprise"),
                        rs.getString("adresse_ville_entreprise"));
                lesOffres.add(o);

            }
            return lesOffres;

        } catch (Exception e) {
            return null;
        }

    }

    public void montrerOffres(int index) {
        txtIdOffre.setText(Integer.toString(lesOffres().get(index).getId_offre()));
        txtLibelle.setText(lesOffres().get(index).getLibelleOffre());
        txtDescriptif.setText(lesOffres().get(index).getDescriptionOffre());
        txtDomaine.setText(lesOffres().get(index).getDomaineOffre());
        txtDateDebut.setText(lesOffres().get(index).getDebutOffre());
        txtDuree.setText(lesOffres().get(index).getDureeOffre());
        txtCheminStockage.setText(lesOffres().get(index).getChemin_offre());
        txtNomEntr.setText(lesOffres().get(index).getNom_entreprise());
        txtMail.setText(lesOffres().get(index).getContact_entreprise());
        txtVille.setText(lesOffres().get(index).getVille_entreprise());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        boutonFermer = new javax.swing.JButton();
        boutonSuivant = new javax.swing.JButton();
        boutonPrecedent = new javax.swing.JButton();
        txtVille = new javax.swing.JTextField();
        txtNomEntr = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtDomaine = new javax.swing.JTextField();
        txtLibelle = new javax.swing.JTextField();
        txtDateDebut = new javax.swing.JTextField();
        txtDuree = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescriptif = new javax.swing.JTextArea();
        boutonMaj = new javax.swing.JButton();
        boutonSupprimer = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtIdOffre = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCheminStockage = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(639, 385));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nom de l'entreprise");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date de début du stage");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ville du stage");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mail contact");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Domaine offre");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Libellé de l'offre");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descriptif de l'offre");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Durée du stage");

        jLabel9.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CONSULTATION DES OFFRES DE STAGE");

        boutonFermer.setText("Fermer");
        boutonFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonFermerActionPerformed(evt);
            }
        });

        boutonSuivant.setText("Suivant");
        boutonSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonSuivantActionPerformed(evt);
            }
        });

        boutonPrecedent.setText("Précédent");
        boutonPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonPrecedentActionPerformed(evt);
            }
        });

        txtNomEntr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomEntrActionPerformed(evt);
            }
        });

        txtDescriptif.setColumns(20);
        txtDescriptif.setRows(5);
        jScrollPane1.setViewportView(txtDescriptif);

        boutonMaj.setText("Mettre à jour");
        boutonMaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonMajActionPerformed(evt);
            }
        });

        boutonSupprimer.setText("Supprimer");
        boutonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonSupprimerActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Référence :");

        txtIdOffre.setText("jLabel11");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Chemin de stockage ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdOffre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(boutonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boutonMaj, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boutonFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNomEntr))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMail)))
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLibelle))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boutonSuivant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boutonPrecedent, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDuree, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCheminStockage))
                        .addGap(9, 9, 9))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomEntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLibelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txtDuree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCheminStockage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boutonPrecedent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boutonSuivant))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonFermer)
                    .addComponent(boutonMaj)
                    .addComponent(boutonSupprimer)
                    .addComponent(jLabel10)
                    .addComponent(txtIdOffre))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomEntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomEntrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomEntrActionPerformed

    private void boutonFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonFermerActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_boutonFermerActionPerformed

    private void boutonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonSupprimerActionPerformed
        try {
            String id = txtIdOffre.getText().toString();
            String sql = "delete from offre where id_offre =" + id;
            st = con.createStatement();
            st.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "l'offre est supprimée");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur :" + e);

        }
    }//GEN-LAST:event_boutonSupprimerActionPerformed

    private void boutonSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonSuivantActionPerformed

        pos++;
        if (pos >= lesOffres().size()) {

            pos = lesOffres().size() - 1;
        }
        montrerOffres(pos);


    }//GEN-LAST:event_boutonSuivantActionPerformed

    private void boutonPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonPrecedentActionPerformed
        pos--;
        if (pos < 0) {

            pos = 0;
        }
        montrerOffres(pos);


    }//GEN-LAST:event_boutonPrecedentActionPerformed

    private void boutonMajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMajActionPerformed
        try {
            String id = txtIdOffre.getText().toString();
            String sql = "update offre set "
                    + "libelle_offre = '" + txtLibelle.getText()
                    + "',description_offre = '" + txtDescriptif.getText()
                    + "',domaine_offre = '" + txtDomaine.getText()
                    + "', date_debut_offre = '" + txtDateDebut.getText()
                    + "',duree_offre = '" + txtDuree.getText()
                    + "',chemin_offre = '" + txtCheminStockage.getText()
                    + "',nom_entreprise = '" + txtNomEntr.getText()
                    + "',email_entreprise = '" + txtMail.getText()
                    + "' ,adresse_ville_entreprise= '" + txtVille.getText() + " 'where id_offre =" + id;

            st = con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "L'offre est mise à jour");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur : " + e);
        }
    }//GEN-LAST:event_boutonMajActionPerformed
//info de deux tables et navigation entre les offres

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsulterOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulterOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulterOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulterOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterOffre().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonFermer;
    private javax.swing.JButton boutonMaj;
    private javax.swing.JButton boutonPrecedent;
    private javax.swing.JButton boutonSuivant;
    private javax.swing.JButton boutonSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCheminStockage;
    private javax.swing.JTextField txtDateDebut;
    private javax.swing.JTextArea txtDescriptif;
    private javax.swing.JTextField txtDomaine;
    private javax.swing.JTextField txtDuree;
    private javax.swing.JLabel txtIdOffre;
    private javax.swing.JTextField txtLibelle;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNomEntr;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
