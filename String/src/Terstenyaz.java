
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
public class Terstenyaz {
    public static void main(String[] args) {
        Scanner tarayici=new Scanner(System.in);
        System.out.println("Kelime gir");
        String k=tarayici.next();
        int boyut=k.length();
        char [] dizi=new char[boyut];
        for (int i = 0; i < boyut; i++) {
            dizi[i]=k.charAt(i);
            for (int j = (boyut-1); i>=0; j--) {
                System.out.print(dizi[i]);
            }
        }
    }

}
