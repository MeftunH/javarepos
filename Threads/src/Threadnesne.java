/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class Threadnesne {
    public static void main(String[] args) {
        Ogrnci kemal=new Ogrnci(23,"Kemal");
         Benimthread is1=new Benimthread("ilk is",kemal);
         is1.start();
           Benimthread is2=new Benimthread("ikiici is",kemal);
           is2.start();

    }
    static class Benimthread extends Thread
    {
        private String isinadi;
        private Ogrnci o;

        public Benimthread(String isinadi, Ogrnci o) {
            this.isinadi = isinadi;
            this.o = o;
        }

        @Override
        public void run() {
            o.bilgial(isinadi);
        }
         
        public Benimthread() {
        }

        public String getIsinadi() {
            return isinadi;
        }

        public void setIsinadi(String isinadi) {
            this.isinadi = isinadi;
        }

        public Ogrnci getO() {
            return o;
        }

        public void setO(Ogrnci o) {
            this.o = o;
        }
        
    }
    
}
