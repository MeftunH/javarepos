/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siniflar;

/**
 *
 * @author MAFTUN
 */
public class renkler {
    public static final int Beyaz=1111;
     public static final int Siyah=0000;
     public static final int Kirmizi=3333;
     public void boya(int renktercih)
     {
         if(renktercih==1111)
         {
             System.out.println("Beyaza boyandi");
         }
        if(renktercih==0000)
         {
             System.out.println("Siyaha boyandi");
         }
         if(renktercih==3333)
         {
             System.out.println("Kirmiziya boyandi");
         }
     }
}
