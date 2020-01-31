/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okulkayit;

/**
 *
 * @author MAFTUN
 */
public class Ogr {
      private int tcno;
    private String isim;

    public Ogr() {
    }

    public Ogr(int tcno, String isim) {
        this.tcno = tcno;
        this.isim = isim;
    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
