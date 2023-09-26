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
public class Latihan4 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("masukan angka : ");
        int angka = masukan.nextInt();
        String hasil = (angka%2 == 0 ? "genap" : "ganjil");
        System.out.println("merupakan bilangan " + hasil);
    }
}
