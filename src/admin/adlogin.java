/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import User.home;
import MAIN.*;
import java.awt.Color;
import static java.lang.String.valueOf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class adlogin extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet rs = null;
    Connection con = null;
    /**
     * Creates new form adlogin
     */
    public adlogin() {
        initComponents();
          ImageIcon ic = new ImageIcon(getClass().getResource("/ars/ic1.png"));
        this.setIconImage(ic.getImage());
        this.setTitle("ARS");
       // this.setSize(1107,730);
           jPanel1.setBackground(new Color(0,0,0,30));
           //jButton2.setBackground(new Color(0,0,0,30));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        unm = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1106, 738));
        setPreferredSize(new java.awt.Dimension(1106, 738));
        setSize(new java.awt.Dimension(1106, 738));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 20, 270, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 240, 150, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USERNAME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 170, 150, 40);

        unm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unm.setForeground(new java.awt.Color(153, 153, 153));
        unm.setText("username");
        unm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unmFocusLost(evt);
            }
        });
        unm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unmActionPerformed(evt);
            }
        });
        jPanel1.add(unm);
        unm.setBounds(180, 170, 330, 40);

        pwd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pwd.setForeground(new java.awt.Color(153, 153, 153));
        pwd.setText("password");
        pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdFocusLost(evt);
            }
        });
        jPanel1.add(pwd);
        pwd.setBounds(180, 240, 330, 40);

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 340, 140, 50);

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 340, 140, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 100, 550, 10);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(300, 120, 550, 480);

        jLabel13.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/back.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 10, 80, 60);

        jLabel12.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" - ");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(960, 20, 60, 40);

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1030, 20, 45, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/pexels-photo-912050.jpeg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1110, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unmFocusGained
        if(unm.getText().trim().toLowerCase().equals("username"))
        {
            unm.setText("");
            unm.setForeground(Color.black);
        }// TODO add your handling code here:
    }//GEN-LAST:event_unmFocusGained

    private void unmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unmFocusLost
        if(unm.getText().trim().equals("") || unm.getText().trim().toLowerCase().equals("username"))
        {
            unm.setText("username");
            unm.setForeground(new Color(153,153,153));
        }// TODO add your handling code here:
    }//GEN-LAST:event_unmFocusLost

    private void unmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unmActionPerformed

    private void pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdFocusGained
        String pass = valueOf(pwd.getPassword());
        if(pass.trim().toLowerCase().equals("password"))
        {
            pwd.setText("");
            pwd.setForeground(Color.black);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_pwdFocusGained

    private void pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdFocusLost
        String pass = valueOf(pwd.getPassword());
        if(pass.trim().equals("") || pass.trim().toLowerCase().equals("password"))
        {
            pwd.setText("password");
            pwd.setForeground(new Color(153,153,153));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String uname = unm.getText();
        char p[] = pwd.getPassword();
        String pass = new String (p);
        try
        {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5");
     String sql = "select * from adlogin where userid = ? and password = ?";
    
     prp = con.prepareStatement(sql);//
            prp.setString(1,uname);
            prp.setString(2,pass);
      rs = prp.executeQuery();
      //uname.equals(rs.getString("userid"))&& pass.equals(rs.getString("password"))
        if(rs.next())
        {
            
            this.setVisible(false);
            String val = rs.getString("userid");
           // JOptionPane.showMessageDialog(null,"login: "+val);
            new adhome(val).setVisible(true);
        }// TODO add your handling code here
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Eoor:\n"+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new first().setVisible(true);
        new FAQ().setVisible(false);
        this.setVisible(false);
        new register().setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.setState(JFrame.ICONIFIED);        // TODO add your handling cabcode here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel12.setBorder(l11);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0,0));
        jLabel12.setBorder(l11);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel11.setBorder(l11);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0,0));
        jLabel11.setBorder(l11);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        this.setVisible(false);
new first().setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
       Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel13.setBorder(l11);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
     Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0,0));
        jLabel13.setBorder(l11);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseExited

    
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
            java.util.logging.Logger.getLogger(adlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField unm;
    // End of variables declaration//GEN-END:variables
}