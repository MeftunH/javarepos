/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class Threadmain {
    
   
 
    
    public static void main(String[] args) { 
        Birincithread b1=new Birincithread();
        b1.start();
        Thread bt2=new Thread(new ikincithread());
        bt2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main"+i);
            
        }
        
    }
    static class Birincithread extends Thread
    {

        @Override
        public void run() {
              for (int i = 0; i < 100; i++) {
            System.out.println("thread"+i);
            
        }
        }
       
    }
}
