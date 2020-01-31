/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.HashMap;
import java.util.Set;
/**
 *
 * @author MAFTUN
 */
public class Hashmapmain {
    public static void main(String[] args) {
        HashMap<Integer,String> plaka=new HashMap<>();
        plaka.put(16, "Bursa");
        plaka.put(34, "Ist");
        plaka.put(06, "Angara");
        System.out.println(plaka.get(34));
        Set<Integer> anahtar=plaka.keySet();
        for(Integer i:anahtar)
        {
            System.out.print(plaka.get(i)+" - ");
        }
        HashMap<Integer,Ogr> nesne=new HashMap<>();
          Ogr o1=new Ogr(3333,"Ahmet");
        Ogr o2=new Ogr(1111,"Memet");
        Ogr o3=new Ogr(5555,"Zeynep");
        Ogr o4=new Ogr(6666,"Sedat");
        nesne.put(o1.getTcno(), o1);
        nesne.put(o2.getTcno(),o2);
        nesne.put(o3.getTcno(), o3);
        nesne.put(o4.getTcno(),o4);
        Set<Integer> tcno=nesne.keySet();
        for(Integer no:tcno)
        {
            System.out.println("---");
              System.out.println(nesne.get(no).getTcno());
              System.out.println(nesne.get(no).getIsim());
        }
    }
}
