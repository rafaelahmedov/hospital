/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframesehv;

import connmysqlhospital.connmysqlxestexana;
import entityPasiyent.Pasiyent;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class dialog extends javax.swing.JFrame {

    private final List<Pasiyent> listofmypasiyent;
   

    /**
     * Creates new form dialog
     */
    public dialog() {
        initComponents();
       
        
        jTextField1ad.setEnabled(false);
        jTextField2soyad.setEnabled(false);
        jTextField3pinkod.setEnabled(false);
        jTextField4telefon.setEnabled(false);
        jTextField5adres.setEnabled(false);
        jButtonduzelis.setEnabled(false);
        jButtonsil.setEnabled(false);
        jButtontemizle.setEnabled(false);
        jButtonyaddasaxla.setEnabled(false);
        connmysqlxestexana conn = new connmysqlxestexana();
        listofmypasiyent = conn.ekranacixarmaemripasiyent("");
        fillthetable(listofmypasiyent);
    }
    
    public void fillthetable(List<Pasiyent>list){
        int row = 0;
        for (Pasiyent pasiyent : list) {
        jTable2.setValueAt(pasiyent.getAd(), row, 0);
        jTable2.setValueAt(pasiyent.getSoyad(), row, 1);
        jTable2.setValueAt(pasiyent.getPinkod(), row, 2);
        jTable2.setValueAt(pasiyent.getTelefon(), row, 3);
        jTable2.setValueAt(pasiyent.getAdres(), row, 4);
        row++;
        }
    
    
    }
    
    public void clear(){
         jTextField1ad.setText(null);
         jTextField2soyad.setText(null);
         jTextField3pinkod.setText(null);
         jTextField4telefon.setText(null);
         jTextField5adres.setText(null);
         jTextField6axtar.setText(null);


}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JDialog jDialog1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1ad = new javax.swing.JTextField();
        jTextField2soyad = new javax.swing.JTextField();
        jTextField3pinkod = new javax.swing.JTextField();
        jTextField4telefon = new javax.swing.JTextField();
        jTextField5adres = new javax.swing.JTextField();
        jButtontemizle = new javax.swing.JButton();
        jButtonaxtar = new javax.swing.JButton();
        jButtonsil = new javax.swing.JButton();
        jButtonyeni = new javax.swing.JButton();
        jButtonduzelis = new javax.swing.JButton();
        jButtonyaddasaxla = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jlableaxtar = new javax.swing.JLabel();
        jComboBox2dialog = new javax.swing.JComboBox<>();
        jTextField6axtar = new javax.swing.JTextField();
        jbuttonpas = new javax.swing.JButton();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ad", "Soyad", "PinKod", "Telefon", "Adress"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Ad");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Soyad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("PinKod");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Telefon");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Adress");

        jTextField4telefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4telefonActionPerformed(evt);
            }
        });

        jButtontemizle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtontemizle.setText("Temizle");
        jButtontemizle.setMaximumSize(new java.awt.Dimension(20, 20));
        jButtontemizle.setMinimumSize(new java.awt.Dimension(20, 20));
        jButtontemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontemizleActionPerformed(evt);
            }
        });

        jButtonaxtar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonaxtar.setText("Axtar");
        jButtonaxtar.setMaximumSize(new java.awt.Dimension(20, 20));
        jButtonaxtar.setMinimumSize(new java.awt.Dimension(20, 20));
        jButtonaxtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaxtarActionPerformed(evt);
            }
        });

        jButtonsil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonsil.setText("Sil");
        jButtonsil.setMaximumSize(new java.awt.Dimension(20, 20));
        jButtonsil.setMinimumSize(new java.awt.Dimension(20, 20));

        jButtonyeni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonyeni.setText("Yeni");
        jButtonyeni.setMaximumSize(new java.awt.Dimension(20, 20));
        jButtonyeni.setMinimumSize(new java.awt.Dimension(20, 20));
        jButtonyeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonyeniActionPerformed(evt);
            }
        });

        jButtonduzelis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonduzelis.setText("Duzelis et");
        jButtonduzelis.setMaximumSize(new java.awt.Dimension(20, 20));
        jButtonduzelis.setMinimumSize(new java.awt.Dimension(20, 20));

        jButtonyaddasaxla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonyaddasaxla.setText("Yadda Saxla");
        jButtonyaddasaxla.setMaximumSize(new java.awt.Dimension(20, 20));
        jButtonyaddasaxla.setMinimumSize(new java.awt.Dimension(20, 20));
        jButtonyaddasaxla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonyaddasaxlaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Xos Gelmisiz!!");

        jlableaxtar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlableaxtar.setText("Axtar:");

        jComboBox2dialog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ad", "Soyad", "PinKod", "Telefon" }));
        jComboBox2dialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2dialogActionPerformed(evt);
            }
        });

        jTextField6axtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6axtarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1ad, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jTextField3pinkod, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(jTextField4telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButtonyeni, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonduzelis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonyaddasaxla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addComponent(jTextField5adres, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButtontemizle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonaxtar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonsil, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlableaxtar)
                .addGap(4, 4, 4)
                .addComponent(jComboBox2dialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField6axtar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jTextField1ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(jTextField3pinkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTextField4telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonyeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonduzelis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonyaddasaxla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTextField5adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtontemizle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonaxtar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonsil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jlableaxtar))
                    .addComponent(jComboBox2dialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6axtar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbuttonpas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbuttonpas.setText("Pasiyent");
        jbuttonpas.setToolTipText("");
        jbuttonpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonpasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbuttonpas)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbuttonpas)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4telefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4telefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4telefonActionPerformed

    private void jButtontemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontemizleActionPerformed
           clear();
    }//GEN-LAST:event_jButtontemizleActionPerformed

    private void jTextField6axtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6axtarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6axtarActionPerformed

    private void jbuttonpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonpasActionPerformed
       
       
    }//GEN-LAST:event_jbuttonpasActionPerformed

    private void jButtonyeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonyeniActionPerformed
      jTextField1ad.setEnabled(true);
      jTextField2soyad.setEnabled(true);
      jTextField3pinkod.setEnabled(true);
      jTextField4telefon.setEnabled(true);
      jTextField5adres.setEnabled(true);
      jButtonsil.setEnabled(true);
      jButtontemizle.setEnabled(true);
      jButtonyaddasaxla.setEnabled(true);
      jButtonduzelis.setEnabled(true);
    }//GEN-LAST:event_jButtonyeniActionPerformed

    private void jButtonyaddasaxlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonyaddasaxlaActionPerformed
        connmysqlxestexana conn = new connmysqlxestexana();
        if(!jTextField1ad.getText().equals("")&&!jTextField2soyad.getText().equals("")&&!jTextField3pinkod.getText().equals("")&&!jTextField4telefon.getText().equals("")&&!jTextField5adres.getText().equals("")){
        Pasiyent ps = new Pasiyent(0, jTextField1ad.getText(), jTextField2soyad.getText(), jTextField3pinkod.getText(), jTextField4telefon.getText(), jTextField5adres.getText());
        conn.insertupdatepasiyent(ps);
        }else{
        
            JOptionPane.showMessageDialog(null, "Bu xanalar bos qala bilmez!!");
        }
        
        
    }//GEN-LAST:event_jButtonyaddasaxlaActionPerformed

    private void jComboBox2dialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2dialogActionPerformed
        connmysqlxestexana conn = new connmysqlxestexana();
        int index = jComboBox2dialog.getSelectedIndex();
        if(index==0){
            List<Pasiyent>list=conn.adagoreekranacixarpas(jTextField6axtar.getText());
       fillthetable(list);
        }else{
       
         if(index==1){
             List<Pasiyent>list=conn.soyadgoreekranacixpas(jTextField6axtar.getText());
        fillthetable(list);}else{
                
         if(index==2){
             List<Pasiyent>list=conn.pinkodgoreekranacixpas(jTextField6axtar.getText());
        
        fillthetable(list);}else{
        if(index==3){
            List<Pasiyent>list=conn.telefongoreekranacixpas(jTextField6axtar.getText());
            fillthetable(list);}}} 
        }
       
        
        
    }//GEN-LAST:event_jComboBox2dialogActionPerformed

    private void jButtonaxtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaxtarActionPerformed
      if(jTextField6axtar.getText().equals("")){
      JOptionPane.showMessageDialog(null, "Xana bosdur!");
      }
        jComboBox2dialogActionPerformed(evt);
      
    }//GEN-LAST:event_jButtonaxtarActionPerformed

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
            java.util.logging.Logger.getLogger(dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonaxtar;
    private javax.swing.JButton jButtonduzelis;
    private javax.swing.JButton jButtonsil;
    private javax.swing.JButton jButtontemizle;
    private javax.swing.JButton jButtonyaddasaxla;
    private javax.swing.JButton jButtonyeni;
    private javax.swing.JComboBox<String> jComboBox2dialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1ad;
    private javax.swing.JTextField jTextField2soyad;
    private javax.swing.JTextField jTextField3pinkod;
    private javax.swing.JTextField jTextField4telefon;
    private javax.swing.JTextField jTextField5adres;
    private javax.swing.JTextField jTextField6axtar;
    private javax.swing.JButton jbuttonpas;
    private javax.swing.JLabel jlableaxtar;
    // End of variables declaration//GEN-END:variables
}
