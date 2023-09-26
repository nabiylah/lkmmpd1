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
public class Latihan7 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("masukan nama : ");
        String nama = masukan.nextLine();
        System.out.print("masukan nilai : ");
        double nilai = masukan.nextDouble();
        if ( nilai >= 60 ) { System.out.println("Selamat saudara " + nama + " anda LULUS ujian ");        
    }
        else {System.out.println("maaf saudara " + nama + " anda GAGAL ");
        }
    }
    }

