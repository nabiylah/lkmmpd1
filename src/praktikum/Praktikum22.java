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
public class Praktikum22 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("masukan angka : ");
        int x = masukan.nextInt(); 
        
        String hasil = x % 2 == 0 ? "genap" : "ganjil";
        System.out.println("merupakan bilangan " + hasil);
    }
    
}
