/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class Hesaplayici {
    public int bol(int sayi1,int sayi2) throws Exception
    {
        if(sayi2==0) throw new Exception("sifira boluemez");
        return sayi1/sayi2;
        
    }
}
