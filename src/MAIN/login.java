package MAIN;

import User.home;
import java.awt.Color;
import java.awt.HeadlessException;
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


public class login extends javax.swing.JFrame {

      PreparedStatement prp = null;
    ResultSet rs = null;
    Connection con = null;
    String username;
    String pnumo;
    
    
    public login() {
        initComponents();
   
         ImageIcon ic = new ImageIcon(getClass().getResource("/ars/ic1.png"));
        this.setIconImage(ic.getImage());
        this.setTitle("ARS");
        this.setSize(1107,730);
           jPanel1.setBackground(new Color(0,0,0,30));
           this.setLocationRelativeTo(null);
    }

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
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 30, 130, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 240, 150, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Phone No.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 170, 150, 40);

        unm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unm.setForeground(new java.awt.Color(153, 153, 153));
        unm.setText("Phone Number");
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
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 340, 140, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 100, 550, 10);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Don't have An Account? Register");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, 420, 250, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(300, 120, 550, 480);

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/pexels-photo-91217.jpeg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -20, 1110, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unmActionPerformed
         
    }//GEN-LAST:event_unmActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new first().setVisible(true);
new FAQ().setVisible(false);
this.setVisible(false);
new register().setVisible(false);         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
jLabel5.setForeground(new Color (0,0,200));         
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
    jLabel5.setForeground(new Color (0,0,255));     
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    new first().setVisible(false);
new FAQ().setVisible(false);
this.setVisible(false);
new register().setVisible(true);     
    }//GEN-LAST:event_jLabel5MouseClicked

    private void unmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unmFocusGained
if(unm.getText().trim().toLowerCase().equals("username"))
{
    unm.setText("");
    unm.setForeground(Color.black);
} 
    }//GEN-LAST:event_unmFocusGained

    private void unmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unmFocusLost
if(unm.getText().trim().equals("") || unm.getText().trim().toLowerCase().equals("username"))
{
    unm.setText("username");
    unm.setForeground(new Color(153,153,153));
} 
    }//GEN-LAST:event_unmFocusLost

    private void pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdFocusGained
       String pass = valueOf(pwd.getPassword());
        if(pass.trim().toLowerCase().equals("password"))
{
    pwd.setText("");
    pwd.setForeground(Color.black);
}        

 
    }//GEN-LAST:event_pwdFocusGained

    private void pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdFocusLost
         String pass = valueOf(pwd.getPassword());
        if(pass.trim().equals("") || pass.trim().toLowerCase().equals("password"))
{
    pwd.setText("password");
    pwd.setForeground(new Color(153,153,153));
}
 
    }//GEN-LAST:event_pwdFocusLost

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel11.setBorder(l11);    
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0,0));
        jLabel11.setBorder(l11);    
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel12.setBorder(l11);    
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0,0));
        jLabel12.setBorder(l11);         
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
this.setState(JFrame.ICONIFIED);        // TODO add your handling cabcode here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
System.exit(0);         
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

   
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5");

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
        }
         String user = unm.getText();
        String pass = String.valueOf(pwd.getPassword());

        try {
           
            String sql = "select f_name, password, p_num from user where p_num =? and password=?";// + user + "'";
            prp = con.prepareStatement(sql);//
            prp.setString(1,user);
            prp.setString(2,pass);
            rs = prp.executeQuery();
       
                if(rs.next())
                {
                username = rs.getString("f_name");
                pnumo = rs.getString("p_num");
                home hm = new home(username,pnumo);
                
                hm.setVisible(true);
                //con.commit();
                //rs.close();
                
                con.close();
                 dispose();
                
            } else {
                JOptionPane.showMessageDialog(null, "INVALID UserName or Password wrong", "Error", JOptionPane.WARNING_MESSAGE);
//                JOptionPane.showMessageDialog(null, "User or Password wrong.");
            }

        } catch (HeadlessException | SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Login Failed, ERROR .\n"+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
         
    }//GEN-LAST:event_jPanel1KeyPressed
 
   
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField unm;
    // End of variables declaration//GEN-END:variables
}
