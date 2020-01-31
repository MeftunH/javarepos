/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class Trycatchmain {
    public static void main(String[] args) {
        int x=5;
        int y=0;
        int [] dizi =new int [2];
        try {
            System.out.println("Sonuc"+x/y);
            dizi[6]=8;
        }
         catch (ArithmeticException e) {
           
            if(e instanceof ArithmeticException)
            { System.out.println("Sifira bolumez");
               
            }
         }
            catch(ArrayIndexOutOfBoundsException e)
                    {

                System.out.println("Dizi boyutu asildi");
            
                    }
                 
        }
    }

