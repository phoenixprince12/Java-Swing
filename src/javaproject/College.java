package javaproject;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The Phoenix
 */
public class College extends javax.swing.JFrame {
    UserIdentification user;
    Intermediary inter;
    
    public College(Intermediary inter) {
        initComponents();
        this.inter = inter;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        collegeviews = new javax.swing.JButton();
        updatecollege = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        collegeviews.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        collegeviews.setText("View Colleges");
        collegeviews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegeviewsActionPerformed(evt);
            }
        });
        getContentPane().add(collegeviews);
        collegeviews.setBounds(101, 65, 230, 40);

        updatecollege.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        updatecollege.setText("Update Colleges");
        updatecollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatecollegeActionPerformed(evt);
            }
        });
        getContentPane().add(updatecollege);
        updatecollege.setBounds(101, 141, 230, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Know The Best");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 0, 178, 29);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 210, 160, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatecollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatecollegeActionPerformed
        
        CollegeInformation j= new CollegeInformation();
                   j.setVisible(true);
    }//GEN-LAST:event_updatecollegeActionPerformed

    private void collegeviewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collegeviewsActionPerformed
        StringBuilder sb =new StringBuilder();
        
        sb.append(String.format("%d colleges details inserted", inter.collid.size()));
        sb.append("\n");
        
        for(int i=0;i<inter.names.size();i++){
            
            sb.append(" New List inserted : ").append(String.format("%s, %s  ",inter.names.get(i), inter.naac.get(i)));
            sb.append("\n");
        
            
        }
        
        for(int i=0;i<inter.collid.size();i++){
           
            sb.append("List Inserted : ").append(String.format("%s, %s  ",inter.collid.get(i), inter.city.get(i)));
            sb.append("\n");
        }
        

        
       Coup j= new Coup();
                   j.setVisible(true);
        
        
        
      writeFile(sb.toString());
        
    }//GEN-LAST:event_collegeviewsActionPerformed
    
    public static void writeFile(String arrayValues) {
        try {
            File file = new File("output.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(arrayValues);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            System.err.println(e.toString());

        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        UserIdentification id = new UserIdentification(inter);
        this.setVisible(false);
        id.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton collegeviews;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton updatecollege;
    // End of variables declaration//GEN-END:variables
}
