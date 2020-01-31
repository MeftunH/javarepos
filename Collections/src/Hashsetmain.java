/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.HashSet;
/**
 *
 * @author MAFTUN
 */
public class Hashsetmain {
    public static void main(String[] args) {
        HashSet<String>meyve=new HashSet<>();
        meyve.add("muz");
        meyve.add("elma");
        meyve.add("portakal");
        meyve.add("muz");
     for(String m:meyve)
     {
         System.out.print(m+"--");
     }
    }
}
