/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Collections;
 import java.util.HashSet;
/**
 *
 * @author MAFTUN
 */
public class Hashsetoop {
    public static void main(String[] args) {
        HashSet<Ogr> nesne=new HashSet<>();
         Ogr o1=new Ogr(3333,"Ahmet");
        Ogr o2=new Ogr(1111,"Memet");
        Ogr o3=new Ogr(5555,"Zeynep");
        Ogr o4=new Ogr(6666,"Sedat");
        nesne.add(o1);
        nesne.add(o2);
        nesne.add(o3);
        nesne.add(o4);     
           Ogr o5=new Ogr(6666,"Merve");
           nesne.add(o5);
          for(Ogr o:nesne)
          {  
              System.out.println("---");
              System.out.println(o.getTcno());
              System.out.println(o.getIsim());
          }

    }
}
