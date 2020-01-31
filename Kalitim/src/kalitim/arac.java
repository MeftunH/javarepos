/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalitim;

/**
 *
 * @author MAFTUN
 */
public class arac {
    private String renk;
    private String vitetipi;

    public arac() {
        super();
         System.out.println("Arac bos cont. calisti");
    }

    public arac(String renk, String vitetipi) {
        this.renk = renk;
        this.vitetipi = vitetipi;
         System.out.println("Arac dolu cont. calisti");
        
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getVitetipi() {
        return vitetipi;
    }

    public void setVitetipi(String vitetipi) {
        this.vitetipi = vitetipi;
    }
    
}
