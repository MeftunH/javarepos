/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class Ogrenciler {
    private int tcno;
    private String isim;

    public Ogrenciler() {
    }

    public Ogrenciler(int tcno, String isim) {
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

    @Override
    public String toString() {
        return isim+"  "+tcno;
    }

    @Override
    public boolean equals(Object obj) {
if(tcno==((Ogrenciler)obj).getTcno())
{
    return true;
}
else
{
    return false;
}
}

    
  
}
