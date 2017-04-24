package interfaces;

import bdd.Connecter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.JOptionPane;
import modele.Admin;
import modele.Entreprise;
import modele.OffreStage;
import modele.Etudiant;


public class Accueil extends javax.swing.JFrame {

    Connection con;
    ResultSet rs = null;
    PreparedStatement pr = null;
    
    public Accueil() {
        con = Connecter.Connecter();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdentifiant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        boutonEtudiant = new javax.swing.JButton();
        boutonEntreprise = new javax.swing.JButton();
        bouton_valider = new javax.swing.JButton();
        choixUtilisateur = new javax.swing.JComboBox();
        txtMdp = new javax.swing.JPasswordField();

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

        jPanel1.setBackground(new java.awt.Color(51, 255, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Bonjour, veuillez vous connecter");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 30, 460, 32);

        jLabel2.setText("Identifiant");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 130, 71, 17);

        jLabel3.setText("Mot de passe");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 170, 92, 17);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setText("Créer un compte");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 300, 240, 30);
        jPanel1.add(txtIdentifiant);
        txtIdentifiant.setBounds(150, 120, 290, 27);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-60, 190, 100, 30);

        boutonEtudiant.setText("Etudiant");
        boutonEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonEtudiantActionPerformed(evt);
            }
        });
        jPanel1.add(boutonEtudiant);
        boutonEtudiant.setBounds(310, 340, 100, 29);

        boutonEntreprise.setText("Entreprise");
        boutonEntreprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonEntrepriseActionPerformed(evt);
            }
        });
        jPanel1.add(boutonEntreprise);
        boutonEntreprise.setBounds(190, 340, 100, 29);

        bouton_valider.setText("Valider");
        bouton_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_validerActionPerformed(evt);
            }
        });
        jPanel1.add(bouton_valider);
        bouton_valider.setBounds(360, 220, 80, 30);

        choixUtilisateur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Etudiant", "Entreprise", "Admin" }));
        choixUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixUtilisateurActionPerformed(evt);
            }
        });
        jPanel1.add(choixUtilisateur);
        choixUtilisateur.setBounds(150, 220, 150, 30);

        txtMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMdpActionPerformed(evt);
            }
        });
        jPanel1.add(txtMdp);
        txtMdp.setBounds(150, 160, 290, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boutonEntrepriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonEntrepriseActionPerformed
        new CreerEntreprise().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_boutonEntrepriseActionPerformed

    private void boutonEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonEtudiantActionPerformed
       new CreerEtudiant().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_boutonEtudiantActionPerformed

    private void bouton_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_validerActionPerformed

        String choix = choixUtilisateur.getSelectedItem().toString();
        
        
        if ("Etudiant".equals(choix)){
            choix = "etudiant";
        }else if ("Admin".equals(choix)){
            choix = "admin";
        }else if ("Entreprise".equals(choix)){
            choix = "entreprise";
        }
        
        
        
//        String id = txtIdentifiant.getText();
//        String motdepasse = txtMdp.getText();
        boolean drap = false;

        try {
            String sql = "SELECT * FROM " + choix;


            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            
           
            while (rs.next()) {
              

                if (("admin".equals(choix)) && (rs.getString("email_admin").equals(txtIdentifiant.getText())
                                && rs.getString("mdp_admin").equals(txtMdp.getText()))) {
                    String id_admin = rs.getString("email_admin");
                    Admin.id_admin = id_admin;
                    
                    JOptionPane.showMessageDialog(null, "Vous êtes connecté");
                    
                     new GestionDesOffres().setVisible(true);
                    this.setVisible(false);
                    
                    break;

                } else if (("etudiant".equals(choix)) && (rs.getString("email_etudiant").equals(txtIdentifiant.getText()) 
                                && rs.getString("mdp_etudiant").equals(txtMdp.getText()))) {
                    
                   int id_etudiant = rs.getInt("id_etudiant");
                    Etudiant.id_etudiant = id_etudiant;
                    
                    JOptionPane.showMessageDialog(null, "Vous êtes connecté");
                    
                    new ConsulterOffreEtudiant().setVisible(true);
                    this.setVisible(false);
                    
                    break;
                } else if (("entreprise".equals(choix)) && (rs.getString("email_entreprise").equals(txtIdentifiant.getText())
                                && rs.getString("mdp_entreprise").equals(txtMdp.getText()))) {
                   
                    String id_entreprise = rs.getString("email_entreprise");
                    Entreprise.email = id_entreprise;
                    
                    JOptionPane.showMessageDialog(null, "Vous êtes connecté");
                    
                    new EntrepriseCreerOffre().setVisible(true);
                    new EntrepriseCreerOffre().setVisible(true);
                    this.setVisible(false);
                    
                    break;
                } else {

                    drap = true;
                }

            }

            if (drap) {
                JOptionPane.showMessageDialog(null, "login ou mdp incorrect :");
            }

        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "login ou mdp incorrect :" + e);
        }

    }//GEN-LAST:event_bouton_validerActionPerformed

    private void choixUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choixUtilisateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choixUtilisateurActionPerformed

    private void txtMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMdpActionPerformed

    public static void main(String[] args) {

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Accueil().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonEntreprise;
    private javax.swing.JButton boutonEtudiant;
    private javax.swing.JButton bouton_valider;
    private javax.swing.JComboBox choixUtilisateur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtIdentifiant;
    private javax.swing.JPasswordField txtMdp;
    // End of variables declaration//GEN-END:variables
}
