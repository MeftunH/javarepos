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
public class araba extends arac{

    public araba() {
        super(null, null);
         System.out.println("Araba bos cont. calisti");
       
    }
    public araba(String motor, String renk, String vitetipi) {
        super(renk, vitetipi);
        this.kasatipi=kasatipi;
         System.out.println("Araba dolu cont. calisti");
    }
    private String kasatipi;
 public void bilgialaraba()
 {
     System.out.println(kasatipi);
     System.out.println(super.getRenk());
     System.out.println(getVitetipi());
 }
}
