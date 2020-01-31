
import java.util.ArrayList;
import java.util.Random;
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
public class Odev3 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        Random uret=new Random();
        int sayi=uret.nextInt(101);
        System.out.println(sayi);
        ArrayList<Integer> tahminler=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+"ci tahmin");
            int tahmin=tara.nextInt();
            tahminler.add(tahmin);
            if(tahmin==sayi)
            {
            System.out.println("Tebrikler kazandiniz");
                break;
            }
            if(tahmin>sayi)
            {
            System.out.println("Biraz dus");
                
            }
                        if(tahmin<sayi)
            {
            System.out.println("Biraz cik");   
            }
        }
        System.out.println("-----------");
        System.out.println("Uretilen sayi"+sayi);
        System.out.println("Tahminler");
        for(Integer i:tahminler)
        {
            System.out.print(i+"--");
        }
            
    }
}
