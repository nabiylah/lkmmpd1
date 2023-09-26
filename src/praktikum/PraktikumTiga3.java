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
public class PraktikumTiga3 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Banyak pembelian barang = ");
        int barang = masukan.nextInt();
        
        int cashback;
        if (barang % 7 == 0) {
            cashback = 5500;
        } else {
            cashback = 0;
        }
        
        int tambahanBarang = barang/3;
        if ( barang >= 3 ) { 
            barang = barang+tambahanBarang;
        } else if ( barang < 3 ) {
            barang = barang+0;
        }
        
        System.out.println("Tambahan barang = " + tambahanBarang);
        System.out.println("Cashback = " + cashback);
        System.out.println("Jumlah barang = " + barang);
        
        }
    }

