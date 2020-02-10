/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_package;

import file_op.FileOperations;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Doreen Midecha
 */
public class access extends javax.swing.JFrame {
    
    FileOperations fo;
    thread_file_2 tf;

    /**
     * Creates new form access
     */
    public access() {
        initComponents();
        tf = new thread_file_2(new writing_splash(), 40, new applications());
        email_group_txt.setCursor(new Cursor(1));
        folder_txt.setCursor(new Cursor(1));
        email_group_txt.setEditable(false);
        folder_txt.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        acsess_panel_content = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        email_chk = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        folder_txt = new javax.swing.JTextArea();
        folder_chk = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        email_group_txt = new javax.swing.JTextArea();
        login_user_pass_chk = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        commit_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        quit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACCESS RIGHTS");

        acsess_panel_content.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Login username & password :");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        email_chk.setText("Yes");
        email_chk.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        email_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_chkActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email Goups:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        folder_txt.setColumns(20);
        folder_txt.setRows(5);
        folder_txt.setTabSize(4);
        folder_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jScrollPane2.setViewportView(folder_txt);

        folder_chk.setText("Yes");
        folder_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folder_chkActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Specify folder(s):");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        email_group_txt.setColumns(20);
        email_group_txt.setRows(5);
        email_group_txt.setTabSize(4);
        email_group_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        email_group_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        email_group_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                email_group_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                email_group_txtMouseEntered(evt);
            }
        });
        email_group_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                email_group_txtKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(email_group_txt);

        login_user_pass_chk.setText("Yes");
        login_user_pass_chk.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Shared Folders:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Email:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        commit_btn.setText("Commit");
        commit_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        commit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commit_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACCESS RIGHTS");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        quit_btn.setText("Quit");
        quit_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout acsess_panel_contentLayout = new javax.swing.GroupLayout(acsess_panel_content);
        acsess_panel_content.setLayout(acsess_panel_contentLayout);
        acsess_panel_contentLayout.setHorizontalGroup(
            acsess_panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acsess_panel_contentLayout.createSequentialGroup()
                .addGroup(acsess_panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acsess_panel_contentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(acsess_panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(57, 57, 57)
                        .addGroup(acsess_panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login_user_pass_chk)
                            .addComponent(email_chk)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(folder_chk)
                            .addGroup(acsess_panel_contentLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(acsess_panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(commit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))))
                    .addGroup(acsess_panel_contentLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        acsess_panel_contentLayout.setVerticalGroup(
            acsess_panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acsess_panel_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(acsess_panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_user_pass_chk)
                    .addGroup(acsess_panel_contentLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(acsess_panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(email_chk))
                .addGap(24, 24, 24)
                .addGroup(acsess_panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(acsess_panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(folder_chk)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(acsess_panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acsess_panel_contentLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(acsess_panel_contentLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acsess_panel_contentLayout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(quit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(commit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(acsess_panel_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(acsess_panel_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void email_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_chkActionPerformed
        if (email_chk.isEnabled()) {
            email_group_txt.setEditable(true);
            email_group_txt.setCursor(new Cursor(2));
//            System.out.println("Email set");
        }
    }//GEN-LAST:event_email_chkActionPerformed

    private void folder_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folder_chkActionPerformed
        if (folder_chk.isEnabled()) {
            folder_txt.setEditable(true);
            folder_txt.setCursor(new Cursor(2));
        }
    }//GEN-LAST:event_folder_chkActionPerformed

    private void quit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit_btnActionPerformed
        //        dispose this jframe
        dispose();
//       display control
        new login().setVisible(true);
        

    }//GEN-LAST:event_quit_btnActionPerformed

    private void commit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commit_btnActionPerformed
//      local variable declaration and initialization
        boolean lup = login_user_pass_chk.isSelected();
        boolean email = email_chk.isSelected();
        String email_txt = email_group_txt.getText();
        boolean sf_chk = folder_chk.isSelected();
        String sf_txt = folder_txt.getText().toString();
        
        String login = null;
        String eml = null;
        String eml_g = email_txt;
        String folder = null;
        String folder_g = sf_txt;
        
        if (lup) {
            login = "LOGIN CREDETIALS_: TRUE";
        } else {
            login = "LOGIN CREDETALS_ : FALSE";
        }
        if (email && (eml_g != null)) {
            eml = "EMAIL_ _ _ _ _ _ : TRUE";
            eml_g = "EMAIL GROUPS_ _ _: \n" + email_txt.toUpperCase();
        } else if (email || (eml_g == null)) {
            eml = "EMAIL_ _ _ _ _ _ : TRUE";
            eml_g = "EMAIL GROUPS_ _ _: FALSE";
        }
        if (sf_chk && (folder_g != null)) {
            folder = "HOME FOLDER_ _ _ : TRUE";
            folder_g = "FOLDER GROUP_ _ _: \n" + sf_txt.toUpperCase();
        } else if (sf_chk || (folder_g == null)) {
            folder = "HOME FOLDER_ _ _ : TRUE";
            folder_g = "FOLDER GROUP_ _ _: FALSE";
        }
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
                String[] results = {date.toString(), "***ACCESS RIGHTS***", login, eml, eml_g, folder, folder_g};
                fo.writeToFile(results);
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
        

    }//GEN-LAST:event_commit_btnActionPerformed

    private void email_group_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_group_txtMouseEntered
//        email_group_txt.setCursor(new Cursor(1));
    }//GEN-LAST:event_email_group_txtMouseEntered

    private void email_group_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_group_txtKeyPressed
//         if (email_group_txt.isEditable()) {
//            email_group_txt.append("\n2. ");            
//        }
    }//GEN-LAST:event_email_group_txtKeyPressed

    private void email_group_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_group_txtMouseClicked
//       append a one 
//        if (email_group_txt.isEditable()) {
//            email_group_txt.append("1. ");            
//        }
        
    }//GEN-LAST:event_email_group_txtMouseClicked

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
            java.util.logging.Logger.getLogger(access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new access().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acsess_panel_content;
    private javax.swing.JButton commit_btn;
    private javax.swing.JCheckBox email_chk;
    private javax.swing.JTextArea email_group_txt;
    private javax.swing.JCheckBox folder_chk;
    private javax.swing.JTextArea folder_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox login_user_pass_chk;
    private javax.swing.JButton quit_btn;
    // End of variables declaration//GEN-END:variables
}
