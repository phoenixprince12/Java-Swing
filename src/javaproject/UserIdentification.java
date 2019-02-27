package javaproject;


import javaproject.OrgStructure;
import javaproject.School;
import javaproject.College;
import javaproject.Intermediary;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The Phoenix
 */
public class UserIdentification extends javax.swing.JFrame {

    
    Intermediary inter;
    public UserIdentification(Intermediary inter) { 
        initComponents();
        this.inter = inter;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDisplay = new javax.swing.JLabel();
        custButton = new javax.swing.JButton();
        staffButton = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        labelDisplay.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        labelDisplay.setText("Know The Best");
        getContentPane().add(labelDisplay);
        labelDisplay.setBounds(110, 20, 254, 26);

        custButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        custButton.setText("School");
        custButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custButtonActionPerformed(evt);
            }
        });
        getContentPane().add(custButton);
        custButton.setBounds(10, 130, 150, 40);

        staffButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        staffButton.setText("College");
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });
        getContentPane().add(staffButton);
        staffButton.setBounds(230, 130, 150, 40);

        aboutBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aboutBtn.setText("Carrer Counsellor");
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aboutBtn);
        aboutBtn.setBounds(130, 220, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 380));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 380));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 380));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custButtonActionPerformed
      School custService = new School(inter);
      
        this.setVisible(false);
        custService.setVisible(true);
            
    }//GEN-LAST:event_custButtonActionPerformed

    private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffButtonActionPerformed
        
        College staffService = new College(inter);
        
        this.setVisible(false);
        staffService.setVisible(true);
    }//GEN-LAST:event_staffButtonActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        
        counsellor j= new counsellor();
                   j.setVisible(true);
            
    }//GEN-LAST:event_aboutBtnActionPerformed
    public void displayOrg(){
        OrgStructure<String> royalStarOrgChart = new OrgStructure<>("Mr. Prajwal Singh Chauhan, City:- Guna, Contact No. :- 9754312568");
        OrgStructure<String> foodManager = new OrgStructure<>("Mr. Prince Singh, City:- Sidhi, Contact No.:- 99992222716 ");
        OrgStructure<String> hsechef = new OrgStructure<>("Mr. Prakalp Pandey, City:- Delhi, Contact No.:- 99992222715");
        OrgStructure<String> restManager = new OrgStructure<>("Mr. Dadu Paliwal, City:- Hyderabad, Contact No.:- 99992222714");
        
        OrgStructure<String> hsemanager = new OrgStructure<>("Mr. Nikhil Gupta, City:- Mumbai, Contact No.:- 99992222713");
        OrgStructure<String> hreception = new OrgStructure<>("Mr. Priyank Gupta, City:- Chennai, Contact No.:- 99992222712");
        OrgStructure<String> hsekeeper = new OrgStructure<>("Mr. Abhu Shree Shrivastav, City:- Visakhapatnam, Contact No.:- 99992222711");
                
        royalStarOrgChart.setSubTrees(foodManager, hsemanager);
        hsemanager.setSubTrees(hreception, hsekeeper);
        foodManager.setSubTrees(hsechef, restManager);
        
        
        
        System.out.println("Here's the list of various Career Counsellor and their contacts :");
        royalStarOrgChart.drawTree();
        System.out.println();
               
}
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton custButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelDisplay;
    private javax.swing.JButton staffButton;
    // End of variables declaration//GEN-END:variables
}

