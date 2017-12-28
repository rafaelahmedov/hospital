/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe.Ekran;

import connmysqlhospital.connmysqlxestexana;
import entityPasiyent.Pasiyent;
import entityhekim.Hekim;
import entityqeydiyyat.qeydiyyat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class Qeydiyyatdialog extends javax.swing.JDialog {

    private final connmysqlxestexana conn;
    private List<qeydiyyat> listofqeydiyyat;
    private qeydiyyat selectedqeydiyyat;
    private final List<Pasiyent> listofpasiyent;
    private final List<Hekim> listofhekim;

    /**
     * Creates new form Qeydiyyatdialog
     */
    public Qeydiyyatdialog(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
//        System.out.println("sssss " + parent + "  " + modal);
        initComponents();
        setTitle("Qeydiyyat");
        action("start");
        conn = new connmysqlxestexana();
        listofqeydiyyat = conn.ekranacixarmaqeydiyyat("");
        fillthetable(listofqeydiyyat);
        listofpasiyent = conn.ekranacixarmaemripasiyent("");
        for (Pasiyent pas : listofpasiyent) {
            jComboBoxpasient.addItem(pas.getAd());
        }
        listofhekim = conn.ekranacixarmaemrihekim("");
        for (Hekim hek : listofhekim) {
            jComboBoxhekim.addItem(hek.getAd());
        }
    }

    private void fillthetable(List<qeydiyyat> list) {
        DefaultTableModel tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        tmodel.addColumn("Pasiyent");
        tmodel.addColumn("Hekim");
        tmodel.addColumn("Tarix");
        tmodel.addColumn("Odenis");
        tmodel.addColumn("IlkinDiaqnoz");
        tmodel.addColumn("SonDiaqnoz");
        jTable1.setModel(tmodel);
//        int row=-1;
        for (qeydiyyat qeyd : list) {
//            row++;
//             jTable1.setValueAt(qeyd.getIdpasiyent(), row, 0);
//             jTable1.setValueAt(qeyd.getIdhekim(), row, 1);
//             jTable1.setValueAt(qeyd.getTarix() ,row, 2);
//             jTable1.setValueAt(qeyd.getOdenis(), row, 3);
//             
            tmodel.insertRow(jTable1.getRowCount(), new Object[]{
                conn.idyegoreekranacixarpas(qeyd.getIdpasiyent()).getAd(),
                conn.idGoreEkranaCixHek(qeyd.getIdhekim()).getAd(),
                qeyd.getTarix(),
                qeyd.getOdenis(),
                qeyd.getIlkinDiaqnoz(),
                qeyd.getSonDiaqnoz()});
        }
    }

    private void textfealdproperties(boolean done) {
        jTextFieldodenis.setEnabled(done);
        jComboBoxpasient.setEnabled(done);
        jTextFieldilkindiaqnoz.setEnabled(done);
        jComboBoxhekim.setEnabled(done);
        jTextFieldsondiaqnoz.setEnabled(done);
        jTextFieldtarix.setEnabled(done);
    }

    private void buttonproperties(boolean SCC, boolean NEW, boolean DEL, boolean Edit) {
        jButtoncancel.setEnabled(SCC);
        jButtonclear.setEnabled(SCC);
        jButtonsave.setEnabled(SCC);
        jButtonnew.setEnabled(NEW);
        jButtondelete.setEnabled(DEL);
        jButtonedit.setEnabled(Edit);
    }

    private void clear() {
        jTextFieldaxtar.setText(null);
        jTextFieldilkindiaqnoz.setText(null);
        jTextFieldodenis.setText(null);
        jTextFieldsondiaqnoz.setText(null);
        jTextFieldtarix.setText(null);
    }

    private void action(String actionname) {
        boolean NEW, SCC, DEL, Edit, Done;
        switch (actionname) {

            case "NEW": {
                NEW = false;
                SCC = true;
                DEL = false;
                Edit = false;
                Done = true;
                break;
            }
            case "Edit": {
                NEW = false;
                SCC = true;
                DEL = false;
                Edit = false;
                Done = true;
                break;
            }
            case "Table": {
                NEW = true;
                SCC = false;
                DEL = true;
                Edit = true;
                Done = false;
                break;
            }
            default:
                NEW = true;
                SCC = false;
                DEL = false;
                Edit = false;
                Done = false;
                break;
        }
        textfealdproperties(Done);
        buttonproperties(SCC, NEW, DEL, Edit);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldilkindiaqnoz = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldsondiaqnoz = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonnew = new javax.swing.JButton();
        jButtaxtar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonedit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonsave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonclear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtoncancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtondelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldtarix = new javax.swing.JTextField();
        jTextFieldaxtar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldodenis = new javax.swing.JTextField();
        jComboBoxpasient = new javax.swing.JComboBox<>();
        jComboBoxhekim = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Axtar:");

        jTextFieldsondiaqnoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsondiaqnozActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ad", "Soyad", "PinKod", "Telefon" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButtonnew.setText("New");
        jButtonnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnewActionPerformed(evt);
            }
        });

        jButtaxtar.setText("Axtar");
        jButtaxtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtaxtarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pasient");

        jButtonedit.setText("Edit");
        jButtonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneditActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Hekim:");

        jButtonsave.setText("Save");
        jButtonsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsaveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tarix");

        jButtonclear.setText("Clear");
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("IlkinDiaqnoz");

        jButtoncancel.setText("Cancel");
        jButtoncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncancelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("SonDiaqnoz");

        jButtondelete.setText("Delete");
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextFieldaxtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldaxtarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Odenis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 157, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonnew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonedit)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonsave))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldaxtar, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtaxtar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonclear)
                                .addGap(18, 18, 18)
                                .addComponent(jButtoncancel)
                                .addGap(18, 18, 18)
                                .addComponent(jButtondelete))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldtarix, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                    .addComponent(jComboBoxpasient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxhekim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldsondiaqnoz, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldilkindiaqnoz, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldodenis, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxpasient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxhekim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldtarix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldodenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldilkindiaqnoz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldsondiaqnoz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonnew)
                    .addComponent(jButtonedit)
                    .addComponent(jButtonsave)
                    .addComponent(jButtonclear)
                    .addComponent(jButtoncancel)
                    .addComponent(jButtondelete))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldaxtar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtaxtar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldsondiaqnozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsondiaqnozActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldsondiaqnozActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnewActionPerformed
        action("NEW");
    }//GEN-LAST:event_jButtonnewActionPerformed

    private void jButtaxtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtaxtarActionPerformed
   
    

    }//GEN-LAST:event_jButtaxtarActionPerformed

    private void jButtoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneditActionPerformed
        int index = jTable1.getSelectedRow();
        selectedqeydiyyat = listofqeydiyyat.get(index);
        jTextFieldtarix.setText(selectedqeydiyyat.getTarix());
        jTextFieldodenis.setText(selectedqeydiyyat.getOdenis());
        jTextFieldilkindiaqnoz.setText(selectedqeydiyyat.getIlkinDiaqnoz());
        jTextFieldsondiaqnoz.setText(selectedqeydiyyat.getSonDiaqnoz());

        action("Edit");
    }//GEN-LAST:event_jButtoneditActionPerformed

    private void jButtonsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsaveActionPerformed

        if (!jTextFieldtarix.getText().equals("") && !jTextFieldodenis.getText().equals("") && !jTextFieldilkindiaqnoz.getText().equals("") && !jTextFieldsondiaqnoz.getText().equals("")) {
            int id = 0;
            if (selectedqeydiyyat != null) {
                id = selectedqeydiyyat.getIdqeydiyyat();
            }

            connmysqlxestexana conn = new connmysqlxestexana();
            qeydiyyat q = new qeydiyyat();
            q.setTarix(jTextFieldtarix.getText());
            q.setOdenis(jTextFieldodenis.getText());
            q.setIlkinDiaqnoz(jTextFieldilkindiaqnoz.getText());
            q.setSonDiaqnoz(jTextFieldsondiaqnoz.getText());
            q.setIdqeydiyyat(id);
            Pasiyent selectedpasient = listofpasiyent.get(jComboBoxpasient.getSelectedIndex());
            q.setIdpasiyent(selectedpasient.getIdpasiyent());
            Hekim selectedhekim = listofhekim.get(jComboBoxhekim.getSelectedIndex());
            q.setIdhekim(selectedhekim.getIdhekim());

            conn.insertupdateqeydiyyat(q);
            listofqeydiyyat = conn.ekranacixarmaqeydiyyat("");
            fillthetable(listofqeydiyyat);

            action("");
            selectedqeydiyyat = null;
            clear();
        } else {

            JOptionPane.showMessageDialog(this, "Zehmet olmasa xanalarin doldurun!!");
        }


    }//GEN-LAST:event_jButtonsaveActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        clear();
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncancelActionPerformed
        action("cancel");
    }//GEN-LAST:event_jButtoncancelActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        int index = jTable1.getSelectedRow();
        int id = listofqeydiyyat.get(index).getIdqeydiyyat();
        connmysqlxestexana conn = new connmysqlxestexana();
        int n = JOptionPane.showConfirmDialog(this, "Silmeye Eminsiz?", "Xeberdarliq", JOptionPane.OK_CANCEL_OPTION);
        if (n == 0) {
            conn.deletesobe(id);
            listofqeydiyyat.remove(index);
            fillthetable(listofqeydiyyat);
            action("Del");

        }
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            action("Table");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTextFieldaxtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldaxtarActionPerformed

    }//GEN-LAST:event_jTextFieldaxtarActionPerformed

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
            java.util.logging.Logger.getLogger(Qeydiyyatdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Qeydiyyatdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Qeydiyyatdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Qeydiyyatdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Qeydiyyatdialog dialog = new Qeydiyyatdialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtaxtar;
    private javax.swing.JButton jButtoncancel;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonedit;
    private javax.swing.JButton jButtonnew;
    private javax.swing.JButton jButtonsave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxhekim;
    private javax.swing.JComboBox<String> jComboBoxpasient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldaxtar;
    private javax.swing.JTextField jTextFieldilkindiaqnoz;
    private javax.swing.JTextField jTextFieldodenis;
    private javax.swing.JTextField jTextFieldsondiaqnoz;
    private javax.swing.JTextField jTextFieldtarix;
    // End of variables declaration//GEN-END:variables
}