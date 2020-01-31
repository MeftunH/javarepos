/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class okulmain {
    public static void main(String[] args) {
        MUDUR m=new MUDUR();
        Personel ogretmen=new Ogretmen();
        Personel isci=new Isci();
        m.iseal(ogretmen);
        m.iseal(isci);
        m.terfiettir(ogretmen);

    }
}
