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
public class perosnel {
    private String isim;
    private int yaa;
    private static int sayac;
public int sifre;
 public perosnel()
 {
     sayac++;
 }
 

    public perosnel(String isim, int yaa) {
           sayac++; 
           this.isim = isim;
        this.yaa = yaa;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYaa() {
        return yaa;
    }

    public void setYaa(int yaa) {
        this.yaa = yaa;
    }

}
