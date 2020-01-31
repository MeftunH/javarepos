
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class Odev4 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        ArrayList<Personel> p=new  ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1 +" "+"personel isim");
            String isim=tara.next();
            System.out.println(i+1 +" "+"personel il");
            String il=tara.next();
            System.out.println(i+1 +" "+"personel ilce");
            String ilce=tara.next();
            Adres yeniadres=new Adres(il,ilce);
            Personel personelyeni=new Personel(i+1,isim,yeniadres);
            p.add(personelyeni);
        }
        for(Personel i:p)
        {
            System.out.println("----------");
            System.out.println("Personel no"+i.getPersonelno());
            System.out.println("Personel no"+i.getIsim());
            System.out.println("Personel no"+i.getAdres().getIl());  
            System.out.println("Personel no"+i.getAdres().getIlce());
                
        }
    }
}
