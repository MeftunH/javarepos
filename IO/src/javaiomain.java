/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.io.File;
         import java.io.*;
/**
 *
 * @author MAFTUN
 */
public class javaiomain {
    public static void main(String[] args) {
    //    filewriteryaz();
     //   fileread();
   // bufferyaz();
        bufferoku();
    }
    public static void bufferyaz() {
          try { 
            File dosya=new File("c:\\Users\\MAFTUN\\Desktop\\SAYISAL\\bufferUDEMY.txt");
        if(!dosya.exists())
        {
            dosya.createNewFile();
        } 
              FileWriter fw =new FileWriter(dosya);
              BufferedWriter yazici=new BufferedWriter(fw);
              yazici.write("sadmmmmmmmmmmmmmmmmmmmmmmmmmmmdiafnnnnn");
              yazici.flush();
              yazici.close();
          }
catch(Exception e)
        {
        
        }
    }
    public static void bufferoku() {
        try {
        File dosya=new File("c:\\Users\\MAFTUN\\Desktop\\SAYISAL\\bufferUDEMY.txt");
        FileReader fr=new FileReader(dosya);
        BufferedReader br=new BufferedReader(fr);
        String satir="";
        StringBuilder sb=new StringBuilder();int bilgi=0;
        while((satir=br.readLine())!=null)
        {
            sb.append(satir+"\n");
            
        }
        br.close();
            System.out.println(sb.toString());
        } catch (Exception e) {
        }
    }
    public static void filewriteryaz()
    {
        try { 
            File dosya=new File("c:\\Users\\MAFTUN\\Desktop\\SAYISAL\\DOCUDEMY.txt");
        if(!dosya.exists())
        {
            dosya.createNewFile();
        } 
        FileWriter yaz=new FileWriter(dosya);
     yaz.write("Merahab");
     yaz.flush();
     yaz.close();
        } catch (Exception e) {
        }
      
    }public static void fileread() {
            try {
                 File dosya=new File("c:\\Users\\MAFTUN\\Desktop\\SAYISAL\\DOCUDEMY.txt");
                 FileReader oku=new FileReader(dosya); //harf harf
                 
                 StringBuilder sd=new StringBuilder();int bilgi=0;
                 while((bilgi=oku.read())!=-1)
                 {
                 sd.append((char)bilgi);
            
                 
                     
                 }  System.out.println("Okunan :"+sd.toString());   oku.close();
            } catch (Exception e) {
            }
    }
}
