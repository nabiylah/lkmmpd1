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
public class Latihan8 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan nama : ");
        String nama = masukan.nextLine();
        System.out.print("Masukan angka : ");
        int angka = masukan.nextInt();
        if ( angka % 2 == 0 ) { System.out.println("GENAP");
        }
        
        else { System.out.println("GANJIL");
    }
    }
}
