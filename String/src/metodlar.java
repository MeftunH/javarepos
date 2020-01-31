/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class metodlar {
    public static void main(String[] args) {
      String s1="MERHABA ali";   
        System.out.println(s1.charAt(2));
        System.out.println(s1.trim());
        String[] dizi=s1.split(" ");//bosluga gor e ayir
        for(String s:dizi)
        {
            System.out.println(s);
        }
    }
   
}
