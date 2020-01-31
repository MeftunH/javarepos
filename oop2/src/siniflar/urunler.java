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

public class urunler {
    private String urunAd;
    private int ururnadet;
    public static void main(String[] args) {
        System.out.println("");
    }
    public urunler() {
    }

    public urunler(String urunAd, int ururnadet) {
        this.urunAd = urunAd;
        this.ururnadet = ururnadet;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public int getUrurnadet() {
        return ururnadet;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public void setUrurnadet(int ururnadet) {
        this.ururnadet = ururnadet;
    }
    

    
    
}

