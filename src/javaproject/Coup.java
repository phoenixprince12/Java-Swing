package javaproject;


import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The Phoenix
 */
public class Coup extends javax.swing.JFrame {
    College staff;
    TableUsingArrayList tableUsingArrayList;    

    
    public Coup(College staff) {
        initComponents();
        this.staff = staff;
        
        tableUsingArrayList = new TableUsingArrayList(this);
    }

    Coup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addItemBtn = new javax.swing.JButton();
        updateItemBtn = new javax.swing.JButton();
        deleteItemBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Coupdate = new javax.swing.JTable();
        cancelBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("College Update");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 0, 200, 30);

        addItemBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addItemBtn.setText("ADD");
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addItemBtn);
        addItemBtn.setBounds(0, 300, 80, 23);

        updateItemBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateItemBtn.setText("UPDATE");
        getContentPane().add(updateItemBtn);
        updateItemBtn.setBounds(90, 300, 100, 23);

        deleteItemBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteItemBtn.setText("DELETE");
        deleteItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteItemBtn);
        deleteItemBtn.setBounds(200, 300, 100, 23);

        Coupdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "JUET", "Guna", "A"},
                { new Integer(2), "IIT Kanpur", "Kanpur", "A"},
                { new Integer(3), "IIT Delhi", "Delhi", "A"},
                { new Integer(4), "JIIT", "Noida", "A"},
                { new Integer(5), "Anand College", "Agra", "B"},
                {null, null, null, null}
            },
            new String [] {
                "S. No.", "College Name", "City", "NIRF Ranking"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Coupdate);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(15, 43, 285, 219);

        cancelBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelBtn.setText("BACK");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn);
        cancelBtn.setBounds(310, 300, 80, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 430, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        
        DefaultTableModel model= (DefaultTableModel) Coupdate.getModel();
        model.addRow(new Object[1]);
    }//GEN-LAST:event_addItemBtnActionPerformed

    private void deleteItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemBtnActionPerformed
        
        DefaultTableModel model1= (DefaultTableModel) Coupdate.getModel();
        model1.removeRow(Coupdate.getSelectedRow());
       
    }//GEN-LAST:event_deleteItemBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        
        this.setVisible(false);
        staff.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Coupdate;
    private javax.swing.JButton addItemBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteItemBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateItemBtn;
    // End of variables declaration//GEN-END:variables
}
