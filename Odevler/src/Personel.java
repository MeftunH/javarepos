/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class Personel {
    private int personelno;
    private String isim;
    private Adres adres;

    public Personel() {
    }

    public Personel(int personelno, String isim, Adres adres) {
        this.personelno = personelno;
        this.isim = isim;
        this.adres = adres;
    }

    public int getPersonelno() {
        return personelno;
    }

    public void setPersonelno(int personelno) {
        this.personelno = personelno;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
    
    
}
