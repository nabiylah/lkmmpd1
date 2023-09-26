/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Bank {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
      
        int saldo, jmluang;
        saldo = 100000;
        System.out.println("Selamat Datang di Bank Unan");
        
        System.out.println("Saldo saat ini : RP." + saldo);
        
        System.out.print("masukan nilai uang yang mau disimpan : RP. ");
        jmluang= masukan.nextInt();
        saldo += jmluang;
        
        
        System.out.println("Saldo saat ini :RP. " + saldo);
        System.out.println("Ambil uang : RP. " + saldo);
        
        saldo-= jmluang;
        
        System.out.println("saldo saat ini : RP. " + saldo);
        
        
        
    }
}
