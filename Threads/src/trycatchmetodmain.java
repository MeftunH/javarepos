
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUN
 */
public class trycatchmetodmain {
    public static void main(String[] args) {
        Hesaplayici h=new Hesaplayici();
        try {
            h.bol(3, 0);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
}
