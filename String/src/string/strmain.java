/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author MAFTUN
 */
public class strmain {
    public static void main(String[] args) {
        String s1="Merhaba";
        String s2=s1; 
        String s3="Merhaba";   
        String s7="MERHABA";
        if(s7.equalsIgnoreCase(s3))
    {
        System.out.println("esit");
    }
  else
  {
      System.out.println("esit deigl");
  }  StringBuilder stopla=new StringBuilder();
    stopla.append("mweh");
    stopla.append("haba");
        System.out.println(stopla.toString());
    }
  

    
  
}
