/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static admin.info.bk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class addarea extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet rs = null;
    Connection con = null;
    
    /**
     * Creates new form addarea
     */
    public addarea() {
        initComponents();
        loadflight();
        this.setSize(437,505);
         ImageIcon ic = new ImageIcon(getClass().getResource("/ars/ic1.png"));
        this.setIconImage(ic.getImage());
        this.setTitle("ARS");
        this.setLocationRelativeTo(null);
    }
    public void loadflight()
    {

    try
    {
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5");
    String sql="select f_no from aircraft";
    prp =con.prepareStatement(sql);
    rs = prp.executeQuery();
    while(rs.next())
    {
        String srcc=rs.getString("f_no");
        fcmbo.addItem(srcc);
    }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"ERROR:\n"+e);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fcmbo = new javax.swing.JComboBox();
        dest = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        src = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        arv = new javax.swing.JTextField();
        dep = new javax.swing.JTextField();
        fare = new javax.swing.JTextField();
        dcmbo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ADD AREA");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 20, 140, 29);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 440, 20);

        fcmbo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Flight" }));
        getContentPane().add(fcmbo);
        fcmbo.setBounds(210, 100, 162, 30);

        dest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destActionPerformed(evt);
            }
        });
        getContentPane().add(dest);
        dest.setBounds(210, 180, 162, 33);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Destination");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 180, 123, 34);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Source");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 140, 93, 31);

        src.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        src.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcActionPerformed(evt);
            }
        });
        getContentPane().add(src);
        src.setBounds(210, 140, 162, 32);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Flight");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 100, 123, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Arrival");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 220, 123, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Day");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 340, 123, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Departure");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 260, 123, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fare");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 300, 123, 30);

        arv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arvActionPerformed(evt);
            }
        });
        getContentPane().add(arv);
        arv.setBounds(210, 220, 162, 33);

        dep.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depActionPerformed(evt);
            }
        });
        getContentPane().add(dep);
        dep.setBounds(210, 260, 162, 30);

        fare.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fareActionPerformed(evt);
            }
        });
        getContentPane().add(fare);
        fare.setBounds(210, 300, 162, 30);

        dcmbo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", " " }));
        getContentPane().add(dcmbo);
        dcmbo.setBounds(210, 340, 162, 30);

        jButton1.setText("ADD Area");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 400, 130, 42);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/left-arrow.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 10, 64, 64);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/girl-balloon-waving-hand-flying-aircraft-little-113735309.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 440, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void destActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destActionPerformed

    private void srcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srcActionPerformed

    private void arvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arvActionPerformed

    private void depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depActionPerformed

    private void fareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fareActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String srcv= src.getText();
 String destv= dest.getText();
 String fno= fcmbo.getSelectedItem().toString();
 String far= fare.getText();
 String ar= arv.getText();
 String de= dep.getText();
 String wk= dcmbo.getSelectedItem().toString();
        try
    {
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5");
    String sql="insert into area values('"+srcv+"', '"+destv+"', '"+fno+"', '"+far+"', '"+ar+"', '"+de+"', '"+wk+"'";
    prp =con.prepareStatement(sql);
    if(prp.execute())
    {
        JOptionPane.showMessageDialog(null,"New Area Inserted Successfully");
    }  
    else
         JOptionPane.showMessageDialog(null,"New Area Not Inserted!");
    
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"ERROR:\n"+e);
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setVisible(false);
        bk();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/ars/left-arrow-in-circular-button-black-symbol.png")) ;
        jLabel10.setIcon(ic);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        ImageIcon ic = new ImageIcon(getClass().getResource("/ars/left-arrow.png"));
        jLabel10.setIcon(ic);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

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
            java.util.logging.Logger.getLogger(addarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arv;
    private javax.swing.JComboBox dcmbo;
    private javax.swing.JTextField dep;
    private javax.swing.JTextField dest;
    private javax.swing.JTextField fare;
    private javax.swing.JComboBox fcmbo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField src;
    // End of variables declaration//GEN-END:variables
}
