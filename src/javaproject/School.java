package javaproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The Phoenix
 */
public class School extends javax.swing.JFrame {
    UserIdentification user;
    Intermediary inter;
   
    public School(Intermediary inter) {
        initComponents();
        this.inter =inter;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orderFoodBtn = new javax.swing.JButton();
        bookRoomBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel1.setText("School and College Lists");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 50, 145, 16);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel2.setText("Know The Best");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 10, 129, 26);

        orderFoodBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        orderFoodBtn.setText("View Schools");
        orderFoodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderFoodBtnActionPerformed(evt);
            }
        });
        getContentPane().add(orderFoodBtn);
        orderFoodBtn.setBounds(56, 147, 130, 30);

        bookRoomBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bookRoomBtn.setText("Update Schools");
        bookRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomBtnActionPerformed(evt);
            }
        });
        getContentPane().add(bookRoomBtn);
        bookRoomBtn.setBounds(216, 147, 120, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 210, 110, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderFoodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderFoodBtnActionPerformed
        
        Knt Knt = new Knt (inter);
        this.setVisible(false);
        Knt.setVisible(true);
    }//GEN-LAST:event_orderFoodBtnActionPerformed

    private void bookRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomBtnActionPerformed
        
        SchoolInformation j= new SchoolInformation();
                   j.setVisible(true);
    }//GEN-LAST:event_bookRoomBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        UserIdentification id = new UserIdentification(inter);
        this.setVisible(false);
        id.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookRoomBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton orderFoodBtn;
    // End of variables declaration//GEN-END:variables
}
