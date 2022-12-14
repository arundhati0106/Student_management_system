/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Connection_provider.Connection_code;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

/**
 *
 * @author arund
 */
public class Update_result extends javax.swing.JFrame {

    /**
     * Creates new form Update_student
     */
    public Update_result() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        search_btn = new javax.swing.JButton();
        rollno_txt = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        physics = new javax.swing.JTextField();
        chemistry = new javax.swing.JTextField();
        maths = new javax.swing.JTextField();
        english = new javax.swing.JTextField();
        softskills = new javax.swing.JTextField();
        aptitude = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(347, 550));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Physics");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Chemistry");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Maths");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("English");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Soft Skills");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Aptitude");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Roll no");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 50, -1));

        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-search-30.png"))); // NOI18N
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 30, 30));

        rollno_txt.setPreferredSize(new java.awt.Dimension(64, 28));
        getContentPane().add(rollno_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 160, 30));

        submit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        physics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicsActionPerformed(evt);
            }
        });
        getContentPane().add(physics, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, -1));
        getContentPane().add(chemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 110, -1));
        getContentPane().add(maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 110, -1));
        getContentPane().add(english, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 110, -1));
        getContentPane().add(softskills, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 110, -1));
        getContentPane().add(aptitude, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 110, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Total");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 110, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-back-arrow-30.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        exit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-close-30.png"))); // NOI18N
        exit1.setText("Exit");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 90, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enter roll no of the student");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 320, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Enter new marks");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 150, 330, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -170, 630, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        String rollno = rollno_txt.getText();
        try {
            //look for mentioned roll no in database -> student table
            Connection con = Connection_code.get_con();

            //TYPE_SCROLL_SENSITIVE -> updates changes in result set, as soon as they were made in database
            //CONCUR_UPDATABLE -> if entry is updated in database, updates it here as well
            //these two parameters, sync the database and result set
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            //execute mentioned query in the table in MySQL
            ResultSet rs = st.executeQuery("SELECT * FROM result WHERE rollno='"+rollno+"'");

            //if query, doesnt't return a value, i.e. doesn't find a row where roll no = 'rollno', show error message
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "Entered RollNo. doesn't exist");
            }
            else{
                //else -> student with mentioned roll no found, now input marks, and disable the editing feature of roll no,
                //to avoid confusion, change roll no post input of marks, leads to ambiguity
                rollno_txt.setEditable(false);
                
                physics.setText(rs.getString(2));
                maths.setText(rs.getString(3));
                chemistry.setText(rs.getString(4));
                aptitude.setText(rs.getString(5));
                english.setText(rs.getString(6));
                softskills.setText(rs.getString(7));
                total.setText(rs.getString(8));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_search_btnActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String rollno = rollno_txt.getText();
        int physicsMarks = Integer.parseInt(physics.getText());
        int mathsMarks = Integer.parseInt(maths.getText());
        int chemMarks = Integer.parseInt(chemistry.getText());
        int aptitudemarks = Integer.parseInt(aptitude.getText());
        int englishmarks = Integer.parseInt(english.getText());
        int softskillmarks = Integer.parseInt(softskills.getText());

        int total = physicsMarks + mathsMarks + chemMarks + aptitudemarks + englishmarks + softskillmarks;

        try{
            Connection con = Connection_code.get_con();
            Statement st = con.createStatement();
            st.executeUpdate("update result set physics = " + physicsMarks + ", maths =" + mathsMarks +", chem ="+ chemMarks +", aptitude = "+ aptitudemarks +", english = "+ englishmarks + ", softskill = " + softskillmarks + ",total = " + total + " where rollno =" + rollno + ";");
            JOptionPane.showMessageDialog(null, "Added Successfully");
            setVisible(false);
            Insert_result frame = new Insert_result();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_submitActionPerformed

    private void physicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_physicsActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "You sure you want to leave this page", "Submit", JOptionPane.YES_NO_OPTION);

        if(response == 0){
            setVisible(false);
        }
    }//GEN-LAST:event_backActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "You sure you want to exit", "Submit", JOptionPane.YES_NO_OPTION);

        if(response == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_exit1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //set back button transparent
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        
        //set exit button transparent
        exit1.setOpaque(false);
        exit1.setContentAreaFilled(false);
        exit1.setBorderPainted(false);
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(Update_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aptitude;
    private javax.swing.JButton back;
    private javax.swing.JTextField chemistry;
    private javax.swing.JTextField english;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField maths;
    private javax.swing.JTextField physics;
    private javax.swing.JTextField rollno_txt;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField softskills;
    private javax.swing.JButton submit;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
