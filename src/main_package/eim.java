/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_package;

import file_op.FileOperations;
import java.awt.HeadlessException;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Doreen Midecha
 */
public class eim extends javax.swing.JFrame {
FileOperations fo;
    thread_file_2 tf;
    /**
     * Creates new form eim
     */
    public eim() {
        initComponents();
         tf = new thread_file_2(new writing_splash(), 40, new applications());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        comm_chk = new javax.swing.JCheckBox();
        payroll_comm_chk = new javax.swing.JCheckBox();
        end_user_chk = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        sup_chk = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        payroll_non_chk = new javax.swing.JCheckBox();
        hr_admin_chk = new javax.swing.JCheckBox();
        finish_btn = new javax.swing.JButton();
        quit_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comments_txt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPLOYER INFORMATION MANAGEMENT");

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setToolTipText("");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("PAYROLL COMMISSION :");
        jLabel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comm_chk.setText("Yes ");

        payroll_comm_chk.setText("Yes ");

        end_user_chk.setText("Yes ");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("END USER :");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sup_chk.setText("Yes ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("HR ADMIN :");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("SUPERVISOR :");
        jLabel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("PAYROLL NON :");
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("COMMISSION :");
        jLabel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        payroll_non_chk.setText("Yes ");

        hr_admin_chk.setText("Yes ");

        finish_btn.setText("FINISH");
        finish_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish_btnActionPerformed(evt);
            }
        });

        quit_btn.setText("Quit");
        quit_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("COMMENTS :");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comments_txt.setColumns(20);
        comments_txt.setRows(5);
        jScrollPane1.setViewportView(comments_txt);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel29))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hr_admin_chk)
                            .addComponent(end_user_chk)
                            .addComponent(sup_chk)
                            .addComponent(payroll_comm_chk)
                            .addComponent(payroll_non_chk)
                            .addComponent(comm_chk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finish_btn))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(finish_btn)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hr_admin_chk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(end_user_chk))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sup_chk))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payroll_comm_chk))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payroll_non_chk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comm_chk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit_btnActionPerformed
        //        dispose this jframe
        dispose();
        //       display control
        new login().setVisible(true);

    }//GEN-LAST:event_quit_btnActionPerformed

    private void finish_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish_btnActionPerformed
//        local variable initialization and declarations
        boolean hr = hr_admin_chk.isSelected();
        boolean end_user = end_user_chk.isSelected();
        boolean supervisor = sup_chk.isSelected();
        boolean payroll_comm = payroll_comm_chk.isSelected();
        boolean payroll_non = payroll_non_chk.isSelected();
        boolean commission = comm_chk.isSelected();
        String comment = comments_txt.getText();
//        array initialization
        @SuppressWarnings("MismatchedReadAndWriteOfArray")
        String[] container = new String[7];
            container[0] = "*EMPLOYEY INFORMATION MANAGER*";
        if (hr) {
            container[1] = "HR ADMIN _ _ _ : TRUE";
        } else {
            container[1] = "HR ADMIN _ _ _ : FALSE";
        }
        if (end_user) {
            container[2] = "END USER _ _ _ : TRUE";      
        } else {
            container[2] = "END USER _ _ _ : FALSE";   
        }
        if (supervisor) {
            container[3] = "SUPERVISOR _ _ : TRUE";       
        } else {
            container[3] = "SUPERVISOR _ _ : FALSE"; 
        }
        if (payroll_comm) {
            container[4] = "PAYROLL COMMISSION: TRUE";       
        } else {
            container[4] = "PAYROLL COMMISSION: FALSE ";  
        }
        if (payroll_non) {
            container[5] = "PAYROLL NON: _ : TRUE";       
        } else {
            container[5] = "PAYROLL NON: _ : FALSE";         
        }
        if (commission) {
            container[6] = "COMMISSION _ _ : TRUE";      
        } else {
            container[6] = "COMMISSION _ _ : FALSE";  
        }
        container[7] = comment;
//        
Date date = new Date();
        fo = new FileOperations();
        try {
            if (fo.fileExists()) {
//                System.out.println("ok 1");
//                close this frmae 
                dispose();
//          start file thread
                tf.start();
//                write to file
                fo.writeToFile(container);
//                System.out.println("ok 2");
//                JOptionPane.showMessageDialog(null, "Data successfully appended at the end of file", "File", JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "File Processing Error", "File", HEIGHT);
                dispose();
                new login().setVisible(true);
            }
            
        } catch (HeadlessException e) {
            System.out.println("oops \n" + e);
        }

    }//GEN-LAST:event_finish_btnActionPerformed

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
            java.util.logging.Logger.getLogger(eim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox comm_chk;
    private javax.swing.JTextArea comments_txt;
    private javax.swing.JCheckBox end_user_chk;
    private javax.swing.JButton finish_btn;
    private javax.swing.JCheckBox hr_admin_chk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox payroll_comm_chk;
    private javax.swing.JCheckBox payroll_non_chk;
    private javax.swing.JButton quit_btn;
    private javax.swing.JCheckBox sup_chk;
    // End of variables declaration//GEN-END:variables
}