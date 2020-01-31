/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package okulkayit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MAFTUN
 */
public class Okulkayit {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        ArrayList<Ogr> ogr=new ArrayList<>();
        while(true)
        {
              System.out.println("tcno");
              int no=tara.nextInt();
              System.out.println("Isim");
              String isim=tara.next();
              Ogr ogre=new Ogr(no,isim);
              ogr.add(ogre);
               System.out.println("Cikmak icin 1");
               int sec=tara.nextInt();
               if(sec==1)
               {
                   for(Ogr o:ogr)
                   {
                       System.out.println(o.getTcno()); 
                       System.out.println(o.getIsim()); 
                   }
                   break;
               }
        }
     
        
    }
}
