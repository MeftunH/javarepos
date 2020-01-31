/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author MAFTUN
 */
public class ArraylistMain {
    public static void main(String[] args) {
        ArrayList<String> meyve=new ArrayList<>();
        meyve.add("elma");
        meyve.add("muz");
         meyve.add("portakal");
        System.out.println(meyve.size());
        System.out.println(meyve.get(1));
        meyve.add(1,"mandalina");
        meyve.set(3,"avokado");
        meyve.remove(1);
        Collections.sort(meyve);
        for(String s:meyve)
        {
            System.out.print(s+"--");
        }
    }
}
