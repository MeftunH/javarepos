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
public class Subaro extends araba {

    private String motorhacmi;

    public Subaro(String motorhacmi) {
        this.motorhacmi = motorhacmi;
        
    }

    public Subaro(String motorhacmi, String motor, String renk, String vitetipi) {
        super(motor, renk, vitetipi);
        this.motorhacmi = motorhacmi;
         System.out.println("Subao dolu cont. calisti");
    }

    public String getMotorhacmi() {
        return motorhacmi;
    }
public Subaro()
{
    super();
    System.out.println("Subao bos cont. calisti");
}
    public void setMotorhacmi(String motorhacmi) {
        this.motorhacmi = motorhacmi;
    }
    
   

    
    
    
}
