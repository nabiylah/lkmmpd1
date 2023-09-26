/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Praktikum12 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("masukan panjang : ");
        int panjang = masukan.nextInt();
        
            System.out.print("masukan lebar : ");
            int lebar = masukan.nextInt();
            
                System.out.print("masukan tinggi : ");
                int tinggi = masukan.nextInt();
        
        System.out.println("volume balok : " + panjang*lebar*tinggi);
       
    }
}
