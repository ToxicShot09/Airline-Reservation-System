/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import MAIN.first;
import static User.bkng.fromhome;
import static User.hm.sfun;
import java.awt.Color;
import static java.lang.String.valueOf;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class home extends javax.swing.JFrame {
static int f=0,z=0;
  PreparedStatement prp = null;
    ResultSet rs = null;
    Connection con = null;
    String User;  
    String pnumo;
    String upass;
    int uid;
    String t4,t5,t6,t7;
    DefaultTableModel df = new DefaultTableModel();

/**
 * public home()
{
   new home(User,pnumo);
    
}
     * Creates new form home
     */
    public home(String u_nam,String p_no) {
        initComponents();
           ImageIcon ic = new ImageIcon(getClass().getResource("/ars/ic1.png"));
        this.setIconImage(ic.getImage());
        this.setTitle("ARS");
        jPanel1.setBackground(new Color(0,0,0,90));
        jPanel2.setBackground(new Color(0,0,0,90));
       //jPanel3.setBackground(new Color(0,0,0,90));
        jLabel14.setBackground(new Color(0,0,0,90));
        jPanel3.setVisible(false);
         this.setSize(1344,740);
         jDialog1.setSize(336,280);
         jDialog1.setLocationRelativeTo(null);
         this.setLocationRelativeTo(null);
       jPanel1.setVisible(false);
      
       if(u_nam.equals(null) || p_no.equals(null))
       {
           User="abc";
           pnumo="1234567890";
       }
       else
       {
            User = u_nam;
       pnumo = p_no;
       }
      // JOptionPane.showConfirmDialog(null,"user name: "+User+"\n pno: "+pnumo);
       hm.gthm(User,pnumo);
       username.setText(User.toUpperCase());
       sqlq(pnumo);
       
     
    }
    public String week_day()
    {
    DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
 Date cdate = depdate.getDate();
 String ds =(String) df.format(cdate);
    SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
  Date dt1;
  String finalDay = null;
        try {
            dt1 = format1.parse(ds);
            DateFormat format2=new SimpleDateFormat("EEEE"); 
  finalDay=format2.format(dt1);
  //JOptionPane.showMessageDialog(null,"Date: "+ds+"\nWeek of the Day is: "+finalDay);
        } catch (ParseException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
  return finalDay;
    }
    public String durn(String src,String dest)
    {
        long hr = 0;
        String drn;
        try
 {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1 = format.parse(src);
		Date date2 = format.parse(dest);
		long difference = date2.getTime() - date1.getTime();
		 hr =((difference/1000)/3600);
     // JOptionPane.showMessageDialog(null,"Time: "+hr); 
 }
 catch (Exception e)
 {
     JOptionPane.showMessageDialog(null,"Time Error"+e); 
 }
        int h = (int) hr;
        if( h<=0)
            return "1h";
        else
        {
            drn = Integer.toString(h)+"h";
        return drn;
        }
        
    }
    public boolean chkdate()
    {
                  DateFormat dbs = new SimpleDateFormat("YYYY-MM-dd");
 Date ddb = depdate.getDate();
 String db =(String) dbs.format(ddb);
 Date cdbs = new Date();
 String cdb = dbs.format(cdbs);
 String d1[] =db.split("-");
 String d2[] =cdb.split("-");
 int x[] = new int[3];
 int y[] = new int[3];
 int s1=0,s2=0;
 for(int i =0;i<3;i++)
 {
     x[i]=Integer.parseInt(d1[i]);
     y[i]=Integer.parseInt(d2[i]);
 s1=(s1*100)+x[i];
 s2=(s2*100)+y[i];
 }
 int sum =s1-s2;
 if(sum>=0)
        return true;
 else
     return false;
    }

    private home() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void sqlq(String id)
    {
        String sql="select u_id,p_num,password from user where p_num= '"+pnumo+"'";
        try
        {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5");
            prp = con.prepareStatement(sql);
            rs = prp.executeQuery();
            rs.next();
            uid = rs.getInt("u_id");
            upass = rs.getString("password");
            dispose();
            rs.close();
            con.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
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

        jDialog1 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        chp = new javax.swing.JPasswordField();
        chp2 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        depdate = new com.toedter.calendar.JDateChooser();
        destcombo = new javax.swing.JComboBox();
        srccombo = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setName("Change Password"); // NOI18N
        jPanel5.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Confirm Password");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("New Password");

        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("CHANGE PASSWORD");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(chp2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chp, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chp2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6);
        jPanel6.setBounds(10, 10, 320, 240);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );

        jDialog2.setUndecorated(true);
        jDialog2.getContentPane().setLayout(null);
        jDialog2.getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 100, 810, 40);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jDialog2.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 180, 810, 100);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("BOOKING DETAILS");
        jDialog2.getContentPane().add(jLabel19);
        jLabel19.setBounds(270, 20, 290, 40);

        jLabel22.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel22.setText("X");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jDialog2.getContentPane().add(jLabel22);
        jLabel22.setBounds(760, 10, 45, 50);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/sunrise-86008_1280.jpg"))); // NOI18N
        jDialog2.getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 810, 550);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(3, 98, 1341, 26);

        jPanel3.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight Number", "Flight Name", "Source", "Destination", "Arival", "Departure", "Duration", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 10, 985, 310);

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("NEXT");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(850, 330, 110, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(310, 310, 990, 390);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD NEW PASSENGER");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 160, 220, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VIEW PASSENGER");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
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
        jLabel5.setBounds(20, 90, 220, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MY BOOKING");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
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
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 20, 220, 60);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CHANGE PASSWORD");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 230, 220, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(3, 216, 268, 310);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("WELCOME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(530, 20, 196, 48);

        username.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        username.setText("USER");
        getContentPane().add(username);
        username.setBounds(750, 20, 360, 48);

        jLabel4.setBackground(java.awt.Color.blue);
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/icons8-play-button-96.png"))); // NOI18N
        jLabel4.setLabelFor(jPanel1);
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
        jLabel4.setBounds(30, 133, 211, 74);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("From");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(8, 29, 81, 31);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("To");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(523, 29, 81, 31);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Departure Date");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(8, 87, 183, 42);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Passnger");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(523, 90, 183, 45);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        jSpinner1.setName(""); // NOI18N
        jSpinner1.setValue(1);
        jSpinner1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner1MouseClicked(evt);
            }
        });
        jPanel2.add(jSpinner1);
        jSpinner1.setBounds(712, 97, 63, 38);
        jPanel2.add(depdate);
        depdate.setBounds(206, 87, 299, 40);

        destcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT DESTINATION", "Bangalore", "Bagdogra", "Bhubaneswar", "Chandigarh", "Chennai", "Delhi", "Goa", "Hyderabad", "Mumbai", "Patna", "Srinagar" }));
        destcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destcomboActionPerformed(evt);
            }
        });
        jPanel2.add(destcombo);
        destcombo.setBounds(647, 21, 302, 48);

        srccombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT SOURCE", "Bangalore", "Bagdogra", "Bhubaneswar", "Chandigarh", "Chennai", "Delhi", "Goa", "Hyderabad", "Mumbai", "Patna", "Srinagar" }));
        srccombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srccomboActionPerformed(evt);
            }
        });
        jPanel2.add(srccombo);
        srccombo.setBounds(203, 24, 302, 48);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/loupe(1).png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel2.add(jLabel14);
        jLabel14.setBounds(830, 110, 100, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(312, 113, 985, 200);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/logout.png"))); // NOI18N
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
        jLabel13.setBounds(1208, 16, 108, 64);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ars/pexels-photo-723240.jpeg"))); // NOI18N
        jLabel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel12MouseMoved(evt);
            }
        });
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 1340, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/ars/icons8-play-button-96(1).png")) ;
        jLabel4.setIcon(ic);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
ImageIcon ic = new ImageIcon(getClass().getResource("/ars/icons8-play-button-96.png")) ;
        jLabel4.setIcon(ic);      
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
//JOptionPane.showMessageDialog(null,"F= "+f);
        if(f==0)
{
        jPanel1.setVisible(true); 
        f=1;
}
    else
{
 jPanel1.setVisible(false);
 f=0;
}
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
jPanel1.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jSpinner1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner1MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
       ImageIcon ic = new ImageIcon(getClass().getResource("/ars/logout(1).png")) ;
        jLabel13.setIcon(ic);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
       ImageIcon ic = new ImageIcon(getClass().getResource("/ars/logout.png")) ;
        jLabel13.setIcon(ic);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/ars/loupe(2).png")) ;
        jLabel14.setIcon(ic);  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
      ImageIcon ic = new ImageIcon(getClass().getResource("/ars/loupe(1).png")) ;
        jLabel14.setIcon(ic);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       
        jPanel3.setVisible(true);
     
    //   String wk= week_day();
       //JOptionPane.showMessageDialog(null,"WEEK: "+wk);
      
              String nsrc = null;
        String ndest = null;
      String srcd = srccombo.getSelectedItem().toString();
      String dest = destcombo.getSelectedItem().toString();
      boolean vdate = chkdate();
      if(srcd.equals(dest)||srcd.equals("SELECT SOURCE")||dest.equals("SELECT DESTINATION")||srcd.equals(dest))
      {
          JOptionPane.showMessageDialog(null,"Invalid Area Selection");
      }
      else
      {
      
          if(!vdate)
          JOptionPane.showMessageDialog(null,"Invalid Date Selection");
          else
          {
            //  JOptionPane.showMessageDialog(null,"S: "+srcd+" : "+dest);   
              df.getDataVector().removeAllElements();
                        Object columns[] = {"Flight Number", "Flight Company", "Source", "Destination", "Arrival", "Departure","Duration","Fare"};
        df.setColumnIdentifiers(columns);
        jTable1.setModel(df);
        String t1,t2;
      
              String wk= week_day();
              try
              {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5"); 
    
          String sql = "select * from area a, aircraft f where a.wk_day= ? and a.src=? and a.dest=? and a.flt_no =f.f_no";
        
           prp =con.prepareStatement(sql);
           prp.setString(1,wk);
           prp.setString(2,srcd);
           prp.setString(3,dest);
          
        //dispose();
              
              Object columnData[]= new Object[8];
              rs =prp.executeQuery();
       while(rs.next())
              {
                  
                  t4=rs.getString("f_no");
                  columnData[0] =t4;
                  t5=rs.getString("f_name");
                columnData[1] = t5;
                t6=rs.getString("src");
                columnData[2] = t6;
                t7=rs.getString("dest");
                columnData[3] = t7;
                t1=rs.getString("arrival");
                t2=rs.getString("depature");
                columnData[4] = t1;
                columnData[5] = t2;
                String t3 =durn(t1,t2); 
                columnData[6] = t3;
               // JOptionPane.showMessageDialog(null,"List!\n"+" "+t5+" "+t6+" "+t7+" "+t1+" "+t2+" "+t3);
                columnData[7] = rs.getString("fare");            
                df.addRow(columnData); 
       
              }
       con.close();
              }
              catch(SQLException e)
              {
                  JOptionPane.showMessageDialog(null,"ERROR:-\n"+e);
              }
              }
      }
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void destcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destcomboActionPerformed

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
      jPanel4.setBackground(new Color(0,209,255));
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
       jPanel4.setBackground(new Color(0,204,255)); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
       jLabel6.setSize(225,60);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setSize(220,60);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setSize(225,60);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setSize(220,60);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setSize(225,60);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setSize(220,60);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
int seat = (int) jSpinner1.getValue();
        int row = jTable1.getSelectedRow();
        String fno = (jTable1.getValueAt(row, 0).toString());
        String fname = (jTable1.getValueAt(row, 1).toString());
        String fsrc = (jTable1.getValueAt(row, 2).toString());
        String fdest = (jTable1.getValueAt(row, 3).toString());
        String far = (jTable1.getValueAt(row, 4).toString());
        String fdep = (jTable1.getValueAt(row, 5).toString());
        String fdu = durn(far,fdep);
        fromhome(uid,seat,fno,fname,fsrc,fdest,far,fdep,fdu);
        this.setVisible(false);
        
        sfun(uid,fno,fsrc,fdest);
new searchf(uid,fno,fsrc,fdest).setVisible(true);
//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","root1234");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseMoved
 /* String sql="select u_id,p_num from user where p_num= '"+pnumo+"'";
        try
        {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5s");
            prp = con.prepareStatement(sql);
            rs = prp.executeQuery();
            rs.next();
            uid = rs.getInt("u_id");
            dispose();
            con.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }  */      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseMoved

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
   /* try {
      //  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5");       // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
    }*/
    this.setVisible(false);
    new first().setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
this.setVisible(false);
new NewJFrame(uid,3).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
     this.setVisible(false);
new vpasngr(uid).setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
        String code = JOptionPane.showInputDialog(
        this, 
        "Enter Current Password", 
        "Change Password", 
        JOptionPane.WARNING_MESSAGE
    );  
      //  JOptionPane.showMessageDialog(null, "Q pass: "+upass+"\n W pass"+code);
if(upass.equals(code))
{
    jDialog1.setVisible(true);
}
else
{
     JOptionPane.showMessageDialog(null,
    "WRONG PASSWORD\nPlease Try Again",
    "WRONG INPUT",
    JOptionPane.ERROR_MESSAGE);
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String p1 = valueOf(chp.getPassword());
String p2 = valueOf(chp2.getPassword());
ImageIcon ic = new ImageIcon(getClass().getResource("/ars/close.png")) ;
if(p1.equals(p2))
{
    try
    {
   String sql ="UPDATE user SET password = '"+p2+"' WHERE u_id = '"+uid+"'";
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5");
   JOptionPane.showMessageDialog(null,"Query: \n"+sql);
    prp = con.prepareStatement(sql);
    prp.execute();
    
  JOptionPane.showMessageDialog(null,
    "Password Changed",
    "Inane custom dialog",
    JOptionPane.INFORMATION_MESSAGE,
    ic);
    con.close();
     dispose();
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"ERROR on UPDATE:- \n"+e);
    }
    
}
else 
{
   JOptionPane.showMessageDialog(null,
    "PASSWORD Didn't Match\n Please ReEnter Correctly",
    "WRONG INPUT",
   JOptionPane.ERROR_MESSAGE,ic);
}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void srccomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srccomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srccomboActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
try{
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5");
             String sql = "select * from booking where u_id= '"+uid+"'";
             //JOptionPane.showMessageDialog(null,"P "+uid);
             prp = con.prepareStatement(sql);
             rs = prp.executeQuery();
             Object clmn[] = {"PNR","Flight Number","Passenger Name", "Flight Company","Seat Number", "Source", "Destination", "Arrival", "Departure","Duration"};
        df.setColumnIdentifiers(clmn);
        jTable2.setModel(df);
             
             Object columnDatas[] = new Object[10];
             while(rs.next())
             {
              columnDatas[0] = rs.getInt("pnr");
                columnDatas[1] = rs.getString("F_no");
                columnDatas[2] = rs.getString("P_name");
                columnDatas[3] = rs.getString("f_comp");
                columnDatas[4] = rs.getInt("Seat_no");
                columnDatas[5] = rs.getString("source");
                columnDatas[6] = rs.getString("Destination");
                columnDatas[7] = rs.getString("arrival");
                columnDatas[8] = rs.getString("Departure");
                columnDatas[9] = rs.getString("Durationt");
                df.addRow(columnDatas); 
             }
             jDialog2.setVisible(true);
             jDialog2.setSize(820,550);
             jDialog2.setLocationRelativeTo(null);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR :-\n"+e);
        }
         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
jPanel3.setVisible(false); 
//jPanel1.setVisible(false); 
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0,0));
        jLabel22.setBorder(l11);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        Border l11 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel22.setBorder(l11);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
  this.setVisible(false);
        new hm();
//        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseClicked

  
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         java.awt.EventQueue.invokeLater(() -> {
            new home().setVisible(true);
        });
        
        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField chp;
    private javax.swing.JPasswordField chp2;
    private com.toedter.calendar.JDateChooser depdate;
    private javax.swing.JComboBox destcombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox srccombo;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

    public void User(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
