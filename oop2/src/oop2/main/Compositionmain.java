/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.main;

import siniflar.Adresler;
import siniflar.Kisiler;

/**
 *
 * @author MAFTUN
 */
public class Compositionmain {
    public static void main(String[] args) {
        Adresler adres=new Adresler("Istanbul","Fatih");
        Kisiler kisi=new Kisiler("ahmet",2232,adres);
        System.out.println(kisi.getIsim());
        System.out.println(kisi.getTel());
        System.out.println(kisi.getAdres().getIl());
           System.out.println(kisi.getAdres().getIlce());
    }
}
