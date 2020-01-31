/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class Threadbankamain {
    public static void main(String[] args) {
        Main m=new Main(900);
        BankaislemThread is1=new BankaislemThread(m,"ALI",500);
        BankaislemThread is2=new BankaislemThread(m,"Zeynep",600);
        is1.start();
        is2.start();
    }
    static class BankaislemThread extends Thread
    {

private String isim;
private int tutar;
private Main m=new Main();

        public BankaislemThread() {
        }

        public BankaislemThread(Main m,String isim, int tutar) {
           this.m=m;
            this.isim = isim;
            this.tutar = tutar;
        }


        @Override
        public void run() {
            m.paracek(isim, tutar);
            
        }
        
    }
}
