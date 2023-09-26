/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

/**
 *
 * @author USER
 */
public class LuasLingkaran {
    public static void main(String[] args) {
        /*
        double PI = 3.141592;
        double r= 11.78;
        double luas= PI*r*r;
        
        System.out.println(luas);
        System.out.println((int)luas);
        System.out.println(Math.round(luas));
        
        
        hitung volume tabung
        r= 6
        phi= 3.14
        tnggi= 12
        buat hasil menggunakan hasil asli, type-casting ke int, dan math-round
        */ 
      
        double r= 6;
        double phi= 3.14;
        double tinggi= 12;
        double tabung= phi*r*r*tinggi;
        System.out.println("hasil bilangan pecahan : " +tabung);
        System.out.println("hasil bilangan bulat : " +(int)tabung); // tyepe-casting ke (int)
        System.out.println("hasil bilangan pembulatan : " +Math.round(tabung));
    }
    
}
