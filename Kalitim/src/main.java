
import kalitim.Subaro;
import kalitim.araba;
import kalitim.employer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class main {
    public static void main(String[] args) {
        employer emp=new employer("Murat","Bilisim",3000);
        emp.Showinfo();
        meanjer m=new  meanjer("Mus", "bil", 500);
        m.Showinfo();
        araba a=new araba();
        a.setVitetipi("Otomtik");
        
        Subaro s=new Subaro("1.6V");
        s.setRenk("Mavi");
        s.setVitetipi("Manuel");
        
        
    }
}
