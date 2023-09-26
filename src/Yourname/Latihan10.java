/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yourname;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Latihan10 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        double diskon = 0;
        System.out.print("total belanja : ");
        int belanja = masukan.nextInt();
        if ( belanja >= 500000 ) {
            diskon = belanja / 100 * 20;
        } else if ( belanja >= 300000) {
            diskon = belanja / 100 * 15; 
        } else if ( belanja >= 100000) {
            diskon = belanja / 100 * 10;
        } else if ( belanja <= 100000) {
            diskon = 0;
        }
        System.out.println("total harga = " + (belanja-diskon));
    }
}
