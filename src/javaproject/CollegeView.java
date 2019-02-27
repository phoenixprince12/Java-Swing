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
public class CollegeView extends javax.swing.JFrame {
    College staffTrans;
    
    public CollegeView(College staffTrans) {
        this.staffTrans=staffTrans;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        compare = new javax.swing.JTextArea();
        transBackBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("View Colleges");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 20, 290, 30);

        compare.setColumns(20);
        compare.setRows(5);
        jScrollPane1.setViewportView(compare);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(46, 65, 308, 195);

        transBackBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transBackBtn.setText("BACK");
        transBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(transBackBtn);
        transBackBtn.setBounds(146, 278, 98, 32);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 11, 405, 7);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 420, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transBackBtnActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        staffTrans.setVisible(true);
    }//GEN-LAST:event_transBackBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea compare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton transBackBtn;
    // End of variables declaration//GEN-END:variables
}
