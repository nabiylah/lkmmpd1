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
public class BankIf {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Selamat datang di Bank Unan");
        
        int saldo = 100000;
        System.out.println("Saldo saat ini = " + saldo);
        
        System.out.print("Uang yang ingin disimpan = ");
        int simpan = masukan.nextInt();
        
        int sisa = saldo+simpan;
        System.out.println("saldo saat ini = " + sisa);
        
        System.out.print("Uang yang ingin diambil = ");
        int ambil = masukan.nextInt();
        
        if (ambil > sisa) {
            System.out.println( "\t" + "saldo tidak mencukupi");
        } else if (ambil <= sisa) {
            System.out.println("Sisa saldo = " + (sisa-ambil));
        }
    }
}
