/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class bkng 
{
static String fno,psid,fcmp,pname,src,dest,dur,arv,dep;
static int uid,stn;
static PreparedStatement prp = null,p1=null,p2=null;
static    ResultSet rs = null;
static    Connection con = null;
public static void fromsearch(int row,int clmn,Object val[][],String pid)
{
    psid=pid;
    try
    {
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5"); 
     String sql1 ="select b_seat from aircraft where f_no='"+fno+"'";
    p1 = con.prepareStatement(sql1);
    rs = p1.executeQuery();
    int seat=0;
    if(rs.next())
    {
    seat = rs.getInt("b_seat");
   // JOptionPane.showMessageDialog(null,"Run: "+sql1);
    }
    int seat2=seat+stn;
    String sql="update aircraft set b_seat= '"+seat2+"' where f_no = '"+fno+"'";
    //JOptionPane.showMessageDialog(null,"Query: "+sql);
    prp = con.prepareStatement(sql);
   int count = prp.executeUpdate();
          if(count>0) 
              seat2=0;
       // JOptionPane.showMessageDialog(null,"seat updated");
    else JOptionPane.showMessageDialog(null,"Not Updated");
   
    for(int r=0;r<stn;r++)
    {
        pname=val[r][0].toString();
        seat+=1;
        String sql2 ="insert into booking (seat_no,f_no,ps_id,u_id,f_comp,p_name,source,Destination,Durationt,arrival,departure) values('"+seat+"', '"+fno+"', '"+psid+"', '"+uid+"', '"+fcmp+"', '"+pname+"', '"+src+"', '"+dest+"', '"+dur+"', '"+arv+"', '"+dep+"')";
    JOptionPane.showMessageDialog(null,"String:\n"+sql2);
        p2 = con.prepareStatement(sql2);
    if(p2.executeUpdate()>0)
    {
        
        new hm();
         new searchf(uid, fno,src, dest).setVisible(false);
         JOptionPane.showMessageDialog(null,"Flight Booked");
    }
    else
        JOptionPane.showMessageDialog(null,"Ticked not Booked");
    }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Error:\n"+e);
    }
    
}
public static void fromhome(int u_id,int st,String f_no,String fname,String fsrc,String fdest,String far,String fdep,String fdu)
{
 uid=u_id;
 stn=st;
 fno =f_no;
 fcmp= fname;
 src=fsrc;
 dest=fdest;
 arv= far;
 dep= fdep;
 dur=fdu;
}
public static int sncount()
{
    return stn;
}
}
