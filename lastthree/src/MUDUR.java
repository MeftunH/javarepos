/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class MUDUR extends Personel{
    public void iseal(Personel p)
{
 p.iselaindi();
}
    public void terfiettir(Personel p)
    {
        //downcast
        //Ben ogretmen sinifina donusecegim
        ((Ogretmen)p).maasarttir();
    if(p instanceof Ogretmen)
    {
        ((Ogretmen)p).maasarttir();
        
    }
    if(p instanceof Isci)
    {
        System.out.println("Isciler terfi alamaz");
    }
    }
}
