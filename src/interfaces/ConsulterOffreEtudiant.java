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
import modele.Candidature;
import modele.Etudiant;
import modele.OffreEtudiant;
import static modele.Etudiant.id_etudiant;

/**
 *
 * @author Bilal
 */
public class ConsulterOffreEtudiant extends javax.swing.JFrame {
    // les variable pour etablire la connexion et la preparation des requetes SQL
    Connection con = null;
    PreparedStatement pr = null;
    ResultSet rs = null;
    Statement st = null;
    int pos = 0; 

    /**
     * Creates new form ConsulterOffre
     */
    public ConsulterOffreEtudiant() {
        con = Connecter.Connecter();
        initComponents();
        montrerOffres(pos);
  
    }
     
        public List<OffreEtudiant> lesOffres() {

        try {

            String sql = "select * FROM offre";
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            List<OffreEtudiant> lesOffres = new ArrayList<OffreEtudiant>();
            OffreEtudiant o;
            while (rs.next()) {
                
                o = new OffreEtudiant(
                        rs.getInt("id_offre"),
                        rs.getString("libelle_offre"),
                        rs.getString("description_offre"),
                        rs.getString("domaine_offre"),
                        rs.getString("date_debut_offre"),
                        rs.getString("duree_offre"),
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
        // affichage des offres
         public void montrerOffres(int index) {
        
                consultationLibelle.setText(lesOffres().get(index).getLibelleOffre());
                Descriptif.setText(lesOffres().get(index).getDescriptionOffre());
                consultationDomaine.setText(lesOffres().get(index).getDomaineOffre());
                consultationDateDebut.setText(lesOffres().get(index).getDebutOffre());
                consultationDuree.setText(lesOffres().get(index).getDureeOffre());
                consultationNomEntr.setText(lesOffres().get(index).getNom_entreprise());
                consultationMail.setText(lesOffres().get(index).getContact_entreprise());
                consultationVille.setText(lesOffres().get(index).getVille_entreprise());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        consultationVille = new javax.swing.JTextField();
        consultationNomEntr = new javax.swing.JTextField();
        consultationMail = new javax.swing.JTextField();
        consultationDomaine = new javax.swing.JTextField();
        consultationLibelle = new javax.swing.JTextField();
        consultationDateDebut = new javax.swing.JTextField();
        consultationDuree = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descriptif = new javax.swing.JTextArea();
        boutonPostuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(607, 364));
        jPanel1.setPreferredSize(new java.awt.Dimension(607, 364));

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

        jLabel9.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("OFFRES DE STAGE DISPONIBLES");

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

        consultationNomEntr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultationNomEntrActionPerformed(evt);
            }
        });

        Descriptif.setColumns(20);
        Descriptif.setRows(5);
        jScrollPane1.setViewportView(Descriptif);

        boutonPostuler.setText("Postuler");
        boutonPostuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonPostulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(consultationNomEntr))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(consultationMail)))
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(consultationVille, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(consultationDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(consultationLibelle)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(consultationDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(consultationDuree, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(boutonPrecedent)
                                .addGap(18, 18, 18)
                                .addComponent(boutonSuivant)
                                .addGap(18, 18, 18)
                                .addComponent(boutonFermer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boutonPostuler)))
                        .addContainerGap(64, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(186, 186, 186))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(consultationVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultationNomEntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(consultationMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultationDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(consultationLibelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(consultationDuree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultationDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boutonPostuler)
                            .addComponent(boutonFermer)
                            .addComponent(boutonSuivant)
                            .addComponent(boutonPrecedent))
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 358, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consultationNomEntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultationNomEntrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultationNomEntrActionPerformed

    private void boutonPostulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonPostulerActionPerformed
         int v =lesOffres().get(pos).getId_offre();
        try {
            
            String sql= "INSERT INTO candidature "
                   
                    + "(id_offre, "
                    + "id_etudiant, "
                    + "nom_entreprise)" 
                    + "VALUES(?,?,?)";
          
            pr = con.prepareStatement(sql);
            
            pr.setInt(1, v);
            pr.setInt(2, Etudiant.id_etudiant);
            pr.setString(3, consultationNomEntr.getText());
           
            pr.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "candidature réussie !!");
            //afficher l'offre suivant
            pos++;
            montrerOffres(pos);

          } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);  
        }
    }//GEN-LAST:event_boutonPostulerActionPerformed

    private void boutonFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonFermerActionPerformed
        this.setVisible(false);
         new Accueil().setVisible(true);
    }//GEN-LAST:event_boutonFermerActionPerformed

    private void boutonPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonPrecedentActionPerformed
        pos--;
        if (pos < 0) {

            pos = 0;
        }
        montrerOffres(pos);
    }//GEN-LAST:event_boutonPrecedentActionPerformed

    private void boutonSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonSuivantActionPerformed
     pos++;
        if (pos >= lesOffres().size()) {

            pos = lesOffres().size() - 1;
        }
        montrerOffres(pos);
    }//GEN-LAST:event_boutonSuivantActionPerformed

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
            java.util.logging.Logger.getLogger(ConsulterOffreEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulterOffreEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulterOffreEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulterOffreEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterOffreEtudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Descriptif;
    private javax.swing.JButton boutonFermer;
    private javax.swing.JButton boutonPostuler;
    private javax.swing.JButton boutonPrecedent;
    private javax.swing.JButton boutonSuivant;
    private javax.swing.JTextField consultationDateDebut;
    private javax.swing.JTextField consultationDomaine;
    private javax.swing.JTextField consultationDuree;
    private javax.swing.JTextField consultationLibelle;
    private javax.swing.JTextField consultationMail;
    private javax.swing.JTextField consultationNomEntr;
    private javax.swing.JTextField consultationVille;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
