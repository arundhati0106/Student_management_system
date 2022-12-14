/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author arund
 */
public class Admin_frame extends javax.swing.JFrame {

    /**
     * Creates new form Admin_frame
     */
    public Admin_frame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_student = new javax.swing.JButton();
        add_result = new javax.swing.JButton();
        list_student = new javax.swing.JButton();
        list_result = new javax.swing.JButton();
        update_results = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exit1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_student.setText("Add student");
        add_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_studentActionPerformed(evt);
            }
        });
        getContentPane().add(add_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 67, 109, -1));

        add_result.setText("Add result");
        add_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_resultActionPerformed(evt);
            }
        });
        getContentPane().add(add_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 170, 109, -1));

        list_student.setText("List of students");
        list_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_studentActionPerformed(evt);
            }
        });
        getContentPane().add(list_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 67, -1, -1));

        list_result.setText("List of results");
        list_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_resultActionPerformed(evt);
            }
        });
        getContentPane().add(list_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 170, 109, -1));

        update_results.setText("Update results");
        update_results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_resultsActionPerformed(evt);
            }
        });
        getContentPane().add(update_results, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 211, 109, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-login-30.png"))); // NOI18N
        exit.setText("Log out");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student information");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 388, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student results' information");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, 388, -1));

        exit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-close-30.png"))); // NOI18N
        exit1.setText("Exit");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1090, -560, 1510, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_studentActionPerformed
        Insert_student frame = new Insert_student();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_add_studentActionPerformed

    private void add_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_resultActionPerformed
        Insert_result frame = new Insert_result();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_add_resultActionPerformed

    private void list_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_studentActionPerformed
        List_Student frame = new List_Student();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_list_studentActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        Home frame = new Home();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_exitActionPerformed

    private void list_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_resultActionPerformed
        List_Results frame = new List_Results();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
// TODO add your handling code here:
    }//GEN-LAST:event_list_resultActionPerformed

    private void update_resultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_resultsActionPerformed
        Update_result frame = new Update_result();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_update_resultsActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        exit1.setOpaque(false);
        exit1.setContentAreaFilled(false);
        exit1.setBorderPainted(false);
    }//GEN-LAST:event_formComponentShown

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "You sure you want to exit", "Submit", JOptionPane.YES_NO_OPTION);

        if(response == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_exit1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_result;
    private javax.swing.JButton add_student;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton list_result;
    private javax.swing.JButton list_student;
    private javax.swing.JButton update_results;
    // End of variables declaration//GEN-END:variables
}
