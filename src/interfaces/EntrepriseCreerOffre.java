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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modele.Entreprise;
import net.proteanit.sql.DbUtils;
import static modele.Entreprise.nomEntreprise;

/**
 *
 * @author Bilal
 */
public class EntrepriseCreerOffre extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pr = null;
    ResultSet rs = null;
    String name;

    /**
     * Creates new form CreationOffre
     */
    public EntrepriseCreerOffre(){
        con= Connecter.Connecter();
        initComponents();
        txt_Nom_Id_Entreprise.setText(Entreprise.nomEntreprise); 
        updateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        comboDomaine = new javax.swing.JComboBox();
        txtDateOffre = new javax.swing.JTextField();
        txtCheminStockage = new javax.swing.JTextField();
        txtLibelle = new javax.swing.JTextField();
        txtDureeOffre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescriptionOffre = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txt_Nom_Id_Entreprise = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        jTextField3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SAISIE D'UNE OFFRE DE STAGE");

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
        jLabel7.setText("Chemin de stockage de l'offre de stage");

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

        comboDomaine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Développement", "Réseaux", "Objets connectés", "Big Data", "Management", "Comptabilité", "E-Marketing", "Data Analyse", " " }));

        txtLibelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibelleActionPerformed(evt);
            }
        });

        txtDescriptionOffre.setColumns(20);
        txtDescriptionOffre.setRows(5);
        jScrollPane1.setViewportView(txtDescriptionOffre);

        txt_Nom_Id_Entreprise.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel11.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Candidatures reçues");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Nom_Id_Entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLibelle)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(31, 31, 31)
                                        .addComponent(txtCheminStockage))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDateOffre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDureeOffre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(boutonEnvoyerOffre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boutonAnnulerOffre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 344, 344))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(txt_Nom_Id_Entreprise))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLibelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boutonEnvoyerOffre, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(boutonAnnulerOffre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void setAll(){
         txtLibelle.setText("");
         txtDescriptionOffre.setText("");
         txtDateOffre.setText("");
         txtDureeOffre.setText("");
         txtCheminStockage.setText("");    
}
    
    private void boutonEnvoyerOffreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonEnvoyerOffreActionPerformed
          // teste de verification des champs sont tous remplis
        if(      txtLibelle.getText().equals("")||
            txtDescriptionOffre.getText().equals("")||
            txtDateOffre.getText().equals("")||
            txtDureeOffre.getText().equals("")||
            txtCheminStockage.getText().equals("")){
    JOptionPane.showMessageDialog(null, "verifiez les champs !!!");
    }else{
           
        try {
            String sql = "INSERT INTO offre "
                    + "(libelle_offre,"//1
                    + "description_offre,"//2
                    + "domaine_offre,"//3
                    + "date_debut_offre,"//4
                    + "duree_offre,"//5
                    + "chemin_offre,"//6
                    + "nom_entreprise,"//7
                    + "email_entreprise,"//8
                    + "adresse_ville_entreprise)"//9
                    + "VALUES(?,?,?,?,?,?,?,?,?)";

            pr = con.prepareStatement(sql);

            pr.setString(1, txtLibelle.getText());
            pr.setString(2, txtDescriptionOffre.getText());
            pr.setString(3, comboDomaine.getSelectedItem().toString());
            pr.setString(4, txtDateOffre.getText());
            pr.setString(5, txtDureeOffre.getText());
            pr.setString(6, txtCheminStockage.getText());
            pr.setString(7, Entreprise.nomEntreprise);
            pr.setString(8, Entreprise.email);
            pr.setString(9, Entreprise.adVille);
            pr.executeUpdate();

            JOptionPane.showMessageDialog(null, "L'offre a été ajoutée avec succès !");

            setAll();
            pr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}


    }//GEN-LAST:event_boutonEnvoyerOffreActionPerformed

    public void updateTable(){
//        String sql= "SELECT nom_etudiant,prenom_etudiant,niveau_etude,email_etudiant"
//                        + " FROM etudiant e JOIN candidature c WHERE e.id_etudiant = c.id_etudiant AND nom_entreprise="+name;
        try {
            String sql= "SELECT nom_etudiant,prenom_etudiant,niveau_etude,email_etudiant"
                        + " FROM etudiant e JOIN candidature c WHERE e.id_etudiant = c.id_etudiant"
                        + " AND c.nom_entreprise="+"'"+Entreprise.nomEntreprise+"'";

            pr = con.prepareStatement(sql);
             rs = pr.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(EntrepriseCreerOffre.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }
    private void txtLibelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibelleActionPerformed

    private void boutonAnnulerOffreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAnnulerOffreActionPerformed
        this.setVisible(false);
        new Accueil().setVisible(true);
    }//GEN-LAST:event_boutonAnnulerOffreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           new EntrepriseCreerOffre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAnnulerOffre;
    private javax.swing.JButton boutonEnvoyerOffre;
    private javax.swing.JComboBox comboDomaine;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtCheminStockage;
    private javax.swing.JTextField txtDateOffre;
    private javax.swing.JTextArea txtDescriptionOffre;
    private javax.swing.JTextField txtDureeOffre;
    private javax.swing.JTextField txtLibelle;
    private javax.swing.JLabel txt_Nom_Id_Entreprise;
    // End of variables declaration//GEN-END:variables
}
