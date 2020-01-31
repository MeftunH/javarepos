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
public class ogr {
    public String isim;
    public int numara;
    public void  setIsim(String isim)
            
    {
      this.isim=isim;  
    }
    public String getisim()
    {
    return this.isim;
    }
    public void setno(int numara)
    {
        this.numara= numara;
    }
    public int getno()
    {
        return  this.numara;
    }
    
    public void bilgi()
    {
        System.out.println(isim);
        System.out.println(numara);
    }
}
