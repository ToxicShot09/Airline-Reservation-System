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


public class deletearea extends javax.swing.JFrame {

     PreparedStatement prp = null;
    ResultSet rs = null;
    Connection con = null;
    /**
     * Creates new form deletearea
     */
    public deletearea() {
        initComponents();
        load();
        this.setSize(625,298);
         ImageIcon ic = new ImageIcon(getClass().getResource("/ars/ic1.png"));
        this.setIconImage(ic.getImage());
        this.setTitle("ARS");
        this.setLocationRelativeTo(null);
    }
public void load()
{
    try
    {
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5");
    String sql="select src,dest from area";
    prp =con.prepareStatement(sql);
    rs = prp.executeQuery();
    while(rs.next())
    {
        String srcc=rs.getString("src");
        srcmbo.addItem(srcc);
           String destt=rs.getString("dest");
        decmbo.addItem(destt);
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        decmbo = new javax.swing.JComboBox();
        srcmbo = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 70, 620, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Delete Area");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 10, 170, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Source");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 97, 68, 35);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Destination");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 110, 104, 22);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Delete");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 180, 109, 37);

        decmbo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Destination" }));
        getContentPane().add(decmbo);
        decmbo.setBounds(450, 100, 157, 35);

        srcmbo.setForeground(new java.awt.Color(51, 51, 51));
        srcmbo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Source", " " }));
        srcmbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcmboActionPerformed(evt);
            }
        });
        getContentPane().add(srcmbo);
        srcmbo.setBounds(73, 97, 181, 35);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/left-arrow.png"))); // NOI18N
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
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 60, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/balloon-1373161_640.jpg"))); // NOI18N
        jLabel3.setText("   ImageIcon ic = new ImageIcon(getClass().getResource(\"/ars/ic1.png\"));         this.setIconImage(ic.getImage());         this.setTitle(\"ARS\");");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 620, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5");
         //
               String ssr= (String) srcmbo.getSelectedItem();
               String des= (String) decmbo.getSelectedItem();
               String sql = "delete from area where src='"+ssr+"' and dest='"+des+"'";
               prp = con.prepareStatement(sql);
               if(prp.execute())
               {
                   load();
                   JOptionPane.showMessageDialog(null,"Area Deleted Successufly");
               }
               else
                    JOptionPane.showMessageDialog(null,"Area Deleted Successufly");
               
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR:-\n"+e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void srcmboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcmboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srcmboActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.setVisible(false);
        bk();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/ars/left-arrow-in-circular-button-black-symbol.png")) ;
        jLabel5.setIcon(ic);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        ImageIcon ic = new ImageIcon(getClass().getResource("/ars/left-arrow.png"));
        jLabel5.setIcon(ic);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

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
            java.util.logging.Logger.getLogger(deletearea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletearea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletearea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletearea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletearea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox decmbo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> srcmbo;
    // End of variables declaration//GEN-END:variables
}