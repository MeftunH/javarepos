
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class Ogr implements Comparable<Ogr> {
    private int tcno;
    private String isim;

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

    public Ogr(int tcno, String isim) {
        this.tcno = tcno;
        this.isim = isim;
    }

    public Ogr() {
    }

    @Override
    public int compareTo(Ogr o) {
     return new String(this.isim).compareTo(o.getIsim());
    }

    @Override
    public int hashCode() {
        return this.tcno;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.tcno==((Ogr)obj).getTcno())
        {
           return true; 
        }
        else
        {
          return false;  
        }
    }
    
}
