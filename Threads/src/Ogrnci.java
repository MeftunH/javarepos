/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class Ogrnci {
    private int no;
    private String isim;

    public Ogrnci(int no, String isim) {
        this.no = no;
        this.isim = isim;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Ogrnci() {
    }
    public void bilgial(String isim)
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("ISINADI "+i);
            
        }
    }
}
