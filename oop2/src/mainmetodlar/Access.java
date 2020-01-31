/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmetodlar;

import siniflar.ogr;

/**
 *
 * @author MAFTUN
 */
public class Access {
    public static void main(String[] args) {
        ogr o1=new ogr();
         o1.setIsim("Ahemt");
         o1.setno(55);
         System.out.println(o1.getisim());
         System.out.println(o1.getno());
    }
    
}
