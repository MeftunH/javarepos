
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
public class Odev2 {
    public static void main(String[] args) {
        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Ece");
        isimler.add("Bugra");
        isimler.add("Cete");
        isimler.add("Zeynep");
        Scanner tara=new Scanner(System.in);
        String isim=tara.next();
        for(String s:isimler)
        {
            if(s.equalsIgnoreCase(isim))
            {
                System.out.println("Isim mevcut");
                break;
            }
        }
    }
}
