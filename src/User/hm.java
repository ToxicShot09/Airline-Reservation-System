/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;


class hm {
   static String unm,pnum;
    static int uid,ud;
    static String fs,ss,ds;
public static void gthm(String u_nm,String p_num)
{
    unm=u_nm;
    pnum=p_num;
}
public static void sfun(int uid,String f,String s,String d)
{
    ud=uid;
    fs=f;
    ss=s;
    ds=d;
}

public static void fn()
{
    new searchf(ud,fs,ss,ds).setVisible(true);
}
    public hm() {
        
        new home(unm,pnum).setVisible(true);
    }
    
}
