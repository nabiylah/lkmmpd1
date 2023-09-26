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
public class Latihan5 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("masukan total belanja : ");
        double belanja = masukan.nextDouble();
        if ( belanja > 100000 ) System.out.println("Selamat! anda mendapatkan voucher belanj:) ");
        System.out.println("Terima kasih");
    }
}
