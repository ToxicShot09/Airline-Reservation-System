/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;


public class info {
static String id;
public static void adh(String aid)
{
id=aid;
}
public static void bk()
{
    new adhome(id).setVisible(true);
}
    
}
