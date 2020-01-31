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
public class Adresler {
      private String il;
    private String ilce;

    public Adresler() {
    }
    public Adresler(String il, String ilce) {
        this.il = il;
        this.ilce = ilce;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }
    
}
