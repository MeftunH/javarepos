/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package odevler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author MAFTUN
 */
public class Odev1 {
    public static void main(String[] args) {
        Random uret=new Random();
        ArrayList<Integer> sayilar=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int rast=uret.nextInt(101);
            sayilar.add(rast);
        }
        Collections.sort(sayilar);
        for(Integer i:sayilar)
        System.out.println(i);
    }
}
