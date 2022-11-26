package MAIN;


import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class FAQ extends javax.swing.JFrame {

    public FAQ() {
        initComponents();
         ImageIcon ic = new ImageIcon(getClass().getResource("/ars/ic1.png"));
        this.setIconImage(ic.getImage());
        this.setTitle("ARS");
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel5.setBorder(l11);
        this.setSize(840,650);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 95, 840, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Frequently Asked Qusetions");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 0, 701, 88);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("TOP CATEGORIES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 240, 222, 43);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("What items are not permitted on a Flight?");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(39, 354, 446, 50);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Booking Status");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jLabel5.setBounds(32, 174, 242, 50);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Fare Rules");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(292, 174, 279, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("TOP QUERIES");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(12, 124, 184, 43);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setText("What if exceed my free baggage weight allowance?");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(39, 297, 446, 50);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("Are there any general advisories that i should keep in mind regarding my baggage?");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jLabel10.setBounds(39, 411, 700, 50);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Wholud will I be able to cancel my ticket and use the same ticket in future?");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jLabel11.setBounds(39, 525, 641, 50);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setText("How can I change my Password?");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jLabel12.setBounds(39, 468, 446, 50);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/left-arrow.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 20, 64, 64);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/aircraft-1314333_1280.png"))); // NOI18N
        jLabel13.setToolTipText("");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 850, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
       Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel9.setBorder(l11);   
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel9.setBorder(l11);   
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel5.setBorder(l11);  
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel6.setBorder(l11);  
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
   JOptionPane.showMessageDialog(null,"    Compressed gases - deeply refrigerated, flammable, non-flammable and poisonous such as butane oxygen, liquid nitrogen, aqualung cylinders and compressed gas cylinders\n" +
"    Corrosives such as acids, alkalis, mercury and wet cell batteries and apparatus containing mercury\n" +
"    Explosives, munitions, fireworks and flares, ammunition including blank cartridges, handguns, fire works, pistol caps\n" +
"    Flammable liquids and solids such as lighter refills, lighter fuel, matches, paints, thinners, fire-lighters, lighters that need inverting before ignition, matches (these may be carried on the person), radioactive material, briefcases and attache case with installed alarm devices\n" +
"    Oxidizing materials such as bleaching powder and peroxides\n" +
"    Poisons and infectious substances such as insecticides, weed-killers and live virus materials\n" +
"    Fish (including other sea food), animals, birds, insects in any form, whether alive and/or dead, and/or frozen and/or dried and/or cooked\n" +
"    Anything that possesses and/or is capable of possessing and/or emitting a conspicuous and/or offensive odour\n" +
"    Other dangerous articles such as magnetized materials, offensive or irritating materials\n" +
"\n" +
"    Dry cell batteries\n" +
"    Knives, scissors, Swiss army knives and other sharp instruments\n" +
"    Toy replicas  of fire arms and ammunition\n" +
"    Weapons such as whips, nan-chakus, baton, or stun gun\n" +
"    Electronic devices which cannot be switched off\n" +
"    Aerosols and liquids*\n" +
"    Any other items which are deemed security hazards by local law");   
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
         Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel10.setBorder(l11);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel12.setBorder(l11);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
       Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel11.setBorder(l11);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
 Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel5.setBorder(l11);     
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
     Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel6.setBorder(l11); 
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
 Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel4.setBorder(l11);         
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
      Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel4.setBorder(l11);
         
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel10.setBorder(l11);        
 
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
      Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel12.setBorder(l11);
         
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel11.setBorder(l11);        
 
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
      JOptionPane.showMessageDialog(null,"The rules and conditions of any reservation depend upon the fare type \nthat the reservation has been made under. \nThese rules and applicable conditions for \na particular fare type are called Fare Rules.");
         
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
JOptionPane.showMessageDialog(null,"Customers carrying more than the allowed baggage limit will be charged the following excess baggage fees at the time of check-in:\n" +
"\n" +
" \n" +
"Domestic Travel \n" +
"INR 400\n" +
"per additional kg \n" +
"(or as per base currency of reservation)\n" +
"per additional kg");        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
JOptionPane.showMessageDialog(null,"Yes, there are many:\n" +
"\n" +
"    Don't accept any packets from unknown persons\n" +
"    Don't leave baggage unobserved at any time, especially at the airport. Unattended baggage may be removed by Airport Security as an object of suspicion\n" +
"    Please declare if you are carrying any arms or explosive substances, prior to Baggage screening/ check-in . Concealment is considered an offence under the Aircraft Act and Rules\n" +
"    Clearly label all baggage items with passenger's name, address and contact details\n" +
"    All prohibited/restricted items are liable to be removed by security and IndiGo may not be in a position to return such removed items");         
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
JOptionPane.showMessageDialog(null,"Visit the Change Password option on the homepage of our Application. ");         
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
JOptionPane.showMessageDialog(null,"You will not be able to use your cancelled ticket in the future\n but you can choose to retain a Credit Note or Credit Shell with Flights and use the remaining amount after deduction of applicable charges \nfor your next reservation. ");         
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
JOptionPane.showMessageDialog(null, "check to Booking Status in Home Page for the current Booking status of your flights");         
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

      this.setVisible(false);
new first().setVisible(true); 
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/ars/left-arrow-in-circular-button-black-symbol.png")) ;
        jLabel8.setIcon(ic);
         
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        ImageIcon ic = new ImageIcon(getClass().getResource("/ars/left-arrow.png"));
        jLabel8.setIcon(ic);
         
    }//GEN-LAST:event_jLabel8MouseExited

   
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
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAQ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
